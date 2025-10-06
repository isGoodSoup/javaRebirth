package es.cursojava.utils;

import java.util.Random;

public class ID {
	private static Random r = new Random();
	private static String dni;
	
	public static String createID() {
		int num = r.nextInt(40000000, 49999999);
		char[] ch = {
				'A', 'B', 'C', 'D', 'E', 'F',
				'G', 'H', 'I', 'J', 'K', 'L', 'M',
				'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
				'U', 'V', 'W', 'X', 'Y', 'Z'
		};
		int i = r.nextInt(1, 26);
		char letra = ch[i];
		dni = Integer.toString(num) + letra;
		return dni;
	}
}
