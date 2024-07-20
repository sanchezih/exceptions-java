package com.github.sanchezih.excepciones._02_throw;

import java.util.Scanner;

/**
 * Lanzamiento manual de excepciones
 * 
 * @author ihsanch
 *
 */
public class Test6 {

	public static void main(String[] args) {
		int y, z;

		System.out.print("Ingrese y: ");
		y = new Scanner(System.in).nextInt();

		z = new Calculadora().factorial(y);
		System.out.println("Resultado: " + z);

		System.out.println("Adios");

	}

}