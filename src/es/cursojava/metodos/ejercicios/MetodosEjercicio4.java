package es.cursojava.metodos.ejercicios;

import java.util.Scanner;
import es.cursojava.utils.Tools;

public class MetodosEjercicio4 {
    
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String[] menu = {"Aa", "Bb", "Cc", "Dd", "Ee"};
		
		Tools.printMenu(menu);
		String cadena = scan.nextLine();
		Tools.printMenu(menu, cadena);
		Tools.pideDatoNumerico(cadena);
		int num = scan.nextInt();
		Tools.pideDatoNumerico(cadena, num);
	}
}
