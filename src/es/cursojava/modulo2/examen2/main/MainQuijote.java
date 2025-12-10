package es.cursojava.modulo2.examen2.main;

import java.io.IOException;

import es.cursojava.utils.interfaces.Iniciable;
import utils.Dexter;

public class MainQuijote implements Iniciable {
	
	public static void main(String[] args) {
		new MainQuijote().init();
	}

	@Override
	public void init() {
		try {
			Dexter.toLeerArchivo("./don-quijote.txt");
		} catch (IOException e) {
			Dexter.printException(e);
		}
	}
}
