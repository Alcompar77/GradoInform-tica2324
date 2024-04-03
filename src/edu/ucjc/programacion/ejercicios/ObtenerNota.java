package edu.ucjc.programacion.ejercicios;

import java.util.Scanner; // command + shift + o para automaticamente importar una clase

public class ObtenerNota {

	public static void main(String[] args) {
		// Introducir un dato por consola (de manera dinámica)
		// int nota1 = 9; // declarar e inicializar una variable. Si solo se pone el nombre solo se está
						// declarando
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Introduce una nota: "); // para escribir rapido syso + control + espacio
			int nota = scan.nextInt();

			// con if
			if (nota >= 1 && nota < 5) {
				System.out.println("Suspenso");
			} else if (nota >= 5 && nota < 7) {
				System.out.println("Aprobado");
			} else if (nota >= 7 && nota < 9) {
				System.out.println("Notable");
			} else if (nota >= 9 && nota <= 10) {
				System.out.println("Sobresaliente");
			} else {
				System.out.println("La nota incorrecta");
			}	
			
			// Command + shift + f alinea todo el código
			// con switch
			switch (nota) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Suspenso");
				break;
			case 5:
			case 6:
				System.out.println("Aprobado");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("Nota fuera del rango");
				break;
			}
		}
	}
}
