package com.github.sanchezih.excepciones._06_finally;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VisorDeTXTs {

	/**
	 * Metodo que muestra el contenido del archivo recibido como param
	 * 
	 * @param ruta
	 */
	public void mostrarTxt(String ruta) {
		File elArchivo = new File(ruta);
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(elArchivo));
			System.out.println(br.readLine());
		}

		catch (IOException e) {
			System.out.println("Error de E/S: " + e.getMessage());

			// Simulo que hubo otro problema. Si el br.close() se hubiese hecho fuera del
			// finally, dicho metodo no se hubiese ejecutado dado que aqui tenemos un throw
			throw new RuntimeException("Error inesperado en el catch");
		}

		// Independientemente de si ejecutan con exito las lineas dentro del try o si se
		// captura una IOException, debemos cerrar el recurso. El uso del finally nos
		// evita repetir codigo dentro de try dentro de catch.
		finally {
			try {
				br.close();
			} catch (IOException ex) {
				System.out.println("No se pudo liberar el br");
			}
		}
	}
}