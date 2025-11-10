package es.cursojava.oo.excepciones.ejercicios.ejercicio3.pojos;

import es.cursojava.oo.excepciones.ejercicios.ejercicio3.excepciones.ExtremeTemperatureException;

public class Comensal extends Cliente {
	private boolean tieneReserva;

	public Comensal(String nombre, String dni, int edad, TazaCafe taza,
			boolean tieneReserva) throws ExtremeTemperatureException {
		super(nombre, dni, edad, taza);
		this.tieneReserva = tieneReserva;
		
		double temperatura = this.getTaza().getTemperatura();
		if(temperatura < 20) {
			throw new ExtremeTemperatureException("Temperatura de la taza muy baja");
		}
		
		if(temperatura > 80) {
			throw new ExtremeTemperatureException("Temperatura de la taza muy alta");
		}
	}
	
	@Override
	public void beberCafe() {
		super.beberCafe();
	}

	public boolean isTieneReserva() {
		return tieneReserva;
	}

	public void setTieneReserva(boolean tieneReserva) {
		this.tieneReserva = tieneReserva;
	}
}
