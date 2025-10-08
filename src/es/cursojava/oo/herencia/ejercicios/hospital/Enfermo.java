package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.Gen;

public class Enfermo extends Persona {
	private String enfermedad;
	private static final Logger log = LoggerFactory.getLogger(Enfermo.class);
	
	public Enfermo() {}
	
	public Enfermo(String nombre, int edad, String enfermedad) {
		super(nombre, edad);
		this.enfermedad = enfermedad;
	}
	
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
	
	public String enfermedadAleatoria() {
		String[] enfermedades = {"covid-22", "muerte", "sifilis", "sida", 
				"gripe aviar", "cáncer", "linfoma", "chron", "cáncer de páncreas", 
				"rabia", "fiebre", "lupus", "gripe", "insuficiencia renal", "ligma"};
		return Gen.toGetString(enfermedades);
	}
}
