package edu.ucjc.programacion.bucles;

public class BucleFor {

	public static void main(String[] args) {
		
		int numero = 0;
		for (int i = 0; i < 5; ++i ) {
		// primera parte del () declaración e inicialización de las variables
		// segunda parte del () condición que se tiene que dar para que el bucle se ejecute
		// ultima parte del () por cada iteración del bucle como va a cambiar la variable
		System.out.println("El valor de i es " + i);
		numero = i;
		}
		System.out.println("Finaliza " + numero);
		
		for (int j = 2; j % 2 == 0; ++j) {
			System.out.println(j);
		}
	}

}
