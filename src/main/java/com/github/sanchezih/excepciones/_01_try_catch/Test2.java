package com.github.sanchezih.excepciones._01_try_catch;

import java.util.Scanner;

/**
 * Prueba con manejo de excepciones (un solo catch general)
 * 
 * @author ihsanch
 *
 */
public class Test2 {

	public static void main(String[] args) {

		// Instrucciones que no podrian fallar
		int x = 10;
		int y;
		int z;

		System.out.print("Ingrese y: ");

		// Try: Instrucciones que podrian fallar
		try {

			Scanner scanner = new Scanner(System.in);
			y = scanner.nextInt();

			z = x / y; // Divido 'x' sobre 'y' y guardo el resultado en 'z'

			System.out.println("Resultado: " + z);

			scanner.close();
		}

		// Catch: Logica para capturar excepciones
		catch (Exception ex) {
			System.out.println("Ocurrio un error");
		}

		// Finally: Bloque opcional. Se ejecutara siempre independientemente de si se
		// capturo alguna excepcion o no
		finally {

		}

		// Instrucciones sin posibles excepciones
		System.out.println("Adios");
	}

}