package es.cursojava.oo.mapas.ejercicios.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.utils.CAT;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		Map<Autor, List<Libro>> biblioteca = main.crearObjetos();
		main.mostrarNacionalidades(biblioteca);
		main.mostrarTitulos(biblioteca);
		main.mostrarAutor(biblioteca);
	}
	
	public Map<Autor, List<Libro>> crearObjetos() {
		Map<Autor, List<Libro>> biblio = new HashMap<>();
		List<Libro> a1_libros = new ArrayList<>();
		List<Libro> a2_libros = new ArrayList<>();
		List<Libro> a3_libros = new ArrayList<>();
		List<Libro> a4_libros = new ArrayList<>();
		
		Autor a1 = new Autor(CAT.toGetName(), "española");
		Autor a2 = new Autor(CAT.toGetName(), "chilena");
		Autor a3 = new Autor(CAT.toGetName(), "austriaca");
		Autor a4 = new Autor(CAT.toGetName(), "inglesa");
		
		Libro l1 = new Libro(CAT.toGetTitle(), CAT.toGetInteger(9790, 9799) + CAT.toGetInteger(100000000, 999999999), CAT.toGetInteger(1985, 2015));
		Libro l2 = new Libro(CAT.toGetTitle(), CAT.toGetInteger(9780, 9789) + CAT.toGetInteger(100000000, 999999999), CAT.toGetInteger(1985, 2015));
		Libro l3 = new Libro(CAT.toGetTitle(), CAT.toGetInteger(9780, 9789) + CAT.toGetInteger(100000000, 999999999), CAT.toGetInteger(1985, 2015));
		Libro l4 = new Libro(CAT.toGetTitle(), CAT.toGetInteger(9780, 9789) + CAT.toGetInteger(100000000, 999999999), CAT.toGetInteger(1985, 2015));
		Libro l5 = new Libro(CAT.toGetTitle(), CAT.toGetInteger(9790, 9799) + CAT.toGetInteger(100000000, 999999999), CAT.toGetInteger(1985, 2015));
		Libro l6 = new Libro(CAT.toGetTitle(), CAT.toGetInteger(9780, 9789) + CAT.toGetInteger(100000000, 999999999), CAT.toGetInteger(1985, 2015));
		Libro l7 = new Libro(CAT.toGetTitle(), CAT.toGetInteger(9790, 9799) + CAT.toGetInteger(100000000, 999999999), CAT.toGetInteger(1985, 2015));
		Libro l8 = new Libro(CAT.toGetTitle(), CAT.toGetInteger(9780, 9789) + CAT.toGetInteger(100000000, 999999999), CAT.toGetInteger(1985, 2015));
		Libro l9 = new Libro(CAT.toGetTitle(), CAT.toGetInteger(9790, 9799) + CAT.toGetInteger(100000000, 999999999), CAT.toGetInteger(1985, 2015));
		
		a1_libros.add(l1); a1_libros.add(l2); a1_libros.add(l3);
		a2_libros.add(l4); a2_libros.add(l5); a2_libros.add(l6); 
		a3_libros.add(l7);
		a4_libros.add(l8); a4_libros.add(l9);
		
		biblio.put(a1, a1_libros);
		biblio.put(a2, a2_libros);
		biblio.put(a3, a3_libros);
		biblio.put(a4, a4_libros);
		return biblio;
	}
	
	private Map<Autor, List<Libro>> mostrarNacionalidades(Map<Autor, List<Libro>> biblioteca) {
		CAT.toGetString("Nacionalidades");
		for(Map.Entry<Autor, List<Libro>> biblio : biblioteca.entrySet()) {
			Autor a = biblio.getKey();
			System.out.println(a.getNombre() + " es de nacionalidad " + a.getNacionalidad());
		}
		return biblioteca;
	}
	
	private Map<Autor, List<Libro>> mostrarTitulos(Map<Autor, List<Libro>> biblioteca) {
		CAT.toGetString("Titulos");
		for(Map.Entry<Autor, List<Libro>> biblio : biblioteca.entrySet()) {
			List<Libro> l = biblio.getValue();
			for (int i = 0; i < l.size(); i++) {
				if(l.get(i).getAnio() > 2010) {
					System.out.println(l.get(i).getTitulo() + " salió post-2010");
				}
			}
		}
		return biblioteca;
	}
	
	private Map<Autor, List<Libro>> mostrarAutor(Map<Autor, List<Libro>> biblioteca) {
		CAT.toGetString("Autores con 2+ libros");
		for (Map.Entry<Autor, List<Libro>> biblio : biblioteca.entrySet()) {
		    Autor autor = biblio.getKey();
		    List<Libro> libros = biblio.getValue();
		    if(libros.size() > 2) {
		    	System.out.println(autor.getNombre());
			    for (Libro libro : libros) {
			    	System.out.println(libro.getTitulo() + " (" + libro.getAnio() + ")");
			    }
		    }
		}
		return biblioteca;
	}
}
