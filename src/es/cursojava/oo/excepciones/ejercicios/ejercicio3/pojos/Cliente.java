package es.cursojava.oo.excepciones.ejercicios.ejercicio3.pojos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.oo.excepciones.ejercicios.ejercicio3.interfaces.Cafeable;

public abstract class Cliente implements Cafeable {
	private String nombre;
	private String dni;
	private int edad;
	private TazaCafe taza;
	protected final Logger log = LoggerFactory.getLogger(getClass().getSimpleName());
	
	public Cliente(String nombre, String dni, int edad, TazaCafe taza) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.taza = taza;
	}
	
	public Cliente(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
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

	public TazaCafe getTaza() {
		return taza;
	}

	public void setTaza(TazaCafe taza) {
		this.taza = taza;
	}
	
	@Override
	public void beberCafe() {
		log.info(this.nombre + " comienza a beber el cafe");
	}
}

