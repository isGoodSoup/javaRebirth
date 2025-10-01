package es.cursojava.oo.interfaces.ejercicios.productos.main;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Capitalismo;
import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Consultable;
import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Deletable;
import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Insertable;
import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Updatable;

public class Identificador implements Capitalismo, Consultable, Insertable, Updatable, Deletable {
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
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}
