package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Paciente extends Persona {
	private String[] sintomas;
	private final static Logger log = LoggerFactory.getLogger(Paciente.class);
	
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
		log.info(super.getNombre() + " está comiendo en la cafetería");
	}
}
