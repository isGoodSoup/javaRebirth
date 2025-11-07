package es.cursojava.oo.excepciones.ejercicios.ejercicio3.pojos;

public class Comensal extends Cliente {
	private boolean tieneReserva;

	public Comensal(String nombre, String dni, int edad, boolean tieneReserva) {
		super(nombre, dni, edad);
		this.tieneReserva = tieneReserva;
	}

	public boolean isTieneReserva() {
		return tieneReserva;
	}

	public void setTieneReserva(boolean tieneReserva) {
		this.tieneReserva = tieneReserva;
	}
}
