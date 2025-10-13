package es.cursojava.mapas;

import java.util.HashMap;
import java.util.Map;

import es.cursojava.oo.herencia.ejercicios.hospital.Persona;
import es.cursojava.utils.Executable;

public class Mapas implements Executable {
	
	public static void main(String[] args) {
		Mapas main = new Mapas();
		main.run();
		main.exit();
	}
	
	@Override
	public void run() {
		Map<String, Persona> personas = new HashMap<>();
		
	}

	@Override
	public void test() {}

	@Override
	public void exit() { System.exit(0);}
}
