package es.cursojava.libre;

import java.util.Scanner;
import es.cursojava.utils.Tools;

public class Ahorcado {
    
    static Scanner scan = new Scanner(System.in);
    static int option;
    public static void main(String[] args) {
        
        String[] menu = {"Cooperativo", "Contra la Máquina", "Salir"};
        Tools.printMenu(menu);
        option = scan.nextInt();
        scan.nextLine();

        do {

            switch (option) {
                case 1: 
                        break;
                case 2: 
                        break;
                case 3: 
                        break;
                default: 
                         break;
            }
        } while (option < 5);
    }
}