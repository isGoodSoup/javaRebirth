package es.cursojava.oo.herencia.ejercicios.hospital.pojos;

import java.util.Random;

public class Paciente extends Persona {
	private String[] sintomas;
	private static final Random r = new Random();
	
	public Paciente() {}

	public Paciente(String[] sintomas) {
		super();
		this.sintomas = sintomas;
	}
	
	public Paciente(String nombre, int edad) {
		super(nombre, edad);
	}

	public String[] getSintomas() {
		return sintomas;
	}

	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}

	public void comer() {
		super.log.info(super.getNombre() + " está comiendo en la cafetería a las 13:" + minutos());
	}
	
	public int minutos() {
		int minutos = r.nextInt(10, 60);
		return minutos;
	}
}
