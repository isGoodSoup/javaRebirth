package es.cursojava.modulo2.examen2.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.utils.Dexter;
import es.cursojava.utils.interfaces.Iniciable;

public class MainFicheros implements Iniciable {
	private List<String> lineas;
	private Map<Integer, String> mapa = new HashMap<>();
	private int contador = 0;
	private int javas = 0;
	private int javaPorLinea = 0;
	private int charsTotales;
	
	public static void main(String[] args) {
		MainFicheros main = new MainFicheros();
		main.init();
	}

	@Override
	public void init() {
		try {
			this.leerArchivo("./application.log");
		} catch (IOException e) {
			new Dexter().printException(e);
		}
	}
	
	public String leerArchivo(String archivo) throws IOException{
		Path ruta = Paths.get(archivo);
		StringBuilder builder = new StringBuilder();
		
		lineas = Files.readAllLines(ruta);
		for(String linea : lineas) {
			builder.append(linea+"\n");
			mapa.put(contador, linea);
			
			if(linea.contains("java")) {
				javas++;
			}
			contador++;
		}
		
		System.out.println("Hay " + contador + " líneas y " + javas + " 'javas'");
		for(Map.Entry<Integer, String> linea : mapa.entrySet()) {
			Integer numLinea = linea.getKey();
			String contenido = linea.getValue();
			if(contenido.contains("java")) { javaPorLinea++; }
			if(javaPorLinea != 0) {
				System.out.println("Para la linea " + numLinea + 
						" hay " + javaPorLinea + " java(s)");
			}
			System.out.println("La línea " + numLinea + 
					" tiene " + contenido.length() + " caracteres");
			charsTotales += contenido.length();
			javaPorLinea = 0;
		}
		System.out.println("Total = " + charsTotales + " caracteres");
		return builder.toString();
	}
}
