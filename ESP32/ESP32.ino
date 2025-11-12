#include <WiFi.h>
#include <WebServer.h>
#include <ArduinoJson.h>

// Configuración WiFi (Modo Access Point)
const char* ssid = "VGraph_ESP32";
const char* password = "vgraph123";

WebServer server(80);

// Almacenamiento de comandos
const int MAX_COMMANDS = 500;
String commands[MAX_COMMANDS];
int commandCount = 0;
int currentCommand = 0;

// Pines del Buzzer
#define BUZZER_PIN 25

void setup() {
  Serial.begin(115200);
  pinMode(BUZZER_PIN, OUTPUT);
  
  // Crear Access Point
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
    delay(100); // Pausa entre comandos
  }
  
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
  server.send(200, "text/plain", "Comandos borrados");
  Serial.println(">>>>>> Comandos reiniciados");
}

void executeCommand(String cmd) {
  Serial.println("Ejecutando: " + cmd);
  
  // Parsear comando
  int colonPos = cmd.indexOf(':');
  if (colonPos == -1) return;
  
  String command = cmd.substring(0, colonPos);
  String value = cmd.substring(colonPos + 1);
  
  command.toUpperCase();
  
  // Interpretar comandos
  if (command == "AVANZA") {
    playTone(440, 200); // Nota A
  }
  else if (command == "GIRADERECHA") {
    playTone(523, 200); // Nota C
  }
  else if (command == "GIRAIZQUIERDA") {
    playTone(392, 200); // Nota G
  }
  else if (command == "COLOR") {
    playColorTone(value);
  }
  else if (command == "ESPERA") {
    delay(value.toInt());
  }
}

void playTone(int frequency, int duration) {
  tone(BUZZER_PIN, frequency, duration);
  delay(duration);
  noTone(BUZZER_PIN);
}

void playColorTone(String color) {
  color.toLowerCase();
  
  if (color == "rojo") playTone(262, 300);
  else if (color == "verde") playTone(330, 300);
  else if (color == "azul") playTone(392, 300);
  else if (color == "amarillo") playTone(440, 300);
}
