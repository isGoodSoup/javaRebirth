package es.cursojava.oo.herencia.ejercicios.hospital;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Enfermo extends Persona {
	private String enfermedad;
	private final static Random r = new Random();
	private final static Logger log = LoggerFactory.getLogger(Enfermo.class);
	
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
		String enf = enfermedades[r.nextInt(enfermedades.length)];
		return enf;
	}
}
