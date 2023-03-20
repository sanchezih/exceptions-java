package com.github.sanchezih.excepciones._05_excepciones_propias;

import java.util.Scanner;

/**
 * Manejo de excepciones propias
 * 
 * @author ihsanch
 *
 */
public class Test9 {
	public static void main(String[] args) {
		int y, z;
		System.out.print("Ingrese y: ");
		y = new Scanner(System.in).nextInt();
		z = new Calculadora().factorial(y);
		System.out.println("Resultado: " + z);
		System.out.println("Adios");
	}

}