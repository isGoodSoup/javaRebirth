package es.cursojava.utils;

import java.util.List;

import es.cursojava.modulo2.examen.main.Caballo;
import es.cursojava.modulo2.examen.main.Carrera;

public class Menu {
	
	public static void printMenu(String[] menu) {
		for (int i = 0, j = 1; i < menu.length; i++, j++) {
			System.out.println(j + ") " + menu[i]);
		}
	}
	
	public static String[] getMenuCarreras(List<Carrera> carreras) {
		return new String[] {
				carreras.get(0).getNombre(), 
				carreras.get(1).getNombre(),
				carreras.get(2).getNombre()
		};
	}
	
	public static String[] getMenuCaballos(List<Caballo> caballos) {
		return new String[] {
				caballos.get(0).getNombre(),
				caballos.get(1).getNombre(),
				caballos.get(2).getNombre(),
				caballos.get(3).getNombre(),
				caballos.get(4).getNombre(),
				caballos.get(5).getNombre(),
		};
	}
}
