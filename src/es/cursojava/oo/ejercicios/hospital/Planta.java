package es.cursojava.oo.ejercicios.hospital;

public class Planta {
	private int numero;
	private Habitacion[] habitaciones;
	
	public Planta() {
		
	}

	public Planta(int numero, Habitacion[] habitaciones) {
		super();
		this.numero = numero;
		this.habitaciones = habitaciones;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}
}
