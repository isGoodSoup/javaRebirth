package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpleadosHospital extends Persona {
	private String turno;
	private final static Logger log = LoggerFactory.getLogger(EmpleadosHospital.class);
	
	public EmpleadosHospital() {}

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
		log.info("El empleado " + super.getNombre() + " está fichando");
	}
	
	public void comer() {
		log.info("El empleado " + super.getNombre() + " está comiendo en el comedor");
	}
}
