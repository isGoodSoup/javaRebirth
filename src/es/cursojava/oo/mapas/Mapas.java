package es.cursojava.oo.mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.cursojava.oo.colecciones.ejercicios.supermercado.Persona;
import es.cursojava.utils.Dexter;
import es.cursojava.utils.Executable;

public class Mapas implements Executable {
	
	public static void main(String[] args) {
		Mapas main = new Mapas();
		main.init();
	}
	
	@Override
	public void init() {
		Map<String, Persona> personas = new HashMap<>();
		
		for (int i = 0; i < 5; i++) {
			Persona p = new Persona(Dexter.toGetName(), Dexter.toGetID(), Dexter.toGetInteger(18, 65));
			personas.put(p.getDni(), p);
			System.out.println(p.getDni());
		}
		
		String dni = Dexter.toScan("Inserta un dni");
		Persona persona = personas.get(dni);
		System.out.println(persona.getNombre());
		
		Dexter.toGetString("Todas las claves");
		Set<String> dnis = personas.keySet();
		for (String dniP : dnis) {
			System.out.println(dniP);
		}
		
		Dexter.toGetString("Todos los valores (por claves)");
		for (@SuppressWarnings("unused") String dniPer : dnis) {
			Persona valor = personas.get(dni);
			System.out.println(valor.getNombre());
		}
		
		Dexter.toGetString("Sin usar clave");
		Collection<Persona> colPersonas = personas.values();
		for (Persona persona2 : colPersonas) {
			System.out.println(persona2.getNombre());
		}
		
		Dexter.toGetString("Entradas");
		Set<Entry<String, Persona>> entries = personas.entrySet();
		for (Entry<String, Persona> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue().getNombre());
		}
	}
}
