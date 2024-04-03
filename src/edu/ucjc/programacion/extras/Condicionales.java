package edu.ucjc.programacion.extras;

public class Condicionales {

	public static void main(String[] args) {
		
		int numero = 7;
		boolean mayordoce = numero>12;
		if (mayordoce) {
			System.out.println("El número es mayor que 12");
		}  else if (numero > 9 || numero>12) { // doble condición (and) && 
			// si se usa un solo & evalua ambas condiciones aunque alguna no sea correcta 
			// Si se usan dos && si la primer condición no es cierta la segunda no se comprueba
			System.out.println("Número entre 9 y 12");
		} else {
			System.out.println("Número menor que 9");
		}
		// Para hacer un or se utiliza || 
		// ++ aumenta en uno la variable (es importante el lugar donde se ponga si al inicio o al final)
		// -- Disminuye en uno el valor de la variable
		// += numero = numero + 1
		System.out.println(numero-=1);
		System.out.println(numero);
		
		int entero = 2;
		// el switch solo puede evaluar el valor de una viariable, solo puede ser int, string, 
		// se utiliza para cuando se evalua una variable con distintos valores
		switch (entero) {
		case 1:
		case 2: 
		case 3: System.out.println("El valor esta entre 1 y 3"); break;
		case 9: System.out.println("El valor es 9"); break;
		default: System.out.println("No es ningun valor controlado");
		}
	}

}
