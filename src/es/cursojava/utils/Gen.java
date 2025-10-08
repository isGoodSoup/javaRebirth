package es.cursojava.utils;

import java.util.Random;

public class Gen {
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
	
	public static double getDouble(int min, int max) {
		int n = r.nextInt(min, max);
		double d = n/100.0;
		return d;
	}
	

	public static String toGetString(String[] s) {
		String item = s[r.nextInt(s.length)];
		return item;
	}
	
	public static int toGetInteger(int[] i) {
		int item = i[r.nextInt(i.length)];
		return item;
	}
	
	public static String name() {
		Random random = new Random();
		String name = "";
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
	    
	    int num = random.nextInt(first.length);
	    int num2 = random.nextInt(last.length);
	    String fnlfirst = first[num];
	    String fnllast = last[num2];
	    name = fnlfirst + " " + fnllast;
		
	    return name;
	}
}
