package com.github.sanchezih.excepciones._04_checked_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Manejo de excepciones 'checked'
 * 
 * "Error" y sus subclases y "RuntimeException" y sus sibclases son excepciones
 * NO verificadas (unchecked exceptions), por lo tanto no es necesario
 * declararlas en la clausula throws de un metodo constructor si no van a ser
 * manejadas alli con try-catch.
 * 
 * "Exception" y sus subclases son excepciones verificadas (checked exceptions),
 * por lo tanto deben declararse en la clausula throws de un metodo o
 * constructor si no van a ser manejadas alli con try-catch.
 * 
 * @author ihsanch
 *
 */
public class Test8 {

	public static void main(String[] args) {

		VisorDeTXTs visor = new VisorDeTXTs();

		try {
			visor.mostrarTxt("src/main/resources/mensaje_oculto_invalido.txt");
		}

		catch (FileNotFoundException ex) {
			System.out.println("El archivo no existe");
		}

		catch (IOException ex) {
			System.out.println("Error de E/S");
			System.out.println(ex.getMessage());
		}
	}

}