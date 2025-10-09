package es.cursojava.modulo1.examen2;

public class Utilidades {
	
	public static double areaCirculo(double r) {
		r = Math.PI * Math.pow(r, 2);
		if (r < 0) {
			return -1;
		}
		return r;
	}
	
	public static String soloLetras(String s) {
		s.trim();
		s.strip();
		return s;
	}
	
	public static void printMenu(String[] menu) {
		for (int i = 0, j = 1; i < menu.length; i++, j++) {
			System.out.println(j + ") " + menu[i]);
		}
		System.out.println("Introduce una opción");
	}
}
