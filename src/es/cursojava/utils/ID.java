package es.cursojava.utils;

import java.util.Arrays;
import java.util.Random;

public class ID {
	private static Random r = new Random();
	private static String[] id = new String[2];
	private static String nombre;
	private static String dni;
	
	public static String createID() {
		nombre = NameGen.Name();
		id[0] = nombre;
		int num = r.nextInt(10000000, 99999999);
		char[] ch = {
				'A', 'B', 'C', 'D', 'E', 'F',
				'G', 'H', 'I', 'J', 'K', 'L', 'M',
				'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
				'U', 'V', 'W', 'X', 'Y', 'Z'
		};
		int i = r.nextInt(1, 26);
		char letra = ch[i];
		dni = Integer.toString(num) + letra;
		id[1] = dni;
		
		String idString = Arrays.toString(id);
		return idString;
	}
}
