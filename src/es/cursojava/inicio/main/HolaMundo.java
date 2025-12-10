package es.cursojava.inicio.main;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.filereader.utils.FileReader;
import com.loggerfactory.main.AppLogger;

import utils.Dexter;

public class HolaMundo {
    private static Scanner scan = new Scanner(System.in);
	
    public static void main( String[] args ) {
        System.out.println("Hola Mundo");

        int edad = 21;
        int numero = 10;

        System.out.println("Resultado: " + edad + numero);
        System.out.println("Nuevo cambio");

        System.out.println("Hola, Mundo");
        
        AppLogger logger = new AppLogger(5000);
        logger.init();
        
        FileReader reader = new FileReader();
        try {
			List<String> lineas = reader.readFile("./don-quijote.txt");
			for (String linea : lineas) {
				System.out.print(linea);
				scan.nextLine();
			}
		} catch (IOException e) {
			Dexter.printException(e);
		}
    }
}
