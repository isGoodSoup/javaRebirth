package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringMayorLongitud {
	
	public static void main( String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una frase:"); System.out.print("-- ");
		String sentence = scan.nextLine();
		String longestWord = "";
		
		while (sentence.length() > longestWord.length()) {
			
			int empty = sentence.indexOf(" ");
			String word = sentence.substring(0,empty);
//			System.out.println(word);
				
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
			
			sentence = sentence.substring(empty+1);
		}
		System.out.println("Palabra más larga es: " + longestWord);
//		The quick brown fox jumps over the lazy dog		
	}
}
