package es.cursojava.utils;

import es.cursojava.modulo2.examen.main.Caballo;
import es.cursojava.modulo2.examen.main.Jinete;

public class SimUtils {
	
	public static Caballo crearCaballoAleatorio(String nombreBase, Jinete j) {
		Jinete jinete = Jinete.crearJinete();
		Caballo caballo = new Caballo(
				nombreCaballo(), 
				CAT.toGetDouble(400, 1000), 
				CAT.toGetDouble(100, 1000), 
				CAT.toGetInteger(8, 1000),
				jinete,
				CAT.toGetDouble(500, 1000)
		);
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
