package es.cursojava.oo.excepciones.ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.utils.Dexter;
import es.cursojava.utils.interfaces.Iniciable;

public class Main implements Iniciable {
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

	    	boolean alumnoCreado = false;
	    	while(!alumnoCreado) {
	    	    try {
	    	        edad = Dexter.toScanInt("Edad");
	    	        nota = Dexter.toScanDouble("Nota Media");
	    	        Alumno a = new Alumno(nombre, dni, edad, nota);
	    	        alumnos.add(a);
	    	        alumnoCreado = true;
	    	    } catch(IllegalArgumentException | NotaInvalidaException e) {
	    	    	Dexter.printException(e);
	    	    }
	    	}
	    }
	    System.out.println("Alumnos creados correctamente");
	    return alumnos;
	}

}
