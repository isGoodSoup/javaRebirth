package es.cursojava.libre;

import java.util.Random;
import java.util.Scanner;

import es.cursojava.utils.Menu;

public class Ahorcado {
    
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    static int option;
    
    public static void main(String[] args) {
    	
    	do {
    		
    		System.out.println("== El Ahorcado ==");
        	String[] menu = {"Contra la máquina", "Contra el jugador 2", "Salir"};
        	Menu.printMenu(menu);
        	option = scan.nextInt();
        	scan.nextLine();
    		
    		switch (option) {
    			
    			case 1: machineGame(); break;
    			case 2: break;
    			case 3: System.out.println("A-d-i-o-s!");
    					System.exit(0);
    					break;
    		}
    		
    	} while (option != 3);
    }
    
    public static void machineGame() {
    	
    	String[] sujetos = { 
    			"El gato", "La niña", "Mi amigo", "Un hombre", "La policía", "El perro", 
    			"La profesora", "Un payaso", "El médico", "La madre", "El robot", "Mi vecino"
    	};

    	String[] verbos = { 
    			"come", "pinta", "busca", "rompe", "salta", "canta",
    			"lava", "lee", "mueve", "atrapa", "conduce", "enciende"
    	};

    	String[] complementos = {
    			"una manzana", "la casa", "el coche", "una canción", "el jardín", "la calle",
    			"el balón", "un sombrero", "la ventana", "la lámpara", "el periódico", "el fuego"
    	};
    	
    	
    	String sujeto = sujetos[randomNumber(sujetos.length)];
    	String verbo = verbos[randomNumber(verbos.length)];
    	String complemento = complementos[randomNumber(complementos.length)];
    	
    	String frase = sujeto + " " + verbo + " " + complemento;
    	
    	boolean letraAdivinada = true;
    	
    	do {
    		
    		char[] fraseDividida = new char[frase.length()];
        	for (char c : fraseDividida) {
    			if (c == ' ') {
    				System.out.print(" ");
    			} else {
    				System.out.print("_");
    			}
    		}
        	
        	System.out.println("Cúal letra corresponde?");
        	String reply = scan.nextLine();
        	
    	} while (letraAdivinada);
    }
    
    public static void player1() {
    	
    }
    
    public static void player2() {
    	
    }
    
    public static int randomNumber(int num) {
    	num = random.nextInt(num);
    	return num;
    }
}