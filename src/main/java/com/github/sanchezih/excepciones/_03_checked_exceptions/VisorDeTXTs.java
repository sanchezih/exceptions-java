package com.github.sanchezih.excepciones._03_checked_exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VisorDeTXTs {

	/*
	 * Es obligatorio el uso de "throws" en los metodos que podrian lanzar o
	 * propagar excepciones checked
	 */

	public void mostrarTxt(String ruta) throws FileNotFoundException, IOException { // Lanzo 2 tipos de excepciones
		File elArchivo = new File(ruta);
		BufferedReader br = new BufferedReader(new FileReader(elArchivo));
		System.out.println(br.readLine());
	}

}