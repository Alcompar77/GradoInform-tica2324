package edu.ucjc.poo.ejercicio1;

public class Utilidades_1 {
	
	public static void validarEmail (String email) {
		boolean isValido = true;
		String mensaje = "";
		email = email.trim();
		if (email.contains(" ")) {
			isValido = false;
			mensaje += "El email no puede tener espacios en blanco. ";
		}
		if (!email.contains("@") || email.indexOf("@") != email.lastIndexOf("@") + 1) {
			isValido = false;
			mensaje += "El email tiene que tener una @.  ";
		} else {

			if (!email.substring(email.indexOf("@")).contains(".")) {
				isValido = false;
				mensaje += "El email tiene que tener un punto después de la @. ";

			}
		}
		String dominio = email.substring(email.indexOf("@"));
		if (dominio.indexOf(".") < 2) {
			isValido = false;
			mensaje += "El email tiene que tener un punto con una distancia mayor de dos después de la @. ";
		} else {
			String punto = dominio.substring(email.lastIndexOf(".") + 1);
			if (punto.length() > 2 && punto.length() < 5) {
				isValido = false;
				mensaje += "El número de caracteres después del último punto debe de ser mayor que dos y menor que 5. ";
			}
		}
		if (!isValido) {
			System.out.println("El email " + email + " no es valido." + " " + mensaje);
		}
	}


}
