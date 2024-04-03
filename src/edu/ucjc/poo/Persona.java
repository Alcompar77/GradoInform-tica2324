package edu.ucjc.poo;

public class Persona {
	
	/*modificadores de acceso
	 * private ---> solo se puede acceder desde la propia clase donde se definió
	 * Si no se pone nada es de tipo package ---> solo las clases que estén en el mismo paquete que la clase que tenga definida la varibale tienen acceso
	 * protected ----> tienen acceso todas las clases que estén en el mismo paquete o sea una clase hija en otros paquetes
	 * Public ----> acceso desde cualquier sitio
	 */
	
	
	// Atributos
	// Varibales de instancia
	private String nombre;
	private String apellidos; 
	private String dni;
	private int edad; // Tipo primitivo se inicializa a su valor original (0)
	
	
	// Si se crea otro constructor que no sea vacío, pero queremos utilizar uno vacìo debemos de crear un constructor vacio
	// Si no hay otro constructor no es necesario crear el constructor vacío
	
	// Los constructores sirven para darle los valores los objetos en memoria
	//Constructor vacío
	public Persona() {
		
	}
	//Constructor
	public Persona(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre; // devuelve el atributo del objeto al que estoy llamando
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		// Se usa this para acceder al atributo del objeto y asignarle un valor
		// Se utiliza this porque ambas varibales tienen el mismo nombre, para indicar que a la variable
		// de instancia se le asigna la variable nombre
	}
	public String getApellidos() {
		return apellidos;
	}
	// Se utiliza void en el set porque no tiene que devolver nada 
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	//Métodos getter y setter
	// get para recuperar
	// set para recuperar
	//Bloques de código para realizar acciones determiandas 
	
	/*
	 * 1. modificador de acceso
	 * 2. Tipo de dato que me devuelve
	 * 3. Nombre del método (getNombre)
	 * 4. Entre paréntesis los datos que neesita el método para poder funcionar
	 */
	
	// alt + shift + s 
	
	/*
	public String getNombre () {
		return nombre;
	}

	// Se utiliza void porque no queremos que el método nos devuelva algo
	// nombre en este caso es una varible local y no de instacia
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	*/
	
	//Método correr
	
	public void correr() {
		if (edad<18) {
			System.out.println("Corre muy rápido");
		} else if (edad>= 18 && edad < 40) {
			System.out.println("Corre rápido");
		} else {
			System.out.println("Core lento");
		}
	}
	
}
