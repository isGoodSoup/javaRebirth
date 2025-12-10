package es.cursojava.oo.ficheros.ejercicios.directorios;

import java.io.File;

import utils.Dexter;

public class Directorios {
	
	public File[] crearDirectorios() {
		File ficheros = new File("C:\\Usuarios\\Tardes\\ficheros\\");
		if(!ficheros.exists()) {
			ficheros.mkdir();
		}
		
		File img = nuevoDirectorio("C:\\Usuarios\\Tardes\\ficheros\\Imagenes\\");
		File docs = nuevoDirectorio("C:\\Usuarios\\Tardes\\ficheros\\Documentos\\");
		File otro = nuevoDirectorio("C:\\Usuarios\\Tardes\\ficheros\\Otros\\");
		
		File[] dir = {img, docs, otro};
		return dir;
	}
	
	public void checkDirectorios(File[] dir) {
		Dexter.toGetString("FICHEROS");
		String nombre = Dexter.toScan("Inserta un nombre de fichero");
		String extens = Dexter.toScan("Inserta la extensión");
		
		String[] extensImg = {".gif", ".png", ".jpg", ".jpeg"};
		for (int i = 0; i < extensImg.length; i++) {
			if(extens.equals(extensImg[i])) {
				File archivo = new File(dir[0] + "\\" + nombre + extens);
			} else {
				break;
			}
		}
		
		String[] extensDocs = {};
		for (int i = 0; i < extensDocs.length; i++) {
			if(extens.equals(extensDocs[i])) {
				File archivo = new File(dir[0] + "\\" + nombre + extens);
			} else {
				break;
			}
		}
		
	}
	
	private File nuevoDirectorio(String s) {
		File d = new File(s);
		d.mkdir();
		return d;
	}
}
