package edu.ucjc.poo.ejercicio2;

import java.util.Scanner;

public class Utilidades {

	/*
	 * Como es estático poniendo el nombre de la clase y del método
	 * Utilidades.pidedatoentero("") para poder utilizarlo en otra clase int opcion
	 * = Utilidades.pideDatoEntero("") para poder imprimir el resultado
	 */
	public static int pideDatoEntero(String texto) {
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		int entero = scan.nextInt();
		return entero;
	}

	public String pideDatoString(String texto) {
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		String palabra = scan.nextLine();
		return palabra;
	}

	public static void pintarMenu(String[] opciones) {
		for (String opcion : opciones) {
			System.out.println(opcion);
	}
	}
	/*
	 * Un método estático no puede acceder a uno dinámico si no se crea el objeto.
	 * Lo estático está siempre disponible para usar, mientras que lo dinámico no.
	 * Los objetos no están listos para utilizar. Si el objeto no existe no se puede
	 * llamar a su método para utilizarlo.
	 */

}