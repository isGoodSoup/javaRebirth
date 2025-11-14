package es.cursojava.oo.ficheros.ejercicios.directorios;

import es.cursojava.utils.interfaces.Executable;

public class Main implements Executable {
	
	public static void main(String[] args) {
		new Main().init();
	}

	@Override
	public void init() {
		Directorios dir = new Directorios();
		dir.checkDirectorios(dir.crearDirectorios());
	}
}
