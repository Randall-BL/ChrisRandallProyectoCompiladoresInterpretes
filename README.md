# 📘 Guía de Uso - VGraph

## 🎯 Sistema Simplificado

Después de compilar tu programa en el IDE, se generan **solo 2 archivos**:

### 1. **archivoObjeto.exe**
- Ejecutable LLVM compilado
- Imprime comandos a la consola
- Puedes ejecutarlo con: `./archivoObjeto.exe`

### 2. **archivoObjeto.bat**
- **Script wrapper para visualización** ⭐
- Ejecuta el programa y muestra el dibujo en una ventana
- Guarda automáticamente la imagen en `ResultadosDibujos/`

---

## 🚀 Cómo Ejecutar tu Programa

### **Opción 1: Ver el dibujo (RECOMENDADO)**

**Doble clic en:**
```
archivoObjeto.bat
```

O desde terminal (CMD/PowerShell):
```batch
archivoObjeto.bat
```

**Resultado:**
- ✅ Se abre una ventana mostrando el dibujo
- ✅ Visualización en tiempo real del proceso
- ✅ Imagen guardada automáticamente en `ResultadosDibujos/`

---

### **Opción 2: Solo ejecutar (consola)**

```bash
./archivoObjeto.exe
```

**Resultado:**
- Solo imprime comandos en consola
- NO abre ventana de dibujo
- NO guarda imagen

---

## 📂 Estructura de Archivos

Después de compilar:
```
📁 Proyecto/
├── archivoObjeto.exe      ← Ejecutable LLVM
├── archivoObjeto.bat      ← Ejecutar este para ver el dibujo ⭐
└── ResultadosDibujos/     ← Carpeta con imágenes guardadas
    ├── dibujo_20251021_143052.png
    └── dibujo_20251021_150230.png
```

---

## 💡 Flujo de Trabajo

1. **Escribe** tu código en el IDE
2. **Compila** (Menú → Ejecutar → Ejecutar análisis)
3. **Ejecuta** `archivoObjeto.bat` (doble clic)
4. **Visualiza** el dibujo en la ventana que se abre
5. **Encuentra** la imagen guardada en `ResultadosDibujos/`

---

## ✅ Resumen Rápido

| Quieres | Ejecuta |
|---------|---------|
| Ver el dibujo | `archivoObjeto.bat` ⭐ |
| Solo consola | `./archivoObjeto.exe` |

**¡Así de simple!**

