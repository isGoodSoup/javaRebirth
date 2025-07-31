package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class PrecioLlamada {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tiempo de llamada:");
		int tiempoLlamada = scan.nextInt();
		
		System.out.println("Dia de llamada:");
		Scanner scanTwo = new Scanner(System.in);
		int diaLlamada = scanTwo.nextInt();
		
		System.out.println("Hora de la llamada:");
		float horaLlamada = scan.nextFloat();
		
		float costeTotal = 0f;

		if (tiempoLlamada >= 5) {
			costeTotal = tiempoLlamada * 1;

			if (tiempoLlamada > 5 || tiempoLlamada < 8) {
				costeTotal = ((5 * 1) + ((10 - 5) + 0.80f));

				if (tiempoLlamada > 8 || tiempoLlamada <= 10) {			
					costeTotal = ((5 * 1) + ((10 - 5) + 0.80f) + ((10 - 8) + 0.70f));

					if (tiempoLlamada > 10) {	
						costeTotal = ((5 * 1) + ((10 - 5) + 0.80f) + ((10 - 8) + 0.70f) + ((tiempoLlamada - 10) * 0.50f));	
					}

		if (diaLlamada == 7) {

			float impuestoDia = 0.3f;

			costeTotal = ((5 * 1) + ((10 - 5) + 0.80f) + ((10 - 8) + 0.70f) + ((tiempoLlamada - 10) * 0.50f)) + (tiempoLlamada * impuestoDia);

			System.out.println("Impuesto de Domingo: 3%");

		} else if (diaLlamada >= 1 || diaLlamada <= 6) {
							
			float impuestoHora = 0f;

			if (horaLlamada >= 6 && horaLlamada < 12) {

				System.out.println("Impuesto por hora: 15%");

				impuestoHora = 0.15f;				
				costeTotal = ((5 * 1) + ((10 - 5) + 0.80f) + ((10 - 8) + 0.70f) + ((tiempoLlamada - 10) * 0.50f)) + (tiempoLlamada * impuestoHora);
			}

			if (horaLlamada >= 12 && horaLlamada < 23) {

				System.out.println("Impuesto por hora: 10%");

				impuestoHora = 0.10f;
				costeTotal = ((5 * 1) + ((10 - 5) + 0.80f) + ((10 - 8) + 0.70f) + ((tiempoLlamada - 10) * 0.50f)) + (tiempoLlamada * impuestoHora);
			}

			if (horaLlamada >= 23 && horaLlamada <= 5.99) {

				System.out.println("Impuesto por hora: -10%");

				impuestoHora = 0.10f;
				costeTotal = ((5 * 1) + ((10 - 5) + 0.80f) + ((10 - 8) + 0.70f) + ((tiempoLlamada - 10) * 0.50f)) + (tiempoLlamada * impuestoHora);
			}				
					}
				}
			}
		} else if (tiempoLlamada < 5) {
			costeTotal = tiempoLlamada * 1;

			if (diaLlamada == 7) {

				float impuestoDia = 0.3f;

				costeTotal = (tiempoLlamada * 1) + (tiempoLlamada * impuestoDia);
				System.out.println("Impuesto de Domingo: 3%");
			
			} else if (diaLlamada >= 1 && diaLlamada <= 6) {
				
				float impuestoHora = 0f;

				if (horaLlamada >= 6 && horaLlamada < 12) {

					System.out.println("Impuesto por hora: 15%");

					impuestoHora = 0.15f;
					costeTotal = ((5 * 1) + ((10 - 5) + 0.80f) + ((10 - 8) + 0.70f) + ((tiempoLlamada - 10) * 0.50f)) + (tiempoLlamada * impuestoHora);
				}

				if (horaLlamada >= 12 && horaLlamada < 23) {

					System.out.println("Impuesto por hora: 10%");

					impuestoHora = 0.10f;
					costeTotal = ((5 * 1) + ((10 - 5) + 0.80f) + ((10 - 8) + 0.70f) + ((tiempoLlamada - 10) * 0.50f)) + (tiempoLlamada * impuestoHora);
				}

				if (horaLlamada >= 23 && horaLlamada <= 5.99) {

					System.out.println("Impuesto por hora: -10%");

					impuestoHora = 0.10f;
					costeTotal = ((5 * 1) + ((10 - 5) + 0.80f) + ((10 - 8) + 0.70f) + ((tiempoLlamada - 10) * 0.50f)) + (tiempoLlamada * impuestoHora);
				}
			}
		}

		System.out.println(costeTotal + "€");
	}
}
