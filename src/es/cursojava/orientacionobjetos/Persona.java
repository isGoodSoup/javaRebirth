package es.cursojava.orientacionobjetos;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	
	public Persona(String nombre, String apellidos, 
			String dni, int edad) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		
		System.out.println(nombre + " " + apellidos + ", " + dni + ", " + edad);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDNI() {
		return this.dni;
	}
	
	public void setDNI(String dni) {
		this.dni = dni;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static void main(String[] args) {
		new Persona("Jose", "Martín", "49235849H", 63);
	}
}
