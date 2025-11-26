from flask import Flask, jsonify, request
from flask_cors import CORS
import subprocess
import requests
import time
import os

app = Flask(__name__)
CORS(app)

# Configuración del ESP32
ESP32_IP = "192.168.4.1"  # IP por defecto del ESP32 en modo AP
ESP32_PORT = 80

class VGraphExecutor:
    def __init__(self):
        self.commands = []

    def execute_program(self, exe_path="archivoObjeto.exe"):
        """Ejecuta el programa y captura los comandos"""
        try:
            self.commands = []
            process = subprocess.Popen(
                [exe_path],
                stdout=subprocess.PIPE,
                stderr=subprocess.PIPE,
                text=True
            )

            for line in process.stdout:
                line = line.strip()
                if line:
                    self.commands.append(line)
                    print(f"Comando capturado: {line}")

            process.wait()
            return True
        except Exception as e:
            print(f"Error ejecutando programa: {e}")
            return False

    def send_to_esp32(self):
        """Envía comandos al ESP32"""
        if not self.commands:
            return False, "No hay comandos para enviar"

        try:
            # Enviar lista completa de comandos
            response = requests.post(
                f"http://{ESP32_IP}:{ESP32_PORT}/commands",
                json={"commands": self.commands},
                timeout=10
            )

            if response.status_code == 200:
                return True, f"Enviados {len(self.commands)} comandos"
            else:
                return False, f"Error HTTP {response.status_code}"

        except requests.exceptions.RequestException as e:
            return False, f"Error de conexión: {e}"

executor = VGraphExecutor()

@app.route('/api/execute', methods=['POST'])
def execute_program():
    """Ejecuta el programa VGraph y captura comandos"""
    data = request.get_json()
    exe_path = data.get('exe_path', 'archivoObjeto.exe')

    if not os.path.exists(exe_path):
        return jsonify({
            "success": False,
            "error": f"No se encuentra {exe_path}"
        }), 404

    success = executor.execute_program(exe_path)

    return jsonify({
        "success": success,
        "commands_count": len(executor.commands),
        "commands": executor.commands
    })

@app.route('/api/send', methods=['POST'])
def send_to_esp32():
    """Envía comandos al ESP32"""
    success, message = executor.send_to_esp32()

    return jsonify({
        "success": success,
        "message": message,
        "commands_sent": len(executor.commands) if success else 0
    })

@app.route('/api/execute-and-send', methods=['POST'])
def execute_and_send():
    """Ejecuta el programa y envía al ESP32 automáticamente"""
    data = request.get_json()
    exe_path = data.get('exe_path', 'archivoObjeto.exe')

    # Ejecutar programa
    if not executor.execute_program(exe_path):
        return jsonify({
            "success": False,
            "error": "Error ejecutando programa"
        }), 500

    # Enviar a ESP32
    success, message = executor.send_to_esp32()

    return jsonify({
        "success": success,
        "message": message,
        "commands": executor.commands
    })

@app.route('/api/status', methods=['GET'])
def get_status():
    """Verifica conexión con ESP32"""
    try:
        response = requests.get(f"http://{ESP32_IP}:{ESP32_PORT}/status", timeout=3)
        connected = response.status_code == 200
    except:
        connected = False

    return jsonify({
        "esp32_connected": connected,
        "esp32_ip": ESP32_IP,
        "commands_ready": len(executor.commands)
    })

if __name__ == '__main__':
    print("🚀 API VGraph iniciada en http://localhost:5000")
    print(f"📡 Esperando ESP32 en {ESP32_IP}:{ESP32_PORT}")
    app.run(host='0.0.0.0', port=5000, debug=True)
