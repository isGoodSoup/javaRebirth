package es.cursojava.oo.mapas.ejercicios.aulas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.cursojava.utils.CAT;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		Map<String, ArrayList<Alumno>> alumnos = main.crearObjetos();
		main.abrirAulas(alumnos);
		main.mostrarInfo(alumnos);
		main.mostrarAulas(alumnos);
		main.mostrarNotaMediaAlta(alumnos);
	}

	public Map<String, ArrayList<Alumno>> crearObjetos() {
		Alumno a1 = new Alumno(CAT.toGetName(), CAT.toGetID(), CAT.toGetDouble(300, 1000), CAT.toGetInteger(100, 400));
		Alumno a2 = new Alumno(CAT.toGetName(), CAT.toGetID(), CAT.toGetDouble(300, 1000), CAT.toGetInteger(100, 400));
		Alumno a3 = new Alumno(CAT.toGetName(), CAT.toGetID(), CAT.toGetDouble(300, 1000), CAT.toGetInteger(100, 400));
		Alumno a4 = new Alumno(CAT.toGetName(), CAT.toGetID(), CAT.toGetDouble(300, 1000), CAT.toGetInteger(100, 400));
		Alumno a5 = new Alumno(CAT.toGetName(), CAT.toGetID(), CAT.toGetDouble(300, 1000), CAT.toGetInteger(100, 400));
		Alumno a6 = new Alumno(CAT.toGetName(), CAT.toGetID(), CAT.toGetDouble(300, 1000), CAT.toGetInteger(100, 400));
		Alumno a7 = new Alumno(CAT.toGetName(), CAT.toGetID(), CAT.toGetDouble(300, 1000), CAT.toGetInteger(100, 400));
		
		ArrayList<Alumno> aula1 = new ArrayList<>();
		ArrayList<Alumno> aula2 = new ArrayList<>();
		ArrayList<Alumno> aula3 = new ArrayList<>();
		aula1.add(a1);
		aula1.add(a2);
		aula2.add(a3);
		aula3.add(a4);
		aula3.add(a5);
		aula3.add(a6);
		aula3.add(a7);
		
		Map<String, ArrayList<Alumno>> aulas = new HashMap<>();
		aulas.put("1A", aula1);
		aulas.put("2A", aula2);
		aulas.put("3A", aula3);
		return aulas;
	}

	public Map<String, ArrayList<Alumno>> abrirAulas(Map<String, ArrayList<Alumno>> alumnos) {
		Set<String> aulas = alumnos.keySet();
		CAT.toGetString("Aulas");
		for (String aula : aulas) {
			System.out.println(aula);
		}
		return alumnos;
	}
	
	public Map<String, ArrayList<Alumno>> mostrarInfo(Map<String, ArrayList<Alumno>> alumnos) {
		Set<Entry<String, ArrayList<Alumno>>> aulas = alumnos.entrySet();
		CAT.toGetString("Alumnos");
		for (Entry<String, ArrayList<Alumno>> aula : aulas) {
			for (Alumno alumno : aula.getValue()) {
				String nombre = alumno.getNombre();
				String dni = alumno.getDni();
				double notaMedia = alumno.getNotaMedia();
				
				System.out.println("Datos: " + nombre + ", " + dni + ", " + notaMedia);
			}
		}
		return alumnos;
	}
	
	public Map<String, ArrayList<Alumno>> mostrarAulas(Map<String, ArrayList<Alumno>> alumnos) {
		String aulaNombre = CAT.toScan("Introduce el nombre de la clase");
		
		if (alumnos.containsKey(aulaNombre)) {
	        ArrayList<Alumno> aula = alumnos.get(aulaNombre);
	        CAT.toGetString("Total de alumnos: " + aula.size());

	        for (Alumno alumno : aula) {
	            System.out.println(alumno.getNombre());
	        }
	    } else {
	        System.out.println("El aula no existe.");
	    }
		return alumnos;
	}
	
	public Map<String, ArrayList<Alumno>> mostrarNotaMediaAlta(Map<String, ArrayList<Alumno>> alumnos) {
		Alumno mejor = null;

	    for (Map.Entry<String, ArrayList<Alumno>> entry : alumnos.entrySet()) {
	        for (Alumno a : entry.getValue()) {
	            if (mejor == null || a.getNotaMedia() > mejor.getNotaMedia()) {
	                mejor = a;
	            }
	        }
	    }

	    if (mejor != null) {
	        System.out.println("Alumno con la nota más alta:");
	        System.out.println(mejor.getNombre() + " - " + mejor.getNotaMedia());
	    } else {
	        System.out.println("No hay alumnos registrados.");
	    }
		return alumnos;
	}
}
