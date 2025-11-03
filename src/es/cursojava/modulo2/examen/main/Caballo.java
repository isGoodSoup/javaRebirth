package es.cursojava.modulo2.examen.main;

import es.cursojava.modulo2.examen.interfaces.Cabalgable;

public class Caballo implements Cabalgable {
	private String nombre;
	private double peso;
	private double velocidad;
	private int experiencia;
	private Jinete jinete;
	private double metrosRecorridos;
	
	public Caballo(String nombre, double peso, double velocidad,
			int experiencia, double metrosRecorridos) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.metrosRecorridos = metrosRecorridos;
	}

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
	
	@Override
	public String getIdentificador() {
		return Cabalgable.super.getIdentificador();
	}
	
	public void resetear() {
		this.metrosRecorridos = 0;
	}
	
	public void sumarExperiencia(int puntos) {
		this.experiencia += puntos;
	}
	
	@Override
	public double calcularAvanceTurno() {

		return 0;
	}

	@Override
	public void aplicarAvance(double metros) {
		this.velocidad += metros;
	}
	
	@Override
	public void imprimeDatos() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Caballo [nombre=" + nombre + ", peso=" + peso + ", velocidad="
				+ velocidad + ", experiencia=" + experiencia + ", jinete="
				+ jinete + ", metrosRecorridos=" + metrosRecorridos + "]";
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
