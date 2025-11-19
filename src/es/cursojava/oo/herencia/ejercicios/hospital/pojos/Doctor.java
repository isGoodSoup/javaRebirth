package es.cursojava.oo.herencia.ejercicios.hospital.pojos;

import java.util.Random;

public class Doctor extends EmpleadosHospital {
	private String especialidad;
	private static final Random r = new Random();
	
	public Doctor() {}
	
	public Doctor(String nombre, int edad, String especialidad) {
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
			super.log.trace(super.getNombre() + " está enfermo");
			return true;
		}
		return false;
	}
	
	public void cobrar() {
		super.log.info("El doctor, " + super.getNombre() + " está cobrando");
	}
}
