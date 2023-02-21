package com.github.sanchezih.excepciones._04_excepciones_propias;

import java.util.Scanner;

/**
 * Video: https://www.youtube.com/watch?v=v43Tl9dM_PE
 * 
 * @author ihsanch
 *
 */
public class Test9 {

	/**
	 * Manejo de excepciones propias
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