package es.cursojava.oo.colecciones.ejercicios.alumnos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.interfaces.Iniciable;
import utils.Dexter;

public class Main implements Iniciable {
	private Scanner scan = new Scanner(System.in);
	private static final Logger log = LoggerFactory.getLogger(Main.class);
	private String nombre;
	
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}
	
	@Override
	public void init() {
		List<Alumno> alumnos = new ArrayList<Alumno>();
		for (int i = 0; i < 7; i++) {
			Alumno alumno = new Alumno(Dexter.toGetName(), Dexter.toGetID(), Dexter.toGetDouble(1, 1000));
			alumnos.add(alumno);
		}
		mostrarInfo(alumnos);
		excelente(alumnos);
		nombreComun(alumnos);
		eliminarAlumno(alumnos);
	}
	
	public void mostrarInfo(List<Alumno> alumnos) {
		log.info("Alumnos: ");
		for (Alumno alumno : alumnos) {
			log.info(alumno.getNombre() + ", " 
					+ alumno.getDni() + ", " + alumno.getNotaMedia());
		}
	}
	
	public void excelente(List<Alumno> alumnos) {
		log.info("Nota mayor que 9:");
		for (Alumno alumno : alumnos) {
			if(alumno.getNotaMedia() > 9) {
				log.debug(alumno.getNombre() + 
						" ha sacado un " + alumno.getNotaMedia() + ", excelente!");
			}
		}
	}
	
	public void nombreComun(List<Alumno> alumnos) {
		log.info("Introduce el nombre");
		nombre = scan.nextLine();
		
		for (Alumno alumno : alumnos) {
			if(alumno.getNombre().contains(nombre) && alumno.getNombre() != null) {
				log.debug(alumno.getNombre() + 
						" tiene una nota de " + alumno.getNotaMedia());
			}
		}
	}
	
	public void eliminarAlumno(List<Alumno> alumnos) {
		try {
			for (Alumno alumno : alumnos) {
				if(alumno.getNotaMedia() < 5) {
					alumnos.remove(alumno);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
