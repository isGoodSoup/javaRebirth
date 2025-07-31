package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringsValidarEmailAlt {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Email"); System.out.print("-- ");
		String email = scan.nextLine();
		String error = "";
		
		do {
			if (email.contains(" ")) {
				error += "El email no puede tener espacios\n";
			}
			
			if (!email.contains("@")) {
				
				error += "El email no tiene arroba\n";
			} else if (email.indexOf("@")!=email.lastIndexOf("@")) {
				
				error += "El email no puede tener más de una arroba\n";
			} else {
				
				String domain = email.substring(email.indexOf("@") + 1);
				System.out.println("dominio: " + domain);
			
				if (!domain.contains(".")) {
					
					error += "El dominio del email debe contener al menos un punto\n";
				} else {
					
					int periodPos = domain.indexOf(".");
					if (periodPos < 2) {
						error += "La separación entre el @ y el punto debe ser (al menos) de 2 caracteres\n";
					}
					
					int periodPosFinal = domain.lastIndexOf(".");
					int domainLength = domain.length() - 1;
					if (domainLength - periodPosFinal < 2 || domainLength - periodPosFinal > 6 ) {
						error += "Después del último punto debe haber entre 2 y 6 caracteres\n";
					}
					
				}
			}
			
			if (error.isEmpty()) {
				
				System.out.println("El email " + email + " es válido");
				break;
				
			} else {
				
				System.out.println(error);
				break;
			}
			
		} while (true);
	}
}
