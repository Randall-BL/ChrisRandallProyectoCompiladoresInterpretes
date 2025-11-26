@echo off
REM ===============================================
REM   Script de ejecución: ESP32 + Visualizador
REM ===============================================

echo ===============================================
echo    Ejecutando Programa VGraph
echo ===============================================
echo.

REM Paso 1: Ejecutar y enviar al ESP32
echo [1/2] Ejecutando y enviando al ESP32...
python ejecutar_y_enviar.py archivoObjeto.exe

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo ⚠ Hubo un error en la ejecución
    pause
    exit /b 1
)

echo.
echo [2/2] Abriendo visualizador gráfico...

REM Paso 2: Mostrar el visualizador con el dibujo
java -cp frontend\target\classes com.miorganizacion.vgraph.frontend.ProgramRunner archivoObjeto.exe

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo ⚠ Error al ejecutar el visualizador
    pause
    exit /b 1
)

echo.
echo ===============================================
echo    ✓ Proceso completado exitosamente
echo ===============================================
pause
exit /b 0