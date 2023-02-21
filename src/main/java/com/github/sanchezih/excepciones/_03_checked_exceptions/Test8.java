package com.github.sanchezih.excepciones._03_checked_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Video https://www.youtube.com/watch?v=We22j2o8X8U
 * 
 * @author ihsanch
 *
 */
public class Test8 {

	/**
	 * Manejo de excepciones 'checked'
	 */
	public static void main(String[] args) {

		VisorDeTXTs v = new VisorDeTXTs();

		try {
			v.mostrarTxt(
					"src\\main\\java\\com\\github\\sanchezih\\excepciones\\_03_checked_exceptions\\MENSAJE_OCULTO.txt");
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