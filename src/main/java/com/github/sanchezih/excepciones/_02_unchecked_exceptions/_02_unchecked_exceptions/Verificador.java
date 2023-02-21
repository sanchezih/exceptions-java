package com.github.sanchezih.excepciones._02_unchecked_exceptions._02_unchecked_exceptions;

/**
 * Video: https://www.youtube.com/watch?v=GRYDEA5-glM
 * 
 * @author ihsanch
 *
 */
public class Verificador {

	public static void checkEsNegativo(int x) throws RuntimeException { // El throws seria opcional por ser 'unchecked'

		if (x < 0) {

			throw new RuntimeException("No puede ser negativo");

			// En el caso de lanzar Exception, el throws es obligatorio por ser 'checked'
			// throw new Exception("No puede ser negativo");

		}
	}

}