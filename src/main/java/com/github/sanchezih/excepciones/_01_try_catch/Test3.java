package com.github.sanchezih.excepciones._01_try_catch;

import java.util.Scanner;

/**
 * Video: https://www.youtube.com/watch?v=vhkhmCmNG_4
 * 
 * @author ihsanch
 *
 */
public class Test3 {

	/**
	 * Prueba con manejo de excepciones y sus metodos
	 */
	public static void main(String[] args) {

		int x = 10;
		int y;
		int z;

		System.out.print("Ingrese y: ");

		try {
			y = new Scanner(System.in).nextInt();

			z = x / y; // Divido 'x' sobre 'y' y guardo el resultado en 'z'

			System.out.println("Resultado: " + z);

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace(); // Por default, sale por el flujo de errores "err" (Rojo)
			// ex.printStackTrace(System.out); // Mostrar por el flujo out
		}

		System.out.println("Adios");
	}

}