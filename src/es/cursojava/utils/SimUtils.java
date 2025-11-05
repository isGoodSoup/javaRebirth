package es.cursojava.utils;

import java.util.List;

import es.cursojava.modulo2.examen.main.Caballo;
import es.cursojava.modulo2.examen.main.Jinete;

public class SimUtils {
	
	public static Caballo crearCaballoAleatorio(String nombreBase, Jinete j) {
		double peso = Utils.toGetDouble(400, 1000);
		double velocidad = Utils.toGetDouble(20, 90);
		int xp = Utils.toGetInteger(1, 10);
		double metros = 0;
		
		Caballo caballo = new Caballo(nombreCaballo(), peso, velocidad, xp, j, metros);
		return caballo;
	}
	
	public static Jinete crearJinete() {
		Jinete jinete = new Jinete(Utils.toGetName(), Utils.toGetInteger(40, 100), Utils.toGetInteger(20, 100));
		return jinete;
	}
	
	public static void mostrarLista(List<Caballo> caballos) {
		for (int i = 0; i < caballos.size(); i++) {
			System.out.println(i + 1 + ") " + caballos.get(i).getNombre());
		}
	}
	
	public static String nombreCaballo() {
		String[] nombres = {
			"Perdigón",
			"Secretariat",
			"Hércules",
			"Raymond",
			"Catarán",
			"Katrina",
			"Liberty",
			"Pompeya",
			"Ismael",
			"Figo",
			"Gabriel",
			"Troya"
		};
		return Utils.toGetString(nombres);
	}
}
