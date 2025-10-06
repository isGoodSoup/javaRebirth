package es.cursojava.utils;

import java.util.Random;

public class NameGen {
	
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
