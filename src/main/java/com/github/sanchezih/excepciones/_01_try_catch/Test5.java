package com.github.sanchezih.excepciones._01_try_catch;

/**
 * Video: https://www.youtube.com/watch?v=B6h6pIcj0WA
 * 
 * @author ihsanch
 *
 */
public class Test5 {

	/**
	 * Donde se lanza la excepcion?
	 */
	public static void main(String[] args) {

		/*
		 * incrementExact devuelve el argumento incrementado en uno, lanzando una
		 * excepcion si el resultado desborda un int
		 * 
		 * 2147483647 (o 0x7fffffff) es el MAX_VALUE
		 * 
		 * En Java 11, el error se produce en Math.java:964
		 */

		int x = Math.incrementExact(2147483647);

		System.out.println(x);
	}

}