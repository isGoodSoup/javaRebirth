package es.cursojava.oo.interfaces.ejercicios.productos;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Identificador implements Capitalismo {
	protected int identificador;
	private Random r = new Random();
	private static final Logger log = LoggerFactory.getLogger(Identificador.class);
	
	@Override
	public void createId() {
		// TODO Auto-generated method stub
		this.identificador = r.nextInt(9999) + 1;
		log.info("Id generado: {}", this.identificador);
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}
}
