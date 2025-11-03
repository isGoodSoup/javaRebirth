package es.cursojava.utils;

import es.cursojava.modulo2.examen.main.Caballo;
import es.cursojava.modulo2.examen.main.Jinete;

public class SimUtils {
	
	public static Caballo crearCaballoAleatorio(String nombreBase, Jinete j) {
		double peso = CAT.toGetDouble(400, 1000);
		double velocidad = CAT.toGetDouble(20, 90);
		int xp = CAT.toGetInteger(1, 10);
		double metros = 0;
		
		Caballo caballo = new Caballo(nombreCaballo(), peso, velocidad, xp, j, metros);
		return caballo;
	}
	
	public static void mostrarLista() {
		Caballo[] caballos = new Caballo[10];
		for (int i = 0; i < caballos.length; i++) {
			
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
		return CAT.toGetString(nombres);
	}
}
