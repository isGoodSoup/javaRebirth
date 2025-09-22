package es.cursojava.oo.herencia.ejercicios.hospital;

import java.util.Random;

import es.cursojava.utils.NameGen;

public class Hospital {
	private String nombre;
	private Habitacion[] habitaciones;
	private Paciente[] salaDeEspera;
	private Enfermero[] enfermeros;
	private static final Random r = new Random();
	
	public static void main(String[] args) {
		
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
			Paciente paciente = new Paciente(NameGen.Name(), r.nextInt(100) + 1);
			salaDeEspera[i] = paciente;
		}
		
		enfermeros = new Enfermero[6];
		for (int i = 0; i < enfermeros.length; i++) {
			Enfermero enfermero = new Enfermero();
			enfermeros[i] = enfermero;
		}
		
		Doctor d1 = new Doctor();
		Doctor d2 = new Doctor();
	}
	
	public void ficharEmpleados() {
		
	}
	
	public void horaDeComer() {
		
	}
	
	public void pasarConsultas() {
		
	}
}
