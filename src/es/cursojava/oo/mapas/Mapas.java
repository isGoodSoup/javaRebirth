package es.cursojava.oo.mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.cursojava.oo.colecciones.ejercicios.supermercado.Persona;
import es.cursojava.utils.Charlie;
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
		
		for (int i = 0; i < 5; i++) {
			Persona p = new Persona(Charlie.toGetName(), Charlie.toGetID(), Charlie.toGetInteger(18, 65));
			personas.put(p.getDni(), p);
			System.out.println(p.getDni());
		}
		
		String dni = Charlie.toScan("Inserta un dni");
		Persona persona = personas.get(dni);
		System.out.println(persona.getNombre());
		
		Charlie.toGetString("Todas las claves");
		Set<String> dnis = personas.keySet();
		for (String dniP : dnis) {
			System.out.println(dniP);
		}
		
		Charlie.toGetString("Todos los valores (por claves)");
		for (@SuppressWarnings("unused") String dniPer : dnis) {
			Persona valor = personas.get(dni);
			System.out.println(valor.getNombre());
		}
		
		Charlie.toGetString("Sin usar clave");
		Collection<Persona> colPersonas = personas.values();
		for (Persona persona2 : colPersonas) {
			System.out.println(persona2.getNombre());
		}
		
		Charlie.toGetString("Entradas");
		Set<Entry<String, Persona>> entries = personas.entrySet();
		for (Entry<String, Persona> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue().getNombre());
		}
	}

	@Override
	public void test() {}

	@Override
	public void exit() { System.exit(0);}
}
