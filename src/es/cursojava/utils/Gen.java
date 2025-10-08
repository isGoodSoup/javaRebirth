package es.cursojava.utils;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Gen {
	private static Random r = new Random();
	private static Scanner scan = new Scanner(System.in);
	
	public static String toScan(int i) {
        switch (i) {
            case 1: return scan.nextLine();
            case 2: return String.valueOf(scan.nextInt());
            case 3: return String.valueOf(scan.nextDouble());
            default: return scan.nextLine();
        }
    }
	
	public static String toGetID() {
		int num = r.nextInt(40000000, 49999999);
		char[] ch = {
				'A', 'B', 'C', 'D', 'E', 'F',
				'G', 'H', 'I', 'J', 'K', 'L', 'M',
				'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
				'U', 'V', 'W', 'X', 'Y', 'Z'
		};
		return Integer.toString(num) + ch[r.nextInt(1, 26)];
	}
	
	public static double toGetDouble(int min, int max) {
		double d = r.nextInt(min, max)/100.0;
		return d;
	}
	
	public static boolean toGetBoolean() {
		return r.nextBoolean();
	}
	

	public static String toGetString(String[] s) {
		return s[r.nextInt(s.length)];
	}
	
	public static int toGetInteger() {
		return r.nextInt();
	}
	
	public static int toGetInteger(int[] i) {
		return i[r.nextInt(i.length)];
	}
	
	public static int toGetInteger(int min, int max) {
		return r.nextInt(min, max);
	}
	
	public static String toGetName() {
		String[] first = {
	            "Alice", "Alejandro", 
	            "Ben", "Beatriz", 
	            "Charlie", "Carmen", 
	            "Daniel", "Dolores", 
	            "Emily", "Eduardo", 
	            "Frank", "Fernanda", 
	            "Grace", "Guillermo", 
	            "Henry", "Helena", 
	            "Isla", "Ignacio", 
	            "Jack", "Jimena", 
	            "Karen", "Kevin", 
	            "Liam", "Lucía", 
	            "Mia", "Mateo", 
	            "Noah", "Natalia", 
	            "Olivia", "Oscar", 
	            "Paul", "Pilar", 
	            "Quinn", "Queralt", 
	            "Rachel", "Raúl", 
	            "Sophie", "Sergio", 
	            "Thomas", "Tatiana", 
	            "Ursula", "Ulises", 
	            "Victor", "Valeria", 
	            "Wendy", "Wilmer", 
	            "Xander", "Ximena", 
	            "Yasmin", "Yago", 
	            "Zoe", "Zacarías"
	    };

	    String[] last = {
	            "Anderson", "Alonso", 
	            "Brown", "Barrios", 
	            "Carter", "Castillo", 
	            "Davis", "Díaz", 
	            "Evans", "Esparza", 
	            "Foster", "Fernández", 
	            "Garcia", "González", 
	            "Harris", "Herrera", 
	            "Ingram", "Iglesias", 
	            "Johnson", "Jiménez", 
	            "King", "Keller", 
	            "Lopez", "Luna", 
	            "Martinez", "Moreno", 
	            "Nelson", "Navarro", 
	            "Ortiz", "Oliver", 
	            "Parker", "Pérez", 
	            "Quinn", "Quijano", 
	            "Robinson", "Ramírez", 
	            "Smith", "Santos", 
	            "Taylor", "Torres", 
	            "Underwood", "Urbina", 
	            "Valentine", "Vargas", 
	            "Walker", "Wenceslao", 
	            "Xavier", "Ximénez", 
	            "Young", "Ybarra", 
	            "Zimmerman", "Zamora"
	    };
	    return first[r.nextInt(first.length)] + " " + last[r.nextInt(last.length)];
	}
	
	public static LocalTime toGetTime() {
	    return LocalTime.of(r.nextInt(24), r.nextInt(60), r.nextInt(60));
	}
}
