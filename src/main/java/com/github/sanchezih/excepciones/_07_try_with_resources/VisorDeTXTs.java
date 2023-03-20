package com.github.sanchezih.excepciones._07_try_with_resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VisorDeTXTs {

	public void mostrarTxt(String ruta) {

		File elArchivo = new File(ruta);

		try (BufferedReader br = new BufferedReader(new FileReader(elArchivo));) {

			// Dado que BufferedReader implementa la interface AutoCloseable, es correcto
			// poner esta linea dentro del try
			System.out.println(br.readLine());
			
		} catch (IOException e) {
			System.out.println("Error de E/S: " + e.getMessage());
			throw new RuntimeException("Error inesperado en el catch");
		}
	}
}