package edu.ucjc.programacion.ejercicios;

import java.util.Scanner;

public class EjerciciosStrings {
	public static void main(String[] args) {
		/*
		 * Definir un array de strings de longitud 3 con 3 emails Validar que el email
		 * introducido es correcto o no El email no puede tener espacios en blanco El
		 * email debe contener una @ y solo una Después de la arroba de debe de haber al
		 * menos un punto La distancia enrte la @ y el primer punto después del @ tiene
		 * que ser superior a dos El numero de caracteres después del último punto debe
		 * estar entre 2 y 5
		 */
		String[] correos = { "ar.comparini@gmailcom", "pedro.pascal@gmail.com", "maria.antonieta@gmail.cm" };
		for (String correo : correos) { // For it, va de uno en uno para cada elemento del array
			boolean isValido = true;
			String mensaje = "";
			correo = correo.trim();
			if (correo.contains(" ")) {
				isValido = false;
				mensaje += "El email no puede tener espacios en blanco. ";
			}
			if (!correo.contains("@") || correo.indexOf("@") != correo.lastIndexOf("@") + 1) {
				isValido = false;
				mensaje += "El email tiene que tener una @.  ";
			} else {

				if (!correo.substring(correo.indexOf("@")).contains(".")) {
					isValido = false;
					mensaje += "El email tiene que tener un punto después de la @. ";

				}
			}
			String dominio = correo.substring(correo.indexOf("@"));
			if (dominio.indexOf(".") < 2) {
				isValido = false;
				mensaje += "El email tiene que tener un punto con una distancia mayor de dos después de la @. ";
			} else {
				String punto = dominio.substring(correo.lastIndexOf(".") + 1);
				if (punto.length() > 2 && punto.length() < 5) {
					isValido = false;
					mensaje += "El número de caracteres después del último punto debe de ser mayor que dos y menor que 5. ";
				}
			}
			if (!isValido) {
				System.out.println("El email " + correo + " no es valido." + " " + mensaje);
			}
		}

	}

}
