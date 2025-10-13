package es.cursojava.oo.mapas;

import java.util.HashMap;
import java.util.Map;

import es.cursojava.oo.colecciones.ejercicios.supermercado.Persona;
import es.cursojava.utils.CAT;
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
		
		Persona persona = new Persona(CAT.toGetName(), CAT.toGetID(), CAT.toGetInteger(18, 65));
		personas.put(persona.getDni(), persona);
	}

	@Override
	public void test() {}

	@Override
	public void exit() { System.exit(0);}
}
