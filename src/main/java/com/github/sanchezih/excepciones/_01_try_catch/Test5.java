package com.github.sanchezih.excepciones._01_try_catch;

/**
 * Analisis de donde se lanza una excepcion. Se comprueba que, al enviarle el
 * valor 2147483647 como param al metodo incrementExact, en Math.java:964 (Java
 * 11) se hace el throw de ArithmeticException.
 * 
 * Analizar el metodo incrementExact de la clase Math.java (Linea 962)
 * 
 * @author ihsanch
 *
 */
public class Test5 {

	public static void main(String[] args) {

		/*
		 * incrementExact devuelve el argumento incrementado en uno, lanzando una
		 * excepcion si el resultado desborda un int
		 * 
		 * 2147483647 (o 0x7fffffff) es el MAX_VALUE para un int
		 * 
		 * En Java 11, el error se produce en Math.java:964
		 */

		int x = Math.incrementExact(15); // Incremento en 1 el valor del param

		System.out.println(x);
	}

}