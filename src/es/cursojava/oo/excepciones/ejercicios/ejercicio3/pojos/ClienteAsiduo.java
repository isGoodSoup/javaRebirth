package es.cursojava.oo.excepciones.ejercicios.ejercicio3.pojos;

import es.cursojava.oo.excepciones.ejercicios.ejercicio3.excepciones.ExtremeTemperatureException;

public class ClienteAsiduo extends Cliente {
	private String mote;

	public ClienteAsiduo(String nombre, String dni, int edad, TazaCafe taza,
			String mote) throws ExtremeTemperatureException {
		super(nombre, dni, edad, taza);
		this.mote = mote;
		
		double temperatura = this.getTaza().getTemperatura();
		if(temperatura < 20) {
			throw new ExtremeTemperatureException("Temperatura de la taza muy baja");
		}
		
		if(temperatura > 80) {
			throw new ExtremeTemperatureException("Temperatura de la taza muy alta");
		}
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}
	
	@Override
	public void beberCafe() {
		super.beberCafe();
	}
}
