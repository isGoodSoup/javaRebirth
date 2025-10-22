package es.cursojava.oo.mapas.ejercicios.aulas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Colegio {
	private String nombre;
	private String direccion;
	private Map<String, List<Alumno>> aulas;
	
	public Colegio(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public Map<String, List<Alumno>> getAulas() {
		return aulas;
	}
}
