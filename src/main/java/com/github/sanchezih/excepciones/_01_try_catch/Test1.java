package com.github.sanchezih.excepciones._01_try_catch;

import java.util.Scanner;

/**
 * Prueba sin manejo de excepciones
 * 
 * Video: https://www.youtube.com/watch?v=d_A95745GCA
 * 
 * @author ihsanch
 *
 */
public class Test1 {

	public static void main(String[] args) {

		int x = 10;
		int y;
		int z;

		System.out.print("Ingrese y: ");
		
		Scanner scanner = new Scanner(System.in);
		y = scanner.nextInt();

		z = x / y; // Divido 'x' sobre 'y' y guardo el resultado en 'z'

		System.out.println("Resultado: " + z);
		System.out.println("Adios!");

		scanner.close();
	}

}