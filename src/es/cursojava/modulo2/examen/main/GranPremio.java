package es.cursojava.modulo2.examen.main;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.utils.CAT;
import es.cursojava.utils.Menu;
import es.cursojava.utils.SimUtils;

public class GranPremio {
	private String nombre;
	private List<Carrera> carreras;
	private List<Apostante> apostantes;
	private Carrera carrera;
	private Jinete jinete;
	private int opcion;
	
	public GranPremio(String nombre) {
		super();
		this.nombre = nombre;
		this.carreras = new ArrayList<>();
		this.apostantes = new ArrayList<>();
	}
	
	public void empezarGranPremio() {
		System.out.println("Bienvenido al " + this.getNombre());
		carreras = crearCarreras();
		apostantes = crearApostantes();
		String[] menu = {
				carreras.get(0).getNombre(), 
				carreras.get(1).getNombre(),
				carreras.get(2).getNombre()
		};
		
		for (int i = 0; i < apostantes.size(); i++) {
			do {
				Menu.printMenu(menu);
				opcion = CAT.toScanInt("Elige una carrera para apostar");
				switch(opcion) {
					case 1 -> { 
						carrera = carreras.get(0); 
						SimUtils.mostrarLista();
						
					}
					case 2 -> { carrera = carreras.get(1); }
					case 3 -> { carrera = carreras.get(2); }
				}
			} while(apostantes.get(i).getSaldo() > 0 || opcion < 3);
		}
		mostrarResumen();
	}
	
	private List<Carrera> crearCarreras() {
		Carrera c1 = new Carrera("4000 metros", 4100.0);
		carreras.add(c1);
		Carrera c2 = new Carrera("2500 metros", 2560.0);
		carreras.add(c2);
		Carrera c3 = new Carrera("3000 metros", 3020.0);
		carreras.add(c3);
		return carreras;
	}
	
	private List<Apostante> crearApostantes() {
		Apostante a1 = new Apostante(CAT.toGetName(), CAT.toGetInteger(80, 100), 500);
		apostantes.add(a1);
		Apostante a2 = new Apostante(CAT.toGetName(), CAT.toGetInteger(80, 100), 700);
		apostantes.add(a2);
		Apostante a3 = new Apostante(CAT.toGetName(), CAT.toGetInteger(80, 100), 800);
		apostantes.add(a3);
		return apostantes;
	}
	
	private Apuesta crearApuesta(Apostante apos, Caballo caballo, double importe) {
		
		Apuesta apuesta = new Apuesta(apos, caballo, importe);
		return apuesta;
	}
	
	private void mostrarResumen() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}

	public List<Apostante> getApostantes() {
		return apostantes;
	}

	public void setApostantes(List<Apostante> apostantes) {
		this.apostantes = apostantes;
	}
}
