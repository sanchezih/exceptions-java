package com.github.sanchezih.excepciones._01_try_catch;

import java.util.Scanner;

/**
 * Ante este programa que podria fallar, o no, esta implementacion no maneja
 * excepciones.
 * 
 * Para que falle, probar con 0 o una palabra.
 * 
 * @author ihsanch
 *
 */
public class Test1 {

	public static void main(String[] args) {

		int x = 10; // Siempre vale 10
		int y; // La ingresa el usuario
		int z;

		System.out.print("Ingrese y: ");

		Scanner scanner = new Scanner(System.in);
		y = scanner.nextInt();

		z = x / y; // Divido 'x' sobre 'y' y guardo el resultado en 'z'

		System.out.println("Resultado: " + z);
		System.out.println("Adios");

		scanner.close();
	}

}