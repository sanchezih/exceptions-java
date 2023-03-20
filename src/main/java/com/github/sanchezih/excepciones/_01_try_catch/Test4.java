package com.github.sanchezih.excepciones._01_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Prueba con manejo de excepciones (multicatch)
 * 
 * @author ihsanch
 *
 */
public class Test4 {

	public static void main(String[] args) {

		int x = 10;
		int y;
		int z;

		System.out.print("Ingrese y: ");

		try {
			Scanner scanner = new Scanner(System.in);
			y = scanner.nextInt();

			z = x / y; // Divido 'x' sobre 'y' y guardo el resultado en 'z'

			System.out.println("Resultado: " + z);

			scanner.close();

		}

		// Hay que importarla porque no esta en java.lang sino en java.util
		catch (InputMismatchException ime) {
			System.out.println("No es un entero");

		}

		catch (ArithmeticException ae) {
			System.out.println("No se puede dividir por cero");

		}

		// Esta va ultima. Si ocurre una excepcion no prevista, este ultimo catch la
		// capturara
		catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace(System.out);
		}

		System.out.println("Adios");
	}

}