package es.cursojava.inicio.arrays.ejercicios;

public class Calculadora {

		public static void main(String[] args) {
			
//			String num = "2";
//			int num2 = Integer.parseInt(num);
//			System.out.println(num2);
//			
			if (args.length < 3) {
				
				System.err.println("Los parámetros requeridos no están presentes.");
				System.exit(0);
			} else {
				
				System.out.println("El número de argumentos es " + args.length);
				String operator = args[0];
				System.out.println("La operación será la " + operator + " de:");
				
				int result = Integer.parseInt(args[1]);
				
				for (int i = 2; i < args.length; i++) {
					
					System.out.println();
					int number = Integer.parseInt(args[i]);
					System.out.print(number + " ");
					System.out.println();
					
					if (operator.equalsIgnoreCase("suma")) {
						result += number;
					} else if (operator.equalsIgnoreCase("resta")) {
						result -= number;
					} else if (operator.equalsIgnoreCase("mult")) {
						result *= number;
					} else if (operator.equalsIgnoreCase("divi")) {
						result /= number;
					} else {
						System.err.println("Operación no permitida");
						break;
					}
				}
				
				System.out.println("El resultado es " + result);
			}
		}
}
