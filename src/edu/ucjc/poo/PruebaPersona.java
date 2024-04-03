package edu.ucjc.poo;

public class PruebaPersona {

	public static void main(String[] args) {

		// Creamos un objeto de tipo persona
		Persona persona1 = new Persona(); // Constructor por defecto, siempre y cuando no este creado otro constructor
		Persona persona2 = new Persona("111A");
		// Los objetos son el new persona, no la variable

		persona1.setApellidos("Perez");

		//persona2.setDni("111B");

		// Cuando un objeto no apunta a nada aparece null
		// No hay ningún nombre por lo que aparece null
		System.out.println(persona2.getNombre());

		System.out.println(persona2.getDni());

		// Aparecería null
		// error NullPointerExcpetion
		Persona persona3;
		persona3 = persona2;

		persona2.setEdad(23);
		System.out.println(persona3.getEdad());

		System.out.println(persona1.getNombre());

		persona1.setNombre("Jaun");

	}

}
