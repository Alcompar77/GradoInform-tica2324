package edu.ucjc.poo.ejercicio1;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int edad;
	private String cursando;
	private String curso;
	private String [] asignaturas;
	private String email;
	private String dni;
	
	public Alumno() {
		
	}
	// Constructores
	public Alumno(String nombre, String apellidos, int edad, String cursando, String curso, String[] asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cursando = cursando;
		this.curso = curso;
		this.asignaturas = asignaturas;
	}
	
	public Alumno(String nombre,String apellidos, int edad, String cursando, String curso, String[] asignaturas, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cursando = cursando;
		this.curso = curso;
		this.email = email;
		
	}
	public Alumno(String nombre, String apellidos, String email, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.dni = dni;
	}
	//Métodos
	public String getDni() {
		return dni;
	}
	
	public String getEmail() {
		return nombre;
	}
	
	public void setEmail(String email) {
		this.email = email;
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCursando() {
		return cursando;
	}

	public void setCursando(String cursando) {
		this.cursando = cursando;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public void mostrarDatos1() {
		System.out.println("El nombre del alumno es: " + nombre + " " + apellidos);
		System.out.println("La edad del alumno es: " + edad);
		System.out.println("El alumno está cursando: " + cursando);
		System.out.println("El alumno está en el curso: " + curso);
		System.out.println("Las asignaturas del alumno son: ");
		for (String asignatura : this.asignaturas) {
			System.out.println(asignatura);
			} 
	}
	public void mostrarDatos() {
		System.out.println("El nombre del alumno es: " + nombre + " " + apellidos);
		System.out.println("El correo del alumno es: " + email);
		System.out.println("El DNI del alumno es: " + dni);
	}
	
}

