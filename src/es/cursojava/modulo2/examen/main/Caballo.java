package es.cursojava.modulo2.examen.main;

import es.cursojava.modulo2.examen.interfaces.Avanzable;
import es.cursojava.modulo2.examen.interfaces.Imprimible;

public class Caballo implements Avanzable, Imprimible {
	private String nombre;
	private double peso;
	private double velocidad;
	private int experiencia;
	private Jinete jinete;
	private double metrosRecorridos;
	
	public Caballo(String nombre, double peso, double velocidad, int experiencia, Jinete jinete,
			double metrosRecorridos) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.jinete = jinete;
		this.metrosRecorridos = metrosRecorridos;
	}
	
	public void resetear() {
		
	}
	
	public void sumarExperiencia(int puntos) {
		
	}
	
	@Override
	public double calcularAvanceTurno() {

		return 0;
	}

	@Override
	public void aplicarAvance(double metros) {

		
	}
	
	@Override
	public String imprimeDatos() {
		
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public Jinete getJinete() {
		return jinete;
	}

	public void setJinete(Jinete jinete) {
		this.jinete = jinete;
	}

	public double getMetrosRecorridos() {
		return metrosRecorridos;
	}

	public void setMetrosRecorridos(double metrosRecorridos) {
		this.metrosRecorridos = metrosRecorridos;
	}
}
