package edu.ucjc.poo.ejercicio1;

public class Universidad {

	public static void main(String[] args) {
		String[] asignaturas1 = { "Matemática", "Física", "Química" };
		Alumno alumno1 = new Alumno("Pedro", "López", 15, "primero básico", "2024", asignaturas1,
				"alumno.email@gmail.com");
		Alumno alumno2 = new Alumno("María", "Perez", 16, "Segundo básico", "2024", asignaturas1,
				"alumno2.email@gmail.com");
		Alumno alumno3 = new Alumno("Josue", "Martinez", 18, "Quinto bachillerato", "2024", asignaturas1,
				"alumno3.email@gmail.com");

		alumno1.mostrarDatos();
		System.out.println();
		alumno2.mostrarDatos();
		System.out.println();
		alumno3.mostrarDatos();

		Alumno[] alumnos = { alumno1, alumno2, alumno3 };

		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
			if (alumno.getEmail() != null) {
				// validarEmail(alumno.getEmail());
				Utilidades_1.validarEmail(alumno.getEmail());

			} else {
				System.out.println("El alumno no tiene un correo asignado");
			}

		}

	}
}

// existe un directorio que contiene muchas clases java.lang, se pueden utilizar de manera directa