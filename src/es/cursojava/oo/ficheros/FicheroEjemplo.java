package es.cursojava.oo.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import es.cursojava.utils.Dexter;

public class FicheroEjemplo {
	
	public static void main(String[] args) {
		new FicheroEjemplo().crearFichero(
			"fichero", ".txt"
		);
	}
	
	public void crearFichero(String s, String extension) {
		File file = new File(s + extension);
		try(BufferedWriter b = new BufferedWriter(new FileWriter(file))) {
			b.append("Hola mundo");
			b.newLine();
			b.append("Este es un fichero test");
			b.newLine();
			b.append("Tres tristes tigres comen trigo en un trigal");
			b.newLine();
			
		} catch (IOException e) {
			new Dexter().printException(e);
		}
	}
}
