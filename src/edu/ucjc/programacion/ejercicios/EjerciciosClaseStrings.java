package edu.ucjc.programacion.ejercicios;

import java.util.Scanner;

public class EjerciciosClaseStrings {
	/*
	 * Crear un array de numeros enteros del tamaño que se pida por consola y
	 * solicitar los números por pantalla para las posiciones del array mostrar los
	 * números pares del array
	 */

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Introduce un tamaño del array: ");
			int tamanioArray = scan.nextInt();
			int[] numeros = new int[tamanioArray];

			for (int i = 1; i <= tamanioArray; i++) {
				System.out.println("Introduce la posición: " + i);
				numeros[i - 1] = scan.nextInt();
			}
			System.out.println("---------------------------");
			System.out.println();
			for (int i = 0; i < tamanioArray; i++) {
				if (numeros[i] % 2 == 0) {
					System.out.print(numeros[i] + " ");
				}

			}
		}

	}
}
