import requests

ESP32_IP = "192.168.4.1"
ESP32_PORT = 80

print("🔍 Probando conexión con ESP32...")
print(f"   IP: {ESP32_IP}:{ESP32_PORT}")
print()

try:
    respuesta = requests.get(
        f"http://{ESP32_IP}:{ESP32_PORT}/status",
        timeout=5
    )
    
    if respuesta.status_code == 200:
        print("✓ ESP32 CONECTADO")
        print()
        print("Respuesta del ESP32:")
        print(respuesta.json())
    else:
        print(f"⚠ ESP32 respondió con código: {respuesta.status_code}")
        
except requests.exceptions.Timeout:
    print("❌ TIMEOUT - El ESP32 no responde")
    print()
    print("Verifica:")
    print("  1. El ESP32 está encendido")
    print("  2. Estás conectado a la red WiFi 'VGraph_ESP32'")
    
except requests.exceptions.ConnectionError:
    print("❌ ERROR DE CONEXIÓN")
    print()
    print("Verifica:")
    print("  1. El ESP32 está encendido")
    print("  2. Estás conectado a la red WiFi 'VGraph_ESP32'")
    print(f"  3. La IP es correcta: {ESP32_IP}")
    
except Exception as e:
    print(f"❌ ERROR: {e}")

print()
input("Presiona ENTER para salir...")
