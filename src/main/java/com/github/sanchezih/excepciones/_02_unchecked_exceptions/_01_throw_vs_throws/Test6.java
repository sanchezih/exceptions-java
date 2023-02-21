package com.github.sanchezih.excepciones._02_unchecked_exceptions._01_throw_vs_throws;

import java.util.Scanner;

/**
 * Video: https://www.youtube.com/watch?v=B6h6pIcj0WA
 * 
 * @author ihsanch
 *
 */
public class Test6 {

	/**
	 * Prueba de arrojo de excepciones manualmente
	 */
	public static void main(String[] args) {
		int y, z;
		System.out.print("Ingrese y: ");
		y = new Scanner(System.in).nextInt();
		z = new Calculadora().factorial(y);
		System.out.println("Resultado: " + z);
		System.out.println("Adiós!");
	}

}