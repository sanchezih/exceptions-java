package com.github.sanchezih.excepciones._05_excepciones_propias;

/**
 * Creo mi propia excecpion unchecked (Heredando de RuntimeException)
 * 
 * @author ihsanch
 *
 */
public class IntegerOverflowException extends RuntimeException {

	// Genero los 4 constructores respetando las mismas firmas de las superclases.
	// En este caso, no tiene mucho sentido esta clase ya que no agrega nada.

	public IntegerOverflowException() {
	}

	public IntegerOverflowException(String message) {
		super(message);
	}

	public IntegerOverflowException(String message, Throwable cause) {
		super(message, cause);
	}

	public IntegerOverflowException(Throwable cause) {
		super(cause);
	}

}