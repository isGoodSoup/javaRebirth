package es.cursojava.oo.excepciones.ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.utils.Dexter;
import es.cursojava.utils.Executable;

public class Main implements Executable {
	private String nombre;
	private String dni;
	private int edad;
	private double nota;
	
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}

	@Override
	public void init() {
		solicitarDatos();
	}
	
	private List<Alumno> solicitarDatos() {
	    Dexter.toGetString("DATOS DEL ALUMNO");
	    List<Alumno> alumnos = new ArrayList<>();
	    while(alumnos.size() < 6) {
	    	try {
		    	nombre = Dexter.toScan("Nombre");
		    	dni = Dexter.toScan("DNI");
		    	edad = Dexter.toScanInt("Edad");
		    	nota = Dexter.toScanDouble("Nota media");
		    	Alumno a = new Alumno(nombre, dni, edad, nota);
		    	alumnos.add(a);
		    } catch(NotaInvalidaException e) {
		    	System.err.println(e.getMessage());
		    }
	    }
	    return alumnos;
	}

}
