package com.github.sanchezih.excepciones._02_throw;

public class Calculadora {

	/**
	 * 
	 * @param numero
	 * @return
	 */
	public int factorial(int numero) {

		if (numero < 0) {
			throw new ArithmeticException("No se puede calcular el factorial de un numero negativo");
			// Ante la duda: RuntimeException
		}

		if (numero > 12) { // A partir de 13 comienza a dar resultados erroneos
			throw new IllegalArgumentException(
					"Por limitaciones tecnicas, no se puede calcular el factorial de un entero mayor que 12");
			// Ante la duda: RuntimeException
		}

		int factorial = 1;

		for (int i = 2; i <= numero; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}
}