package es.cursojava.metodos.ejercicios;

public class MetodosEjercicio2 {
	
	public static void main(String[] args) {
		
		System.out.println("Lista de nombres");
		
		String[] names = new String[4];
		
		names[0] = "Juan";
		names[1] = "Alina";
		names[2] = "Alberto";
		names[3] = "Carina";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		nombresLista(names);
	}
	
	public static void nombresLista(String[] names) {
		
		int count = 0;
		
		for (int i = 0; i < names.length; i++) {
			
			if (names[i].startsWith("A") || names[i].contains("t")) {
				count++;
			}
		}
		
		int total = count;
		
		System.out.println("Total de nombres: " + names.length);
		System.out.println("Nombres que empiezan por A y contienen t: " + total);
	}
}
