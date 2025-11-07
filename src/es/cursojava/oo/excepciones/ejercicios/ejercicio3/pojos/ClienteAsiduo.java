package es.cursojava.oo.excepciones.ejercicios.ejercicio3.pojos;

public class ClienteAsiduo extends Cliente {
	private String mote;

	public ClienteAsiduo(String nombre, String dni, int edad, String mote) {
		super(nombre, dni, edad);
		this.mote = mote;
	}
	
	@Override
	public void beberCafe() {
		super.beberCafe();
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}
}
