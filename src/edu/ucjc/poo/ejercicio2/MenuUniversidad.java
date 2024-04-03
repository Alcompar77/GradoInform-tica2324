package edu.ucjc.poo.ejercicio2;

import java.util.Scanner;

import edu.ucjc.poo.ejercicio1.Alumno;

//	Meter en la clase alumno un Dni
//1. Crear Universidad --> preguntar número de alumnos y crear un array de alumnos
//2. Insertar alumnos  --> Pedir todos los datos de todos los alumnos 
//3. Buscar Alumno ----> preguntar por el DNI y mostrar su información
//4. Salir ---> dejar el menu 

public class MenuUniversidad {
	Alumno[] alumnos; // variable de instancia no hay que inicializarla y se puden acceder desde cualquier sitio
	int num2;
	public static void main(String[] args) {
		int opcion = 0; // variables locales son las que están dentro de un método y se tienen que
						// inicializar antes de utilizarlas.
		MenuUniversidad menu = new MenuUniversidad();
		do {
			String[] opciones = { "1. Crear Universidad", "2. Insertar alumnos", "3. Buscar Alumno", "4. Salir" };
			Utilidades.pintarMenu(opciones);

			opcion = Utilidades.pideDatoEntero("Selecciona una opción: ");

			switch (opcion) {
			case 1:
				menu.crearUniversidad();
				break;
			case 2:
				menu.insertarAlumnos();
				break;
			case 3:
				menu.mostrarInfo();
				break;
			case 4:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opción incorrecta");
			}

		} while (opcion != 4);
	}

	private void crearUniversidad() {
		int numAlumnos = Utilidades.pideDatoEntero("Introduce el número de alumnos: ");
		
		alumnos = new Alumno[numAlumnos];
	}
	
	private void insertarAlumnos() {
		for (Alumno alumno : alumnos) {
			System.out.println("Introduce el nombre del alumno: " + alumno.getNombre());
			System.out.println("Introduce el apellido del alumno: " + alumno.getApellidos());
			System.out.println("Introduce el email del alumno: " + alumno.getEmail());
			System.out.println("Introduce el dni del alumno: " + alumno.getDni());
		}
			
	}
	
	private void mostrarInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el DNI: ");
		for (Alumno alumno : alumnos) {
			alumno.mostrarDatos();
			
		}
		
	}
}