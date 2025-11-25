package es.cursojava.utils;

import java.util.List;

import es.cursojava.modulo2.examen.main.Caballo;
import es.cursojava.modulo2.examen.main.Carrera;

/*
 * Clase para manejar menús en la aplicación.
 * Contiene métodos para imprimir menús y generar menús dinámicos basados en listas de objetos.
 * Proporciona métodos específicos para generar menús de carreras y caballos.
 * Utiliza listas de objetos Carrera y
 * Caballo para crear menús personalizados.
 * Permite una fácil expansión para agregar más tipos de menús en el futuro.
 */
public class Menu {
	
	/*
	 * Imprime un menú en la consola.
	 * Cada opción del menú se numera automáticamente.
	 */
	public static void printMenu(String[] menu) {
		for (int i = 0, j = 1; i < menu.length; i++, j++) {
			System.out.println(j + ") " + menu[i]);
		}
	}
	
	/*
	 * Genera un menú de nombres de carreras a partir de una lista de objetos Carrera.
	 * Devuelve un array de strings con los nombres de las carreras.
	 * Asume que la lista contiene al menos tres carreras.
	 * @param carreras Lista de objetos Carrera.
	 * @return Array de strings con los nombres de las carreras.
	 * @throws IndexOutOfBoundsException si la lista tiene menos de tres carreras.
	 */
	public static String[] getMenuCarreras(List<Carrera> carreras) {
		return new String[] {
				carreras.get(0).getNombre(), 
				carreras.get(1).getNombre(),
				carreras.get(2).getNombre()
		};
	}
	
	/*
	 * Genera un menú de nombres de caballos a partir de una lista de objetos Caballo.
	 * Devuelve un array de strings con los nombres de los caballos.
	 * Asume que la lista contiene al menos seis caballos.
	 * @param caballos Lista de objetos Caballo.
	 * @return Array de strings con los nombres de los caballos.
	 * @throws IndexOutOfBoundsException si la lista tiene menos de seis caballos.
	 */
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