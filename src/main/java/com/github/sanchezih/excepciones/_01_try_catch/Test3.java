package com.github.sanchezih.excepciones._01_try_catch;

import java.util.Scanner;

/**
 * Prueba con manejo de excepciones y sus metodos.
 * 
 * Ver la clase java.lang.Throwable y 2 de sus atributos: message y cause.
 * 
 * Ver las 4 formas de instanciar a la clase Throwable.
 * 
 * Ver clases hijas: Error y Exception.
 * 
 * Error: Indica problemas graves que una aplicacion no deberia tratar de
 * detectar. La mayoria de estos se da en condiciones anormales (Ej. Error de
 * Hardware).
 * 
 * Exception: Una excepcion indica problemas logicos que una aplicacion podria
 * querer capturar y manejar.
 * 
 * Probar el programa dividiendo por 0 e ingresando una palabra.
 * 
 * @author ihsanch
 *
 */
public class Test3 {

	public static void main(String[] args) {

		int x = 10;
		int y;
		int z;

		System.out.print("Ingrese y: ");

		try {
			Scanner scanner = new Scanner(System.in);
			y = scanner.nextInt();

			z = x / y; // Divido 'x' sobre 'y' y guardo el resultado en 'z'

			System.out.println("Resultado: " + z);

			scanner.close();

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage()); // Con getMessage se mostrara el mensaje asociado a la
																// excepcion que se captura

			ex.printStackTrace(); // Por default, sale por el flujo de errores "err" (Rojo)
			// ex.printStackTrace(System.out); // Mostrar por el flujo out
		}

		System.out.println("Adios");
	}

}