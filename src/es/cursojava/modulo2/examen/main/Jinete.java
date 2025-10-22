package es.cursojava.modulo2.examen.main;

import es.cursojava.utils.CAT;

public class Jinete extends Persona {
	private int aniosExperiencia;

	public Jinete(String nombre, int edad, int aniosExperiencia) {
		super(nombre, edad);
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public static Jinete crearJinete() {
		Jinete jinete = new Jinete(CAT.toGetName(), CAT.toGetInteger(40, 100), CAT.toGetInteger(20, 100));
		return jinete;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
}
