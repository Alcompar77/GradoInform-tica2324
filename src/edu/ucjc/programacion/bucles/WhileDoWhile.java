package edu.ucjc.programacion.bucles;

public class WhileDoWhile {

	public static void main(String[] args) {
		// While --> se pone una sola condición
		// La varibale se declara fuera del bucle y la condición dentro del bucle
		// Evalua la condición y luego ejecuta
		int numero = 10;
		while (numero > 7) {
			System.out.println(numero--);
		}

		System.out.println("---------");

		// Do-while
		// Primero ejecuta y luego evalua la condición
		do {
			numero++;
			System.out.println(numero);
		} while (numero < 20);

	}

}
