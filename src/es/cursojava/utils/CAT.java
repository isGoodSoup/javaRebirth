package es.cursojava.utils;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CAT {
	private static Random r = new Random();
	private static Scanner scan = new Scanner(System.in);
//	private static Logger log = LoggerFactory.getLogger(new Object() {}.getClass().getEnclosingClass());
	
	public static String toScan(String s) {
		System.out.print(s + ": ");
		return scan.nextLine();
    }
	
	public static int toScanInt(String s) {
		System.out.print(s + ": ");
		return scan.nextInt();
	}
	
	public static long toScanLong(String s) {
		System.out.print(s + ": ");
		return scan.nextLong();
	}
	
	public static double toScanDouble(String s) {
		System.out.print(s + ": ");
		return scan.nextDouble();
	}
	
	public static Logger toLog(Class<?> cls) {
	    return LoggerFactory.getLogger(cls);
	}
	
	public static Logger toLog() {
	    return toLog(CAT.class);
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
	
	public static void toGetString(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.print("=");
		}
		System.out.print(" " + s + " ");
		
		for (int i = 0; i < s.length(); i++) {
			System.out.print("=");
		}
		System.out.println();
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
	
	public static long toGetLong(long min, long max) {
		return r.nextLong(min, max);
	}
	
	public long toTime(Runnable task) {
        long start = System.currentTimeMillis();
        task.run();
        return System.currentTimeMillis() - start;
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
	
	public static String toGetTitle() {
	    String[] a = {
	        "Oscuro", "Misterioso", "Increíble", "Perdido", "Eterno",
	        "Secreto", "Invisible", "Fantástico", "Siniestro", "Radiante"
	    };

	    String[] s = {
	        "Bosque", "Destino", "Viaje", "Reino", "Mundo",
	        "Labyrinth", "Sueño", "Enigma", "Secreto", "Guardian"
	    };

	    String[] c = {
	        "del Alba", "de la Noche", "del Más Allá", "de los Sueños",
	        "de la Tormenta", "del Olvido", "de la Mente", "del Corazón",
	        "de las Sombras", "de la Esperanza"
	    };

	    String adj = toGetString(a);
	    String sust = toGetString(s);
	    String com = toGetString(c);

	    return adj + " " + sust + " " + com;
	}
}
