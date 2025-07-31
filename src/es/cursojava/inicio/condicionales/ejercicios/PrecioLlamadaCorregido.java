package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class PrecioLlamadaCorregido {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Tiempo de llamada:");
		int minutos = scan.nextInt();
		
		System.out.println("Dia de llamada:");
		Scanner scanTwo = new Scanner(System.in);
		int dia = scanTwo.nextInt();
		
		System.out.println("Hora de la llamada:");
		int hora = scan.nextInt();
		
		float costeTotal = 1f;

        if (minutos > 5) {
            costeTotal += 0.8f;
        }

        if (minutos > 8) {
            costeTotal += 0.7f;
        }

        if (minutos > 10) {
            costeTotal += (minutos - 10) * 0.5f;
        }

        System.out.println("Sin impuestos: " + costeTotal + "€");

        double impuesto = switch (dia) {
            case 7 -> 1.03;
            default -> 0;
        };

        double impuestoHora = switch (hora) {
            case 6, 7, 8, 9, 10, 11, 12 -> 1.15;
            case 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 -> 1.10;
            case 24, 1, 2, 3, 4, 5 -> -1.10;
            default -> 0;
        };

        double impuestoTotal = impuesto + impuestoHora;

        System.out.println("Con impuestos: " + costeTotal * impuestoTotal + "€");
    }
}
