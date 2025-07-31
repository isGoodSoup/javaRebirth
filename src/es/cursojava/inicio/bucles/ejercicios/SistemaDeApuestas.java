package es.cursojava.inicio.bucles.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class SistemaDeApuestas {

    static int opcion = 0;
    @SuppressWarnings("UnnecessaryContinue")
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\nInserta la cantidad de saldo que desea tener:");
        int credit = scan.nextInt();

        int money = credit, bet = 0, betNumber = 0;
        String numberType = " ";
        String prompt = "Quieres continuar?";

        do {
            if (money == 0) {
                System.out.println("Saldo insuficiente, deteniendo...");
                break;
            }

            Random random = new Random();
            System.out.println();
            System.out.println("1. Ruleta de Apuestas\n2. Número\n3. Par o Impar\n4. Bloques\n5. Salir\n\nA qué quieres jugar?");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1 -> {
                gameLoop:
                        do {
                            System.out.println("\nJUEGO: RULETA DE APUESTAS");
                            while (money > bet) {
                                
                                System.out.println("Por qué número quieres apostar?");
                                betNumber = scan.nextInt();
                                
                                if (betNumber > 36) {
                                    System.out.println("Número inválido, reformulando;");
                                    
                                } else {
                                    System.out.println("Número escogido: " + betNumber);
                                    break;
                                }
                            }
                            
                            while (money > bet) {
                                
                                System.out.println("\nCuánto es el importe que quieres apostar?");
                                bet = scan.nextInt();
                                
                                if (bet > money) {
                                    System.out.println("Saldo insuficiente, reformulando;");
                                    
                                } else {
                                    System.out.println("Importe apostado: " + bet);
                                    break;
                                }
                            }

                            while (money >= bet) {
                                int number = random.nextInt(36) + 1;
                                
                                if (number == betNumber) {
                                    
                                    System.out.println("\nGanaste!");
                                    money *= 36 + (money - bet);
                                    break;
                                } else {
                                    
                                    System.out.println("\nPerdiste!");
                                    money -= bet;
                                    break;
                                }
                            }

                            System.out.println("Saldo actual: " + money);
                            
                            System.out.println(prompt);
                            int response = scan.nextInt();
                            
                            switch (response) {
                                case 1 -> { continue; }
                                case 0 -> { break gameLoop; }
                                default -> {
                                    System.out.println("Respuesta no válida");
                                    break;
                                }
                            }

                        } while (money > bet);
                        break;
                }
                
                case 2 -> {
                gameLoop:
                        do {
                            System.out.println("\nJUEGO: QUÉ NÚMERO ES?");
                            while (money > bet) {
                                
                                System.out.println("Por qué número quieres apostar? (1-100)");
                                
                                Scanner scan2 = new Scanner(System.in);
                                betNumber = scan2.nextInt();

                                if (betNumber > 100) {
                                    System.out.println("Número inválido, reformulando;");
                                    
                                } else {
                                    System.out.println("Número escogido: " + betNumber);
                                    break;
                                }
                            }

                            while (money > bet) {
                                
                                System.out.println("\nCuánto es el importe que quieres apostar?");
                                bet = scan.nextInt();
                                
                                if (bet > money) {
                                    System.out.println("Saldo insuficiente, reformulando;");
                                    
                                } else {
                                    System.out.println("Importe apostado: " + bet);
                                    break;
                                }
                            }

                            while (money >= bet) {
                                int number = random.nextInt(100) + 1;
                                
                                if (number == betNumber) {
                                    
                                    System.out.println("\nGanaste!");
                                    money += bet;
                                    break;
                                } else {

                                    System.out.println("\nPerdiste!");
                                    money -= bet;
                                    break;
                                }
                            }

                            System.out.println("Saldo actual: " + money);
                            
                            System.out.println(prompt);
                            int response = scan.nextInt();

                            switch (response) {
                                case 1 -> { continue; }
                                case 0 -> { break gameLoop; }
                                default -> {
                                    System.out.println("Respuesta no válida");
                                    break;
                                }
                            }
                            
                        } while (money > bet);
                    break;
                }

                case 3 -> {
                gameLoop:
                        do {
                            System.out.println("\nJUEGO: PAR O IMPAR");
                            while (money > bet) {
                                
                                System.out.println("Quieres apostar por par o impar?");
                                
                                Scanner scan3 = new Scanner(System.in);
                                numberType = scan3.nextLine();
                                
                                String even = "par";
                                String odd = "impar";
                                
                                if (numberType.equalsIgnoreCase(odd) || numberType.equalsIgnoreCase(even)) {
                                    
                                    System.out.println("Apostaste por " + numberType);
                                    break;
                                    
                                } else {
                                    System.out.println("El tipo escogido es inválido, reformulando;");
                                }
                            }

                            while (money > bet) {
                                
                                System.out.println("\nCuánto es el importe que quieres apostar?");
                                bet = scan.nextInt();
                                
                                if (bet > money) {
                                    System.out.println("Saldo insuficiente, reformulando;");
                                    
                                } else {
                                    System.out.println("Importe apostado: " + bet);
                                    break;
                                }
                            }

                            while (money >= bet) {
                                int number = random.nextInt(100) + 1;
                                
                                if (number%2==0 && numberType.equalsIgnoreCase("par")) {
                                    
                                    System.out.println("\nGanaste!");
                                    money += bet;
                                    break;
                                } else if (number%2!=0 && numberType.equalsIgnoreCase("impar")) {
                                    
                                    System.out.println("\nGanaste!");
                                    money += bet;
                                    break;
                                }
                                
                                if (number%2==0 && numberType.equalsIgnoreCase("impar")) {
                                    
                                    System.out.println("\nPerdiste!");
                                    money -= bet;
                                    break;
                                } else if (number%2!=0 && numberType.equalsIgnoreCase("par")) {
                                    
                                    System.out.println("\nPerdiste!");
                                    money -= bet;
                                    break;
                                }
                            }

                            System.out.println("Saldo actual: " + money);
                            
                            System.out.println(prompt);
                            int response = scan.nextInt();
                            
                            switch (response) {
                                case 1 -> { continue; }
                                case 0 -> { break gameLoop; }
                                default -> {
                                    System.out.println("Respuesta no válida");
                                    break;
                                }
                            }
                            
                        } while (money > bet);
                    break;
                }

                case 4 -> {
                    do {
                        System.out.println("Hello World");
                    } while (money > bet);
                    break;
                }

                default -> {
                    break;
                }
            }
        } while (opcion != 5);
    }
}
