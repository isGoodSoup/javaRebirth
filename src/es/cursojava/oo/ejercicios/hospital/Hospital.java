package es.cursojava.oo.ejercicios.hospital;

import java.util.Random;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.NameGen;

public class Hospital {
	private String nombre;
	private Paciente[][] pacientes;
	private static int edad = 0;
	private final static Random random = new Random();
	private final static Scanner scan = new Scanner(System.in);
	private final static Logger log = LoggerFactory.getLogger(Hospital.class);
	
	public static void main(String[] args) {
		Hospital hospital = new Hospital("Hospital Santa María de Jesús");
		hospital.ingresarPacientes();
		hospital.aperturaVisitas();
	}
	
	public Hospital() {
		
	}
	
	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void ingresarPacientes() {
		pacientes = new Paciente[3][12];
		log.debug("Ingresando pacientes...");
		
		for (int i = 0; i < pacientes.length; i++) {
			for (int j = 0; j < pacientes[i].length; j++) {
				edad = random.nextInt(99);
				Paciente paciente = new Paciente(NameGen.Name(), edad);
				pacientes[i][j] = paciente;
				log.trace("Paciente en Hab " + i + j + ": " + paciente.getNombre() 
				+ ", " + paciente.getEdad());
			}
		}
		log.debug("Pacientes ingresados");
	}
	
	public void aperturaVisitas() {
		log.info("Bienvenido a " + getNombre());
		boolean isVisitaActiva = true;
		do {
			log.info("Introduzca el piso (0-2) y la habitación del paciente (0-11)");
			int piso = scan.nextInt();
			int hab = scan.nextInt();
			
			if (piso < 0 || piso >= pacientes.length || hab < 0 || hab >= pacientes[piso].length) {
			    log.error("Piso/habitación inválido");
			} else {
				Paciente paciente = pacientes[piso][hab];
				log.debug("Piso " + piso + ", Hab. " + hab + ": " 
				+ paciente.getNombre() + ", " + paciente.getEdad());
				isVisitaActiva = false;
			}
		} while(isVisitaActiva);	
	}
}
