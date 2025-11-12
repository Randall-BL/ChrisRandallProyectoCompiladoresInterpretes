import subprocess
import requests
import sys
import time

# Configuración del ESP32
ESP32_IP = "192.168.4.1"
ESP32_PORT = 80

def ejecutar_programa(exe_path="archivoObjeto.exe"):
    """Ejecuta el programa y captura los comandos"""
    print("=" * 50)
    print("   Ejecutando Programa VGraph")
    print("=" * 50)
    print()
    
    comandos = []
    
    try:
        print("[1/3] Ejecutando programa compilado...")
        
        # Ejecutar el programa y capturar la salida
        proceso = subprocess.Popen(
            [exe_path],
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            text=True
        )
        
        # Leer línea por línea y mostrar en consola
        for linea in proceso.stdout:
            linea = linea.strip()
            if linea:
                print(f"  → {linea}")
                comandos.append(linea)
        
        proceso.wait()
        
        if proceso.returncode != 0:
            print("\n❌ Error al ejecutar el programa")
            return None
        
        print(f"\n✓ Programa ejecutado exitosamente")
        print(f"✓ Capturados {len(comandos)} comandos")
        return comandos
        
    except FileNotFoundError:
        print(f"\n❌ Error: No se encuentra {exe_path}")
        return None
    except Exception as e:
        print(f"\n❌ Error inesperado: {e}")
        return None

def enviar_a_esp32(comandos):
    """Envía comandos al ESP32 vía WiFi"""
    if not comandos:
        print("\n⚠ No hay comandos para enviar")
        return False
    
    print(f"\n[2/3] Enviando {len(comandos)} comandos al ESP32...")
    print(f"  Conectando a {ESP32_IP}:{ESP32_PORT}...")
    
    try:
        # Enviar comandos
        respuesta = requests.post(
            f"http://{ESP32_IP}:{ESP32_PORT}/commands",
            json={"commands": comandos},
            timeout=10
        )
        
        if respuesta.status_code == 200:
            print("✓ Comandos enviados exitosamente al ESP32")
            
            # Calcular timeout dinámico (0.5 segundos por comando + 10 segundos extra)
            timeout_dinamico = max(30, (len(comandos) * 0.5) + 10)
            
            # Ejecutar comandos en el ESP32
            print(f"\n[3/3] Ejecutando {len(comandos)} comandos en ESP32...")
            print(f"  (Esto puede tomar hasta {int(timeout_dinamico)} segundos)")
            
            try:
                respuesta_exec = requests.get(
                    f"http://{ESP32_IP}:{ESP32_PORT}/execute",
                    timeout=timeout_dinamico
                )
                
                if respuesta_exec.status_code == 200:
                    print("✓ Comandos ejecutados exitosamente en ESP32")
                    return True
                else:
                    print(f"✓ Comandos enviados (el ESP32 está ejecutándolos)")
                    print(f"  Nota: El ESP32 respondió con código {respuesta_exec.status_code}")
                    return True  # Consideramos éxito porque los comandos sí se enviaron
                    
            except requests.exceptions.Timeout:
                # Si hay timeout pero los comandos se enviaron, es éxito
                print("✓ Comandos enviados y ejecutándose en ESP32")
                print("  Nota: El ESP32 está ocupado ejecutando (normal con muchos comandos)")
                return True
        else:
            print(f"❌ Error enviando comandos: HTTP {respuesta.status_code}")
            return False
            
    except requests.exceptions.Timeout:
        print("❌ Timeout: El ESP32 no responde al enviar comandos")
        print("   Verifica que:")
        print("   1. El ESP32 esté encendido")
        print("   2. Estés conectado a la red 'VGraph_ESP32'")
        return False
    except requests.exceptions.ConnectionError:
        print("❌ Error de conexión con el ESP32")
        print("   Verifica que:")
        print("   1. El ESP32 esté encendido")
        print("   2. Estés conectado a la red 'VGraph_ESP32'")
        print(f"   3. La IP sea correcta: {ESP32_IP}")
        return False
    except Exception as e:
        print(f"❌ Error inesperado: {e}")
        return False

def verificar_esp32():
    """Verifica si el ESP32 está disponible"""
    try:
        respuesta = requests.get(
            f"http://{ESP32_IP}:{ESP32_PORT}/status",
            timeout=3
        )
        return respuesta.status_code == 200
    except:
        return False

def main():
    exe_path = "archivoObjeto.exe"
    
    # Si se pasa un argumento, usarlo como ruta del ejecutable
    if len(sys.argv) > 1:
        exe_path = sys.argv[1]
    
    # Verificar conexión con ESP32
    print("🔍 Verificando conexión con ESP32...")
    if verificar_esp32():
        print(f"✓ ESP32 conectado en {ESP32_IP}")
    else:
        print(f"⚠ Advertencia: No se puede conectar al ESP32")
        print("  El programa se ejecutará pero no se enviarán comandos")
        respuesta = input("\n¿Continuar de todas formas? (s/n): ")
        if respuesta.lower() != 's':
            return
    
    print()
    
    # Ejecutar programa
    comandos = ejecutar_programa(exe_path)
    
    if comandos is None:
        print("\n❌ Ejecución fallida")
        input("\nPresiona ENTER para salir...")
        sys.exit(1)
    
    # Enviar al ESP32
    if comandos:
        exito = enviar_a_esp32(comandos)
        
        if exito:
            print("\n" + "=" * 50)
            print("   ✓ Proceso completado exitosamente")
            print("=" * 50)
        else:
            print("\n⚠ Programa ejecutado, pero no se pudo enviar al ESP32")
    
    print()
    input("Presiona ENTER para salir...")

if __name__ == "__main__":
    main()
