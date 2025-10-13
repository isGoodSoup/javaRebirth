package es.cursojava.oo.mapas.ejercicios.aulas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.cursojava.utils.CAT;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		Map<String, ArrayList<Alumno>> alumnos = main.crearObjetos();
		main.abrirAulas(alumnos);
		main.mostrarInfo(alumnos);
		main.mostrarAulas(alumnos);
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
		CAT.toGetString("Alumnos");
		
		return alumnos;
	}
	
	public Map<String, ArrayList<Alumno>> mostrarAulas(Map<String, ArrayList<Alumno>> alumnos) {
		CAT.toGetString("Total de alumnos");
		
		return alumnos;
	}
}
