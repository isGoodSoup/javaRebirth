package es.cursojava.oo.excepciones.ejercicios.ejercicio3.pojos;

public class Huesped extends Cliente {

	public Huesped(String nombre, String dni, int edad, TazaCafe taza) {
		super(nombre, dni, edad, taza);
	}

	public Huesped(String nombre, String dni, int edad) {
		super(nombre, dni, edad);
	}
	
	@Override
	public void beberCafe() {
		dex.toLog(1, this.getNombre() + " no puede tomar cafe");
	}
}
