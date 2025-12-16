package es.cursojava.oo.lambdas.ejercicios.ejercicio1;

public class AppComparaCadenas {
	
	public static void main(String[] args) {
		ComparaCadenas comparaLongitud = a -> a.length() > 5;
		ComparaCadenas comparaNumero = a -> a.contains("Hola");
		
		System.out.println();
	}
}
