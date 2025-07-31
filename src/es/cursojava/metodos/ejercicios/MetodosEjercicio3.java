package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

public class MetodosEjercicio3 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		double[] data = rectData();

		for (double spec : data) {
			System.out.print(spec + ", ");
		}
	}
	
	public static double[] rectData() {
		
		System.out.println("Altura del rectángulo: ");
		double height = scan.nextDouble();
		
		System.out.println("Ancho/base del rectángulo: ");
		double width = scan.nextDouble();
		
		double area = height * width;
		double perimeter = 2 * (height + width);
		double dial = Math.sqrt(height*height + width*width);
		
		double[] data = {area, perimeter, dial};
		
		return data;
	}
}
