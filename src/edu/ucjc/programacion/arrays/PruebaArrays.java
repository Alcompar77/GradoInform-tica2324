package edu.ucjc.programacion.arrays;

public class PruebaArrays {

	public static void main(String[] args) {
		// no se pueden agregar nuevos elementos a los ararys o cambiar su valor 
		int [] numeros = {1, 2, 3, 4}; // se usa cuando se sabe que elementos se van a guardar 
		int [] numeros2 = new int [6]; // se usa cuando se sabe la cantidad de elementos que se van agregar
		// numeros2 = numeros; numeros2 ahora apunta a la dirección de numeros por lo que el array donde estan los elementos no cambia de tamaño
		
		
		// Acceder a los valores dentro de un array
		System.out.println(numeros2[2]);
		
		//Asignar valores a las posiciones
		numeros2[2] = 4;
		System.out.println(numeros2[2]);
		System.out.println(numeros2.length); // para ver la longitud del array
		System.out.println(numeros.length); 
	}

}
