package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Enfermero extends EmpleadosHospital {
	private int planta;
	private static final Logger log = LoggerFactory.getLogger(Enfermero.class);
	
	public Enfermero() {}
	
	public Enfermero(String nombre, int edad, int planta) {
		super(nombre, edad);
		this.planta = planta;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}
	
	public void cobrar() {
		log.info("El sanitario, " + super.getNombre() + " está cobrando");
	}

	public void atenderPaciente() {}
}
