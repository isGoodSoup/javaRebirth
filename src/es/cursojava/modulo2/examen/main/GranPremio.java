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
	
	public void init() {
		System.out.println("Bienvenido al " + this.getNombre());
		this.carreras = crearCarreras();
		this.apostantes = crearApostantes();
		for (int i = 0; i < apostantes.size(); i++) {
			double saldo = CAT.toScanDouble("Introduce tu saldo");
			do {
				Menu.printMenu(Menu.getMenuCarreras(this.carreras));
				opcion = CAT.toScanInt("Elige una carrera para apostar");
				switch(opcion) {
					case 1 -> { carrera = carreras.get(0); }
					case 2 -> { carrera = carreras.get(1); }
					case 3 -> { carrera = carreras.get(2); }
				}
			} while(saldo > 0 && opcion < 3);
			
			do {
				Menu.printMenu(Menu.getMenuCaballos(this.carrera.getCaballos()));
				opcion = CAT.toScanInt("Elige un caballo para apostar");
				switch(opcion) {
					case 1 -> { 
						Apostante apos = this.apostantes.get(i);
						Caballo caballo = this.carrera.getCaballos().get(opcion);
						double importe = CAT.toScanDouble("Introduce tu apuesta");
						
						Apuesta apuesta = new Apuesta(apos, caballo, importe);
						if(apuesta.getImporte() > saldo) System.err.println();
					}
				}
			} while(saldo > 0 && opcion < 7);
		}
		mostrarResumen();
	}
	
	private List<Carrera> crearCarreras() {
		List<Caballo> caballos1 = crearCaballos();
		Carrera c1 = new Carrera("4000 metros", 4100.0, caballos1);
		carreras.add(c1);
		
		List<Caballo> caballos2 = crearCaballos();
		Carrera c2 = new Carrera("2500 metros", 2560.0, caballos2);
		carreras.add(c2);
		
		List<Caballo> caballos3 = crearCaballos();
		Carrera c3 = new Carrera("3000 metros", 3020.0, caballos3);
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
	
	private List<Caballo> crearCaballos() {
		List<Caballo> caballos = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			Jinete jinete = SimUtils.crearJinete();
			Caballo caballo = SimUtils.crearCaballoAleatorio(nombre, jinete);
			caballos.add(caballo);
		}
		return caballos;
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

	public Jinete getJinete() {
		return jinete;
	}

	public void setJinete(Jinete jinete) {
		this.jinete = jinete;
	}
}
