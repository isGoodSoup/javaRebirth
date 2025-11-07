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
	    	Dexter.toGetString("ALUMNO " + alumnos.size());
	    	nombre = Dexter.toScan("Nombre");
	    	dni = Dexter.toScan("DNI");
	    	edad = Dexter.toScanInt("Edad");

	    	boolean notaValida = false;
	        while (!notaValida) {
		    	try {
		    		nota = Dexter.toScanDouble("Nota media");
			    	Alumno a = new Alumno(nombre, dni, edad, nota);
			    	alumnos.add(a);
			    	notaValida = true;
			    } catch(NotaInvalidaException e) {
			    	System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
			    }
	        }
	    }
	    return alumnos;
	}

}
