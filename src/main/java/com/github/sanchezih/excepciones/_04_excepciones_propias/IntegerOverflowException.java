package com.github.sanchezih.excepciones._04_excepciones_propias;

public class IntegerOverflowException extends RuntimeException {

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