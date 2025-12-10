package es.cursojava.oo.herencia.ejercicios.hospital.main;

import java.util.Random;

import es.cursojava.oo.herencia.ejercicios.hospital.pojos.Doctor;
import es.cursojava.oo.herencia.ejercicios.hospital.pojos.Enfermero;
import es.cursojava.oo.herencia.ejercicios.hospital.pojos.Enfermo;
import es.cursojava.oo.herencia.ejercicios.hospital.pojos.Habitacion;
import es.cursojava.oo.herencia.ejercicios.hospital.pojos.Paciente;
import es.cursojava.utils.Loggable;
import utils.Dexter;

public class Hospital extends Loggable {
	private String nombre;
	private Habitacion[] habitaciones;
	private Paciente[] salaDeEspera;
	private Paciente[] atendidos;
	private Enfermo[] enfermos;
	private Enfermero[] enfermeros;
	private Doctor[] doctores;
	private static final Random r = new Random();
	
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.abrirHospital();
		hospital.ficharEmpleados();
		hospital.horaDeComer();
		hospital.pasarConsultas();
		hospital.horaDeCobrar();
	}
	
	public Hospital() {}

	public Hospital(String nombre, Habitacion[] habitaciones, Paciente[] salaDeEspera) {
		super();
		this.nombre = nombre;
		this.habitaciones = habitaciones;
		this.salaDeEspera = salaDeEspera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Paciente[] getSalaDeEspera() {
		return salaDeEspera;
	}

	public void setSalaDeEspera(Paciente[] salaDeEspera) {
		this.salaDeEspera = salaDeEspera;
	}
	
	public void abrirHospital() {
		habitaciones = new Habitacion[36];
		for (int i = 0; i < habitaciones.length; i++) {
			Habitacion habitacion = new Habitacion();
			habitaciones[i] = habitacion;
		}
		
		salaDeEspera = new Paciente[24];
		for (int i = 0; i < salaDeEspera.length; i++) {
			Paciente paciente = new Paciente(Dexter.toGetName(), r.nextInt(100) + 1);
			salaDeEspera[i] = paciente;
		}
		
		enfermeros = new Enfermero[6];
		for (int i = 0; i < enfermeros.length; i++) {
			Enfermero enfermero = new Enfermero(Dexter.toGetName(), r.nextInt(100) + 1, r.nextInt(3));
			enfermeros[i] = enfermero;
		}
		
		doctores = new Doctor[3];
		for (int i = 0; i < doctores.length; i++) {
			Doctor doctor = new Doctor(Dexter.toGetName(), r.nextInt(100) + 1, "general");
			doctores[i] = doctor;
		}
	}
	
	public void ficharEmpleados() {
		LOG.debug("Fichando empleados");
		for (Enfermero e : enfermeros) {
			e.fichar();
		}
		
		for (Doctor d : doctores) {
			d.fichar();
		}
	}
	
	public void horaDeComer() {
		LOG.debug("Hora de comer");
		for (Paciente p: salaDeEspera) {
			p.comer();
		}
		
		for (Enfermero e : enfermeros) {
			e.comer();
		}
		
		for (Doctor d : doctores) {
			d.comer();
		}
	}
	
	public void pasarConsultas() {
		atendidos = new Paciente[salaDeEspera.length];
		enfermos = new Enfermo[salaDeEspera.length];
		for (int i = 0; i < salaDeEspera.length; i++) {
			Enfermero enfermeroAsignado = enfermeros[i % enfermeros.length];
			Doctor doctorAsignado = doctores[i % doctores.length];
			atendidos[i] = salaDeEspera[i];
			LOG.debug(salaDeEspera[i].getNombre() + " ha sido atendido por " 
					+ enfermeroAsignado.getNombre());
			salaDeEspera[i] = null;
			if(doctorAsignado.diagnosticarPaciente(atendidos[i])) {
//				for (int j = 0; j < atendidos.length; j++) {
//					
//				}
				Enfermo temp = new Enfermo();
				String enfermedad = temp.enfermedadAleatoria();
				Enfermo enfermo = new Enfermo(enfermedad);
				enfermos[i] = enfermo;
				LOG.warn("Al paciente " + atendidos[i].getNombre() + 
						" se le diagnosticó " + enfermos[i].getEnfermedad());
				for (int j = 0; j < habitaciones.length; j++) {
					if(habitaciones[j].isLibre()) {
						Habitacion habitacion = new Habitacion();
						habitacion.setEnfermo(enfermo);
						habitaciones[j] = habitacion;
						LOG.info(atendidos[i].getNombre() + " tiene ahora habitación");
						break;
					} else {
						LOG.info("La habitación está ocupada");
					}
				}
			} else {
				LOG.info("El paciente " + atendidos[i].getNombre() + " está sano");
			}
		}
		
	}
	
	public void horaDeCobrar() {
		LOG.debug("Hora de cobrar");
		for (Enfermero e : enfermeros) {
			e.cobrar();
		}
		
		for (Doctor d : doctores) {
			d.cobrar();
		}
	}
}
