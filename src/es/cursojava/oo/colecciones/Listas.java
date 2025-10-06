package es.cursojava.oo.colecciones;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.oo.Persona;

public class Listas {
	
	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();
//		lista.add("Amarillo");
//		lista.add(100.5);
		for (int i = 0; i < 10000; i++) {
			lista.add(new Persona(null, null, null, i));
		}
		System.out.println(lista.size());

//		for (Object object : lista) {
//			if(object instanceof Persona) {
//				Persona p = (Persona)object;
//				p.getNombre();
//			}
//		}
		for (Persona persona : lista) {
			System.out.println(persona.getNombre());
		}
	}
}
