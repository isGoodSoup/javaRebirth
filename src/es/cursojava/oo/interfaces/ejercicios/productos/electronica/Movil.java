package es.cursojava.oo.interfaces.ejercicios.productos.electronica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.oo.interfaces.ejercicios.productos.vehiculos.Moto;

public class Movil extends ProductosElectronicos {
	private int numero;
	private String fabricaOrigen;
	private static final Logger log = LoggerFactory.getLogger(Moto.class);
	
	public Movil() {}
	
	public Movil(String fechaFabricacion, int numero, String fabricaOrigen) {
		super(fechaFabricacion);
		this.numero = numero;
		this.fabricaOrigen = fabricaOrigen;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getFabricaOrigen() {
		return fabricaOrigen;
	}
	
	public void setFabricaOrigen(String fabricaOrigen) {
		this.fabricaOrigen = fabricaOrigen;
	}

	@Override
	public void encender() {
		log.info("El teléfono está encendido");
	}

	@Override
	public void apagar() {
		log.info("El teléfono está apagado");
	}

	@Override
	public void createId() {
		// TODO Auto-generated method stub
		id.createId();
	}
}
