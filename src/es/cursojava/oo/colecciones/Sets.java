package es.cursojava.oo.colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import es.cursojava.oo.Persona;
import es.cursojava.utils.CAT;

public class Sets {
	
	public static void main(String[] args) {
		Set<Persona> lista = new HashSet();
		for (int i = 0; i < 6; i++) {
			boolean anhadido = lista.add(new Persona(CAT.toGetName(), null, CAT.toGetID(), 50));
		}
		
		for (Persona persona : lista) {
			System.out.println(persona.getDNI());
		}
		
		Iterator<Persona> ite = lista.iterator();
		while(ite.hasNext()) {
			Persona persona = ite.next();
		}
	}
}
