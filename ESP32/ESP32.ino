#include <WiFi.h>
#include <WebServer.h>
#include <ArduinoJson.h>
#include <ESP32Servo.h>

// Configuración WiFi (Modo Access Point)
const char* ssid = "ESP32_Carrito";
const char* password = "12345678";

WebServer server(80);

// Pines del motor
#define IN1 25  // Motor adelante/atrás
#define IN2 26  // Motor adelante/atrás
#define IN3 27  // Motor derecha/izquierda
#define IN4 14  // Motor derecha/izquierda
#define ENA 32  // PWM Motor A (Tracción adelante/atrás)
#define ENB 33  // PWM Motor B (Dirección derecha/izquierda)

// Servo
#define SERVO_PIN 2  // Cambiar a pin 4 (más estable para servos)
Servo miServo;

// Almacenamiento de comandos
const int MAX_COMMANDS = 500;
String commands[MAX_COMMANDS];
int commandCount = 0;
int currentCommand = 0;

// Estado del color actual
int currentColor = 90; // Azul por defecto

// Configuración PWM
const int SPEED_A = 150;  // Velocidad fija motor A (adelante/atrás) - aumentada
const int SPEED_B = 255;  // Velocidad máxima motor B (derecha/izquierda)

// Constante para el giro
const int Giro = 55;
const int SubGiros = 4; 

// Configuración PWM
const int PWM_FREQ = 1000;  // Reducir frecuencia para más potencia (antes 5000)
const int PWM_RESOLUTION = 8;

void setup() {
  setCpuFrequencyMhz(80);  // Reducir de 240MHz a 80MHz
  Serial.begin(115200);
  
  // Configurar pines motores
  pinMode(IN1, OUTPUT);
  pinMode(IN2, OUTPUT);
  pinMode(IN3, OUTPUT);
  pinMode(IN4, OUTPUT);
  
  // Configurar servo primero (librería maneja PWM internamente)
  miServo.attach(SERVO_PIN);
  miServo.write(currentColor);
  delay(500);
  
  // Configurar canales PWM para los motores
  ledcAttach(ENA, PWM_FREQ, PWM_RESOLUTION);
  ledcWrite(ENA, 0);
  
  ledcAttach(ENB, PWM_FREQ, PWM_RESOLUTION);
  ledcWrite(ENB, 0);
  
  // Crear Access Point
  WiFi.setTxPower(WIFI_POWER_11dBm);  // Reducir potencia de transmisión
  WiFi.softAP(ssid, password);

  Serial.println("\n🌐 Access Point iniciado");
  Serial.print("IP: ");
  Serial.println(WiFi.softAPIP());
  Serial.print("Conéctate a: ");
  Serial.println(ssid);
  
  // Rutas del servidor
  server.on("/status", HTTP_GET, handleStatus);
  server.on("/commands", HTTP_POST, handleCommands);
  server.on("/execute", HTTP_GET, handleExecute);
  server.on("/reset", HTTP_GET, handleReset);
  
  server.begin();
  Serial.println("______ Servidor HTTP iniciado");
}

void loop() {
  server.handleClient();
}

void handleStatus() {
  StaticJsonDocument<200> doc;
  doc["status"] = "online";
  doc["commands_loaded"] = commandCount;
  doc["current_command"] = currentCommand;
  doc["ip"] = WiFi.softAPIP().toString();
  
  String response;
  serializeJson(doc, response);
  server.send(200, "application/json", response);
}

void handleCommands() {
  if (!server.hasArg("plain")) {
    server.send(400, "text/plain", "Body vacío");
    return;
  }
  
  String body = server.arg("plain");
  StaticJsonDocument<8192> doc;
  DeserializationError error = deserializeJson(doc, body);
  
  if (error) {
    Serial.println("xxxxxxx Error parseando JSON");
    server.send(400, "text/plain", "JSON inválido");
    return;
  }
  
  // Extraer array de comandos
  JsonArray cmds = doc["commands"];
  commandCount = 0;
  
  for (JsonVariant cmd : cmds) {
    if (commandCount >= MAX_COMMANDS) break;
    commands[commandCount++] = cmd.as<String>();
  }
  
  currentCommand = 0;
  
  Serial.printf("****** Recibidos %d comandos\n", commandCount);
  
  StaticJsonDocument<200> response;
  response["success"] = true;
  response["commands_received"] = commandCount;
  
  String responseStr;
  serializeJson(response, responseStr);
  server.send(200, "application/json", responseStr);
}

void handleExecute() {
  Serial.println(">>>>>> Ejecutando comandos...");
  
  for (int i = 0; i < commandCount; i++) {
    executeCommand(commands[i]);
    delay(500);
  }
  
  stopMotors();
  currentCommand = commandCount;
  
  StaticJsonDocument<200> doc;
  doc["success"] = true;
  doc["executed"] = commandCount;
  
  String response;
  serializeJson(doc, response);
  server.send(200, "application/json", response);
}

void handleReset() {
  commandCount = 0;
  currentCommand = 0;
  stopMotors();
  server.send(200, "text/plain", "Comandos borrados");
  Serial.println(">>>>>> Comandos reiniciados");
}

