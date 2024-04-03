package edu.ucjc.programacion.strings;

public class PruebaStrings {

	public static void main(String[] args) {
		// Un string es inmutable, no podemos cambiarle su valor
		String nombre = "Alessa"; // Nombre apunta al objeto principal
		nombre.toUpperCase(); // Crea otro objeto con el string todo en mayúscula
		System.out.println(nombre);

		String nombre2 = "Renata"; // Objeto principal
		nombre2 = nombre2.toUpperCase();
		System.out.println(nombre2);
		// Se elimina el objeto principal porque no es referencido por el garbage
		// collector de java para hacer más espacio en la memoria

		String nombre3 = new String("Alessa"); // Crea un nuevo objeto
		String nombre4 = "Alessa";
		System.out.println(nombre == nombre3); // se compara la posición de memoria cuando utilizamos ==
		System.out.println(nombre == nombre4); // Para ahrorrar espacio detecta que tiene el mismo contenido que nombre
												// por lo que
		// nombre 3 apunta a la misma dirección que nombre por lo que el resultado es
		// True
		System.out.println(nombre.equals(nombre3)); // Para comparar el contenido que tienen los strings

	}

}
