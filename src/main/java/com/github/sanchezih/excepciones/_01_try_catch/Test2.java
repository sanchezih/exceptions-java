package com.github.sanchezih.excepciones._01_try_catch;

import java.util.Scanner;

/**
 * Video: https://www.youtube.com/watch?v=d_A95745GCA
 * 
 * @author ihsanch
 *
 */
public class Test2 {

	/**
	 * Prueba con manejo de excepciones (un solo catch general)
	 */
	public static void main(String[] args) {

		// Instrucciones sin posibles excepciones
		int x = 10;
		int y;
		int z;

		System.out.print("Ingrese y: ");

		// Instrucciones con posibles excepciones
		try {
			y = new Scanner(System.in).nextInt();

			z = x / y; // Divido 'x' sobre 'y' y guardo el resultado en 'z'

			System.out.println("Resultado: " + z);
		}

		// Logica para capturar excepciones
		catch (Exception ex) {
			System.out.println("Ocurrio un error");
		}

		// Bloque opcional. Se ejecuta siempre
		finally {

		}

		// Instrucciones sin posibles excepciones
		System.out.println("Adios");
	}

}