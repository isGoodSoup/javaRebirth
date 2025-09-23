package es.cursojava.oo.herencia.ejercicios.hospital;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doctor extends EmpleadosHospital {
	private String especialidad;
	private final static Random r = new Random();
	private final static Logger log = LoggerFactory.getLogger(Doctor.class);
	
	public Doctor() {}
	
	public Doctor(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public boolean diagnosticarPaciente(Paciente paciente) {
		int num = r.nextInt(10) + 1;
		if(num > 8) {
			log.trace(super.getNombre() + " está enfermo");
			return true;
		}
		return false;
	}
}
