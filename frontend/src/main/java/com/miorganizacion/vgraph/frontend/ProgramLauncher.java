package com.miorganizacion.vgraph.frontend;

import java.io.File;

/**
 * Launcher principal para ejecutar programas VGraph.
 * Este se puede empaquetar como un JAR ejecutable.
 */
public class ProgramLauncher {

    public static void main(String[] args) {
        // Determinar el ejecutable a lanzar
        String executable = "mi_programa_real.exe";

        // Si se pasa un argumento, usarlo
        if (args.length > 0) {
            executable = args[0];
        }

        // Verificar que existe
        File exeFile = new File(executable);
        if (!exeFile.exists()) {
            System.err.println("Error: No se encuentra el ejecutable: " + executable);
            System.err.println("Asegúrate de compilar primero tu programa desde el IDE.");
            System.exit(1);
        }

        // Lanzar el visualizador
        ProgramRunner runner = new ProgramRunner();
        runner.runAndDisplay(executable);
    }
}

