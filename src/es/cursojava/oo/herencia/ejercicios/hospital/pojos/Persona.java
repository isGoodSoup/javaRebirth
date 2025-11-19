package es.cursojava.oo.herencia.ejercicios.hospital.pojos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.Loggable;

public abstract class Persona extends Loggable {
	private String nombre;
	private int edad;
	protected Logger log = LoggerFactory.getLogger(getClass().getSimpleName());
	
	public Persona() {}
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public abstract void comer();
}
