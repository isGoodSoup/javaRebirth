package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Enfermo extends Persona {
	private String enfermedad;
	private final static Logger log = LoggerFactory.getLogger(Enfermo.class);
	
	public Enfermo() {}
	
	public Enfermo(String enfermedad) {
		super();
		this.enfermedad = enfermedad;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	public void comer() {
		log.info(super.getNombre() + " está comiendo en la habitación");
	}
}
