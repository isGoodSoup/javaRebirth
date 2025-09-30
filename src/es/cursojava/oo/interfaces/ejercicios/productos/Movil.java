package es.cursojava.oo.interfaces.ejercicios.productos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Movil extends ProductosElectronicos {
	private int numero;
	private String fabricaOrigen;
	private static final Logger log = LoggerFactory.getLogger(Moto.class);
	
	public Movil() {}
	
	public Movil(int id, String fechaFabricacion, int numero, String fabricaOrigen) {
		super(id, fechaFabricacion);
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
}