void executeCommand(String cmd) {
  Serial.println("Ejecutando: " + cmd);
  
  int colonPos = cmd.indexOf(':');
  if (colonPos == -1) return;
  
  String command = cmd.substring(0, colonPos);
  String value = cmd.substring(colonPos + 1);
  
  command.toUpperCase();
  
  if (command == "AVANZA") {
    int distance = value.toInt();
    moveForward(distance);
  }
  else if (command == "RETROCEDE") {
    int distance = value.toInt();
    moveBackward(distance);
  }
  else if (command == "GIRADERECHA") {
    int angle = value.toInt();
    turnRight(angle);
  }
  else if (command == "GIRAIZQUIERDA") {
    int angle = value.toInt();
    turnLeft(angle);
  }
  else if (command == "COLOR") {
    changeColor(value);
  }
  else if (command == "SUBELAPIZ") {
    miServo.write(85);
    delay(500);
  }
  else if (command == "BAJALAPIZ") {
    miServo.write(currentColor);
    delay(500);
  }
  else if (command == "ESPERA") {
    delay(value.toInt());
  }
}

void moveForward(int distance) {
  int duration = (distance * 1000) / 100; // Convertir a milisegundos
  
  // IN1/IN2: adelante
  digitalWrite(IN1, HIGH);
  digitalWrite(IN2, LOW);
  // IN3/IN4: centro (sin girar)
  digitalWrite(IN3, LOW);
  digitalWrite(IN4, LOW);
  
  ledcWrite(ENA, SPEED_A);
  ledcWrite(ENB, 0);
  
  delay(duration);
  stopMotors();
}

void moveBackward(int distance) {
  int duration = (distance * 1000) / 100;
  
  // IN1/IN2: atrás
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, HIGH);
  // IN3/IN4: centro (sin girar)
  digitalWrite(IN3, LOW);
  digitalWrite(IN4, LOW);
  
  ledcWrite(ENA, SPEED_A);
  ledcWrite(ENB, 0);
  
  delay(duration);
  stopMotors();
}

void turnRight(int angle) {
  int duration = (angle * Giro); // Calibración necesaria
  int SubDuration = duration / SubGiros;
  
  for (int i = SubGiros/2; i >= 0; i--) {
    // Primera mitad: adelante girando a la derecha
    digitalWrite(IN1, HIGH);
    digitalWrite(IN2, LOW);
    ledcWrite(ENA, SPEED_A);
    
    digitalWrite(IN3, HIGH);
    digitalWrite(IN4, LOW);
    ledcWrite(ENB, SPEED_B);
    
    unsigned long startTime = millis();
    while (millis() - startTime < SubDuration) {
      delay(10);
    }
    
    // Segunda mitad: atrás girando a la derecha
    digitalWrite(IN1, LOW);
    digitalWrite(IN2, HIGH);
    ledcWrite(ENA, SPEED_A);
    
    digitalWrite(IN3, LOW);
    digitalWrite(IN4, HIGH);
    ledcWrite(ENB, SPEED_B);
    
    startTime = millis();
    while (millis() - startTime < SubDuration) {
      delay(10);
    }
  }
  
  stopMotors();
}

void turnLeft(int angle) {
  int duration = (angle * Giro);
  int SubDuration = duration / SubGiros;
  
  for (int i = SubGiros/2; i >= 0; i--) {
  
    // Primera mitad: adelante girando a la izquierda
    digitalWrite(IN1, HIGH);
    digitalWrite(IN2, LOW);
    ledcWrite(ENA, SPEED_A);
    
    digitalWrite(IN3, LOW);
    digitalWrite(IN4, HIGH);
    ledcWrite(ENB, SPEED_B);
    
    unsigned long startTime = millis();
    while (millis() - startTime < SubDuration) {
      delay(10);
    }
    
    // Segunda mitad: atrás girando a la izquierda
    digitalWrite(IN1, LOW);
    digitalWrite(IN2, HIGH);
    ledcWrite(ENA, SPEED_A);
    
    digitalWrite(IN3, HIGH);
    digitalWrite(IN4, LOW);
    ledcWrite(ENB, SPEED_B);
    
    startTime = millis();
    while (millis() - startTime < SubDuration) {
      delay(10);
    }
  }
  stopMotors();
}

void stopMotors() {
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, LOW);
  digitalWrite(IN3, LOW);
  digitalWrite(IN4, LOW);
  ledcWrite(ENA, 0);
  ledcWrite(ENB, 0);  // Asegurar que ambos PWM estén en 0
}

void changeColor(String color) {
  color.toLowerCase();
  
  if (color == "negro") {
    currentColor = 105;
  }
  else if (color == "azul") {
    currentColor = 90;
  }
  else if (color == "amarillo") {
    currentColor = 75;
  }
  
  //miServo.attach(SERVO_PIN);  // Conectar solo cuando se usa
  miServo.write(currentColor);
  delay(500);
  //miServo.detach();  // Desconectar para ahorrar energía
}