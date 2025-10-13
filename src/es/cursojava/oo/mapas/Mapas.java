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
		
		Persona p1 = new Persona(CAT.toGetName(), CAT.toGetID(), CAT.toGetInteger(18, 65));
		personas.put(p1.getDni(), p1);
		
		Persona p2 = new Persona(CAT.toGetName(), CAT.toGetID(), CAT.toGetInteger(18, 65));
		personas.put(p1.getDni(), p2);
		
		String dni = CAT.toScan("Inserta un dni");
		Persona persona = personas.get(dni);
		System.out.println(persona.getNombre());
	}

	@Override
	public void test() {}

	@Override
	public void exit() { System.exit(0);}
}
