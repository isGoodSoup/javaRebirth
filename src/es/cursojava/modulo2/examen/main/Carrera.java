package es.cursojava.modulo2.examen.main;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
	private String nombre;
	private double distanciaObjetivo;
	private List<Caballo> caballos;
	private List<Apuesta> apuestas;
	
	public Carrera(String nombre, double distanciaObjetivo, List<Caballo> caballos) {
		super();
		this.nombre = nombre;
		this.distanciaObjetivo = distanciaObjetivo;
		this.caballos = caballos;
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

	public List<Caballo> getCaballos() {
		return caballos;
	}

	public void setCaballos(List<Caballo> participantes) {
		this.caballos = participantes;
	}

	public List<Apuesta> getApuestas() {
		return apuestas;
	}

	public void setApuestas(List<Apuesta> apuestas) {
		this.apuestas = apuestas;
	}
}
