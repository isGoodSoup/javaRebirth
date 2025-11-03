package es.cursojava.modulo2.examen.main;

import es.cursojava.modulo2.examen.interfaces.Participable;

public class Jinete extends Persona implements Participable {
	private int aniosExperiencia;

	public Jinete(String nombre, int edad, int aniosExperiencia) {
		super(nombre, edad);
		this.aniosExperiencia = aniosExperiencia;
	}
	
	@Override
	public String getIdentificador() {
		return Participable.super.getIdentificador();
	}
	
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
}
