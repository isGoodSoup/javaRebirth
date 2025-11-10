package es.cursojava.oo.herencia.ejercicios.hospital.pojos;

import org.slf4j.Logger;

import es.cursojava.utils.Dexter;

public class Enfermo extends Persona {
	private String enfermedad;
	
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
		super.log.info(super.getNombre() + " está comiendo en la habitación");
	}
	
	public String enfermedadAleatoria() {
		String[] enfermedades = {"covid-22", "muerte", "sifilis", "sida", 
				"gripe aviar", "cáncer", "linfoma", "chron", "cáncer de páncreas", 
				"rabia", "fiebre", "lupus", "gripe", "insuficiencia renal", "ligma"};
		return Dexter.toGetString(enfermedades);
	}

	@Override
	public void setLogger(Logger logger) {
		// TODO Auto-generated method stub
		
	}
}
