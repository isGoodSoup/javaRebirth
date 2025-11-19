package es.cursojava.modulo2.examen2.main;

import java.io.IOException;

import es.cursojava.utils.Dexter;
import es.cursojava.utils.interfaces.Iniciable;

public class MainQuijote implements Iniciable {
	
	public static void main(String[] args) {
		new MainQuijote().init();
	}

	@Override
	public void init() {
		try {
			Dexter.toLeerArchivo("./don-quijote.txt");
		} catch (IOException e) {
			new Dexter().printException(e);
		}
	}
}
