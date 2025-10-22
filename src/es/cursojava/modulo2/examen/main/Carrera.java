package es.cursojava.modulo2.examen.main;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
	private String nombre;
	private double distanciaObjetivo;
	private List<Caballo> participantes;
	private List<Apuesta> apuestas;
	
	public Carrera(String nombre, double distanciaObjetivo) {
		super();
		this.nombre = nombre;
		this.distanciaObjetivo = distanciaObjetivo;
		this.participantes = new ArrayList<>();
		this.apuestas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDistanciaObjetivo() {
		return distanciaObjetivo;
	}

	public void setDistanciaObjetivo(double distanciaObjetivo) {
		this.distanciaObjetivo = distanciaObjetivo;
	}

	public List<Caballo> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Caballo> participantes) {
		this.participantes = participantes;
	}

	public List<Apuesta> getApuestas() {
		return apuestas;
	}

	public void setApuestas(List<Apuesta> apuestas) {
		this.apuestas = apuestas;
	}
}
