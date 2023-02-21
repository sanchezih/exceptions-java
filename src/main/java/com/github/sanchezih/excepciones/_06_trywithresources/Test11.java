package com.github.sanchezih.excepciones._06_trywithresources;

public class Test11 {

	/**
	 * Uso del try-with-resources (a partir de Java 7)
	 */
	public static void main(String[] args) {
		VisorDeTXTs v = new VisorDeTXTs();
		v.mostrarTxt("src\\ar\\charlycimino\\ejemplos\\checkedexceptions\\MENSAJE_OCULTO.txt");
	}

}