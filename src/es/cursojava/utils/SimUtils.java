package es.cursojava.utils;

import java.util.List;

import es.cursojava.modulo2.examen.main.Caballo;
import es.cursojava.modulo2.examen.main.Jinete;
import utils.Dexter;

public class SimUtils {
	
	public static Caballo crearCaballoAleatorio(String nombreBase, Jinete j) {
		double peso = Dexter.toGetDouble(400, 1000);
		double velocidad = Dexter.toGetDouble(20, 90);
		int xp = Dexter.toGetInteger(1, 10);
		double metros = 0;
		
		Caballo caballo = new Caballo(nombreCaballo(), peso, velocidad, xp, j, metros);
		return caballo;
	}
	
	public static Jinete crearJinete() {
		Jinete jinete = new Jinete(Dexter.toGetName(), Dexter.toGetInteger(40, 100), Dexter.toGetInteger(20, 100));
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
		return Dexter.toGetString(nombres);
	}
}
