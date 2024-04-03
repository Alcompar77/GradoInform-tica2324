package edu.ucjc.programacion.strings;

public class MetodosStrings {

	public static void main(String[] args) {
		String nombre = "Alessa";
		String nombre1 = "ALESSA";
		String cadena = "   Hola esto    es una prueba";
		String info = "dato1;dato2;dato3";

		// Ver si contiene cierto elemento
		System.out.println(nombre.contains("A"));

		// Verificar que el contenido sea el mismo sin importar si están en mayusculas o
		// minusculas
		System.out.println(nombre.equalsIgnoreCase(nombre1));

		//
		System.out.println("hola");
		System.out.println(nombre.indexOf("s")); // Si se pasa cualquiera que no exista devuelve siempre -1
		// Si hay dos iguales devuelve la primera
		// Empieza a buscar desde la izquierda

		// Devuelve el último elemento que cumpla con la condición que buscamos
		// Empueza desde la derecha a buscar
		System.out.println(nombre.lastIndexOf("s"));

		// Quitar espacios en blanco en los extremos de izquierda y derecha
		System.out.println(cadena.trim());

		// Quita todos los espacios en blanco
		System.out.println(cadena.replace(" ", ""));

		// Hacer una subcandena desde cierto caracter
		// Si se intenta acceder a una posición que no existe
		// Error IndexOutOfBoundsException
		System.out.println(cadena.substring(0)); // desde esa posición hasta el final
		System.out.println(cadena.substring(5, 10)); // Desde 5 hasta 10
		
		// Concatenar arrays
		System.out.println(cadena + " Prueba"); // Se crean dos objetos nuevos, uno para el String Prueba y otro para la concatenación
		System.out.println(cadena.concat(" Prueba"));

		// Separar una cadena de String
		// Devuelve un array con los elementos separados
		String [] datos = info.split(";");
		System.out.println(datos[1]);
	}

}
