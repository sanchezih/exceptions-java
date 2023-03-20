package com.github.sanchezih.excepciones._03_checked_vs_unchecked;

/**
 * Recordar: throw = lanzar, throws = lanza
 * 
 * No es obligatorio el uso de throws en los metodos que podrian lanzar
 * excepciones unchecked
 * 
 * @author ihsanch
 *
 */
public class Verificador {

	public static void checkEsNegativo(int x) /* throws RuntimeException */ { // El throws es opcional porque
																				// RuntimeException es 'unchecked'
		if (x < 0) {
			throw new RuntimeException("No puede ser negativo");
		}
	}

	public static void checkEsNegativo2(int x) throws Exception { // El throws es obligatorio porque Exception es
																	// 'checked' por el compilador
		if (x < 0) {
			throw new Exception("No puede ser negativo");
		}
	}

}