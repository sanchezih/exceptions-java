package com.github.sanchezih.excepciones._07_try_with_resources;

/**
 * Uso del try-with-resources (a partir de Java 7)
 * 
 * @author ihsanch
 *
 */
public class Test11 {

	public static void main(String[] args) {
		VisorDeTXTs visor = new VisorDeTXTs();
		visor.mostrarTxt("src/main/resources/mensaje_oculto.txt");
	}

}