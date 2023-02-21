package com.github.sanchezih.excepciones._02_unchecked_exceptions._01_throw_vs_throws;

public class Calculadora {

	/**
	 * 
	 * @param num
	 * @return
	 */
	public int factorial(int num) {

		if (num < 0) {
			throw new ArithmeticException("No se puede calcular el factorial de un numero negativo");
			// Ante la duda: RuntimeException
		}

		if (num > 12) {
			throw new IllegalArgumentException(
					"Por limitaciones tecnicas, no se puede calcular el factorial de un entero mayor que 12");
			// Ante la duda: RuntimeException

		}

		int fact = 1;

		for (int i = 2; i <= num; i++) {
			fact = fact * i;
		}

		return fact;
	}
}