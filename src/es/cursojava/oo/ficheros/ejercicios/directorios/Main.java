package es.cursojava.oo.ficheros.ejercicios.directorios;

import es.cursojava.utils.interfaces.Iniciable;

public class Main implements Iniciable {
	
	public static void main(String[] args) {
		new Main().init();
	}

	@Override
	public void init() {
		Directorios dir = new Directorios();
		dir.checkDirectorios(dir.crearDirectorios());
	}
}
