package es.cursojava.oo.mapas.ejercicios.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.utils.Charlie;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		Map<Autor, List<Libro>> biblioteca = main.crearObjetos();
		main.mostrarNacionalidades(biblioteca);
		main.mostrarTitulos(biblioteca);
		main.mostrarAutor(biblioteca);
		main.solicitarDatos(biblioteca);
	}
	
	public Map<Autor, List<Libro>> crearObjetos() {
		Map<Autor, List<Libro>> biblio = new HashMap<>();
		List<Libro> a1_libros = new ArrayList<>();
		List<Libro> a2_libros = new ArrayList<>();
		List<Libro> a3_libros = new ArrayList<>();
		List<Libro> a4_libros = new ArrayList<>();
		
		Autor a1 = new Autor(Charlie.toGetName(), "española");
		Autor a2 = new Autor(Charlie.toGetName(), "chilena");
		Autor a3 = new Autor(Charlie.toGetName(), null);
		Autor a4 = new Autor(Charlie.toGetName(), "inglesa");
		
		Libro l1 = new Libro(Charlie.toGetTitle(), Charlie.toGetLong(9790000000000L, 9799999999999L), Charlie.toGetInteger(1985, 2015));
		Libro l2 = new Libro(Charlie.toGetTitle(), Charlie.toGetLong(9780000000000L, 9789999999999L), Charlie.toGetInteger(1985, 2015));
		Libro l3 = new Libro(Charlie.toGetTitle(), Charlie.toGetLong(9780000000000L, 9789999999999L), Charlie.toGetInteger(1985, 2015));
		Libro l4 = new Libro(Charlie.toGetTitle(), Charlie.toGetLong(9780000000000L, 9789999999999L), Charlie.toGetInteger(1985, 2015));
		Libro l5 = new Libro(Charlie.toGetTitle(), Charlie.toGetLong(9790000000000L, 9799999999999L), Charlie.toGetInteger(1985, 2015));
		Libro l6 = new Libro(Charlie.toGetTitle(), Charlie.toGetLong(9790000000000L, 9799999999999L), Charlie.toGetInteger(1985, 2015));
		Libro l7 = new Libro(Charlie.toGetTitle(), Charlie.toGetLong(9780000000000L, 9789999999999L), Charlie.toGetInteger(1985, 2015));
		Libro l8 = new Libro(Charlie.toGetTitle(), Charlie.toGetLong(9790000000000L, 9799999999999L), Charlie.toGetInteger(1985, 2015));
		Libro l9 = new Libro(Charlie.toGetTitle(), Charlie.toGetLong(9790000000000L, 9799999999999L), Charlie.toGetInteger(1985, 2015));
		
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
		Charlie.toGetString("Nacionalidades");
		for(Map.Entry<Autor, List<Libro>> biblio : biblioteca.entrySet()) {
			Autor a = biblio.getKey();
			try {
				System.out.println(a.getNombre() + " es de nacionalidad " + a.getNacionalidad().substring(0, 3));
			} catch(NullPointerException e) {
				System.err.println(e.getMessage());
			} finally {
				// Es código que se ejecuta incondicionalmente
			}
		}
		return biblioteca;
	}
	
	private Map<Autor, List<Libro>> mostrarTitulos(Map<Autor, List<Libro>> biblioteca) {
		Charlie.toGetString("Titulos");
		int lib = 0;
		for(Map.Entry<Autor, List<Libro>> biblio : biblioteca.entrySet()) {
			List<Libro> l = biblio.getValue();
			for (int i = 0; i < l.size(); i++) {
				if(l.get(i).getAnio() > 2010) {
					System.out.println(l.get(i).getTitulo() + " (" + l.get(i).getAnio() + ")");
					lib++;
				}
			}
		}
		if(lib == 0) {
			System.out.println("No hay libros post-2010");
		}
		return biblioteca;
	}
	
	private Map<Autor, List<Libro>> mostrarAutor(Map<Autor, List<Libro>> biblioteca) {
		Charlie.toGetString("Autores con 2+ libros");
		for(Map.Entry<Autor, List<Libro>> biblio : biblioteca.entrySet()) {
		    Autor autor = biblio.getKey();
		    List<Libro> libros = biblio.getValue();
		    if(libros.size() > 2) {
		    	System.out.println(autor.getNombre());
			    for(Libro libro : libros) {
			    	System.out.println(libro.getTitulo() + " (" + libro.getAnio() + ")");
			    }
		    }
		}
		return biblioteca;
	}
	
	private Map<Autor, List<Libro>> solicitarDatos(Map<Autor, List<Libro>> biblioteca) {
	    Charlie.toGetString("Solicitar datos");
	    for(Map.Entry<Autor, List<Libro>> entry : biblioteca.entrySet()) {
	        Autor autor = entry.getKey();
	        List<Libro> libros = entry.getValue();
	        System.out.println(autor.getNombre() + ", nacionalidad: " + autor.getNacionalidad());
	        for(Libro libro : libros) {
	            System.out.println(libro.getTitulo() + " (" + libro.getAnio() + ")");
	            System.out.println("ISBN: " + libro.getIsbn());
	        }
	    }
	    String tituloLibro = Charlie.toScan("Qué libro buscas?");
	    String autorLibro = Charlie.toScan("Qué autor buscas?");
	    long isbnLibro = Charlie.toScanLong("Qué ISBN buscas?");
	    int anhoLibro = Charlie.toScanInt("En qué año se escribió " + tituloLibro.toUpperCase() + "?");

	    Autor autorEncontrado = null;

	    for(Autor a : biblioteca.keySet()) {
	        if (a.getNombre().equalsIgnoreCase(autorLibro)) {
	            autorEncontrado = a;
	            break;
	        }
	    }
	    
	    List<Libro> librosAutor = biblioteca.get(autorEncontrado);
	    librosAutor.add(new Libro(tituloLibro, isbnLibro, anhoLibro));

//	    librosAutor.removeIf(libro -> {
//	        if(libro.getIsbn() == isbnLibro) {
//	            System.out.println(libro.getTitulo() + " se ha eliminado");
//	            return true;
//	        }
//	        return false;
//	    });

	    if(autorEncontrado == null) {
	        String nombre = Charlie.toScan("Nombre:");
	        String nacionalidad = Charlie.toScan("Nacionalidad:");
	        autorEncontrado = new Autor(nombre, nacionalidad);
	        biblioteca.put(autorEncontrado, new ArrayList<>());
	        System.out.println("Nuevo autor añadido");
	    }
	    return biblioteca;
	}
}
