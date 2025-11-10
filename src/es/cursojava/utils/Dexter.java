package es.cursojava.utils;

import java.util.Random;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.interfaces.Loggable;

public class Dexter implements Loggable {
	private static Random r = new Random();
	private static Scanner scan = new Scanner(System.in);
	private Logger log;
	
	public Dexter() {}
	
	public Dexter(Class<?> c) {
		this.log = LoggerFactory.getLogger(c);
	}
	
	public void printException(Exception e) {
		log.error(e.getClass().getSimpleName() + " at line " 
						+ e.getStackTrace()[e.getStackTrace().length - 3]
						.getLineNumber() + ": " + e.getMessage());
	}

	@Override
	public void setLogger(Logger logger) {
		this.log = logger;
	}
	
	public void toLog(int var, String s) {
		switch(var) {
			case 0 -> log.trace(s);
			case 1 -> log.info(s);
			case 2 -> log.debug(s);
			case 3 -> log.warn(s);
			case 4 -> log.error(s);
			default -> log.info(s);
		}
	}
	
	public void toLog(String s) {
		log.info(s);
	}
	
	public static String toScan(String s) {
		String line = "";
		do {
    		System.out.print(s + ": ");
    		line = scan.nextLine().trim();
    	} while(line.isEmpty());
		return line;
    }
	
	public static int toScanInt(String s) {
		String line = "";
	    while (true) {
	        try {
	        	do {
	        		System.out.print(s + ": ");
	        		line = scan.nextLine().trim();
	        	} while(line.isEmpty());
	        	
	            int num = Integer.parseInt(line);
	            return num;
	        } catch (Exception e) {
	            new Dexter().printException(e);
	        }
	    }
	}
	
	public static long toScanLong(String s) {
		System.out.print(s + ": ");
		return scan.nextLong();
	}
	
	public static double toScanDouble(String s) {
		System.out.print(s + ": ");
		return scan.nextDouble();
	}
	
	public static void cleanBuffer() {
		scan.nextLine();
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
	
	public static boolean isPrime(int num) {
	    if (num <= 1) return false;
	    if (num == 2) return true;
	    if (num % 2 == 0) return false;
	    for (int i = 3; i <= Math.sqrt(num); i += 2) {
	        if (num % i == 0) return false;
	    }
	    return true;
	}
	
	public static long toGetLong(long min, long max) {
		return r.nextLong(min, max);
	}
	
	public long toTime(Runnable task) {
        long start = System.currentTimeMillis();
        task.run();
        return System.currentTimeMillis() - start;
    }
	
	public final void clearConsole() {
	    try {
	        final String os = System.getProperty("os.name");
	        if (os.contains("Windows")) {
	            Runtime.getRuntime().exec("cls");
	        }
	        else {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e) {
	    	log.error(e.getClass().getSimpleName() + " at line " 
					+ e.getStackTrace()[e.getStackTrace().length - 3]
					.getLineNumber() + ": " + e.getMessage());
	    }
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
