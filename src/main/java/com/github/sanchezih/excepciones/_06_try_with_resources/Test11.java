package com.github.sanchezih.excepciones._06_try_with_resources;

/**
 * Video: https://www.youtube.com/watch?v=q8jpgUn_Apk
 * 
 * @author ihsanch
 *
 */
public class Test11 {

	/**
	 * Uso del try-with-resources (a partir de Java 7)
	 */
	public static void main(String[] args) {
		VisorDeTXTs v = new VisorDeTXTs();
		v.mostrarTxt("src\\ar\\charlycimino\\ejemplos\\checkedexceptions\\MENSAJE_OCULTO.txt");
	}

}