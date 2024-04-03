package edu.ucjc.programacion.ejercicios;

import java.util.Scanner;

public class EjerciciosBucles {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int opcion = 0;

			do {
				System.out.println();
				System.out.println("       MENÚ");
				System.out.println("--------------------");
				System.out.println("1. Mostrar matriz");
				System.out.println("2. Pintar cuadrado");
				System.out.println("3. Serie Fibonacci");
				System.out.println("4. Salir");

				System.out.println("Selecciona una opcion: "); // para escribir rapido syso + control + espacio
				opcion = scan.nextInt();

				switch (opcion) {
				// Matriz 3 x 3
				case 1:
					System.out.println();
					System.out.println("La matriz es: ");
					for (int i = 1; i <= 9; i++) {
						System.out.print(i + " ");
						if (i % 3 == 0) {
							System.out.println();
						}
					}
					break;

				// Cuadrado
				case 2:
					int tamanio = 4;
					for (int i = 0; i < tamanio; i++) {
						for (int j = 0; j < tamanio; j++) {
							if (i == 0 || i == tamanio - 1) {
								System.out.print("*\t");
							} else {
								if (j == 0 || j == tamanio - 1) {
									System.out.print("*\t");
								} else {
									System.out.print("\t");
								}

							}
							System.out.println(" ");
						}
					}
					break;
				/*
				 * Scanner scan1 = new Scanner(System.in);
				 * System.out.println("Tamaño del cuadrado: "); int cuadrado = scan.nextInt();
				 * char caracter = '*'; int i = 1; int j = 0; while (j < cuadrado) { if (i <=
				 * cuadrado) { System.out.print(caracter + " "); i++; } else if (i > cuadrado) {
				 * j += 1; System.out.println(); i = 1; } }
				 */

				// Fibonacci
				case 3:
					System.out.println("Número: ");
					int fibo = scan.nextInt();
					int num1 = 0;
					int num2 = 1;
					System.out.println(num1);
					System.out.println(num2);
					for (int i = 0; i < fibo-2;i++) {
						int suma = num1+num2;
						num1 = num2;
						num2 = suma;
						System.out.println(suma);
					}
					break;

				// Salir del menú
				case 4:
					System.out.println("Adiós");
					break;

				default:
					System.out.println("Opcion incorrecta ");
					break;
				}

			} while (opcion != 4);
		}

	}
}
