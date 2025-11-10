package es.cursojava.oo.excepciones.ejercicios.ejercicio3.pojos;

import org.slf4j.Logger;

public class Huesped extends Cliente {

	public Huesped(String nombre, String dni, int edad, TazaCafe taza) {
		super(nombre, dni, edad, taza);
	}

	public Huesped(String nombre, String dni, int edad) {
		super(nombre, dni, edad);
	}
	
	@Override
	public void beberCafe() {
		super.log.info(this.getNombre() + " no puede tomar cafe");
	}

	@Override
	public void setLogger(Logger logger) {
		this.log = logger;
	}
}
