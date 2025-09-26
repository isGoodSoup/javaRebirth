package es.cursojava.oo.herencia.ejercicios.hospital;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Paciente extends Persona {
	private String[] sintomas;
	private static final Random r = new Random();
	private static final Logger log = LoggerFactory.getLogger(Paciente.class);
	
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
		log.info(super.getNombre() + " está comiendo en la cafetería a las 13:" + minutos());
	}
	
	public int minutos() {
		int minutos = r.nextInt(10, 60);
		return minutos;
	}
}
