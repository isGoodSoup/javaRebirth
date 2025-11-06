package es.cursojava.oo.excepciones.ejercicios.ejercicio2;

public class Alumno {
	private String nombre;
	private String dni;
	private int edad;
	private double notaMedia;
	
	public Alumno(String nombre, String dni, int edad, double notaMedia) 
			throws NotaInvalidaException, IllegalArgumentException {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.notaMedia = notaMedia;
		
		if(this.edad < 0) {
			throw new IllegalArgumentException();
		}
		
		if(this.notaMedia < 0 || this.notaMedia > 10) {
			throw new NotaInvalidaException("La nota " + this.notaMedia + " es invalida");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
}
	
