package es.cursojava.oo.herencia.ejercicios.hospital;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class EmpleadosHospital extends Persona {
	private String turno;
	private static final Random r = new Random();
	private static final Logger log = LoggerFactory.getLogger(EmpleadosHospital.class);
	
	public EmpleadosHospital() {}
	
	public EmpleadosHospital(String nombre, int edad) {
		super(nombre, edad);
	}

	public EmpleadosHospital(String turno) {
		super();
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void fichar() {
		log.info("El empleado " + super.getNombre() + " está fichando al turno de " + turnoAleatorio());
	}
	
	public void comer() {
		log.info("El empleado " + super.getNombre() + " está comiendo en el comedor a las 13:" + minutos());
	}
	
	public abstract void cobrar();

	public String turnoAleatorio() {
		String[] turnos = {"mañana", "tarde", "noche"};
		String turno = turnos[r.nextInt(3)];
		return turno;
	}
	
	public int minutos() {
		int minutos = r.nextInt(10, 60);
		return minutos;
	}
}
