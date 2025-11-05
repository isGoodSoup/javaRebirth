package es.cursojava.modulo2.examen.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import es.cursojava.utils.Utils;
import es.cursojava.utils.Menu;
import es.cursojava.utils.SimUtils;

public class GranPremio {
	private String nombre;
	private List<Carrera> carreras;
	private List<Apostante> apostantes;
	private Carrera carrera;
	private Jinete jinete;
	private int opcion;
	private double importe;
	private Random random = new Random();
	
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
		this.carreras = iniciarApuestas();
		this.carreras = empezarCarreras();
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
		Apostante a1 = new Apostante(Utils.toGetName(), Utils.toGetInteger(80, 100), 500);
		apostantes.add(a1);
		Apostante a2 = new Apostante(Utils.toGetName(), Utils.toGetInteger(80, 100), 700);
		apostantes.add(a2);
		Apostante a3 = new Apostante(Utils.toGetName(), Utils.toGetInteger(80, 100), 800);
		apostantes.add(a3);
		return apostantes;
	}
	
	public List<Carrera> empezarCarreras() {
	    for (Carrera c : carreras) {
	        System.out.println("\nEmpezando carrera: " + c.getNombre());
	        boolean haTerminadoCarrera = false;
	        Caballo ganador = null;
	        int turnos = 0;

	        while (!haTerminadoCarrera && turnos < 10000) {
	            for (Caballo caballo : c.getCaballos()) {
	                caballo.aplicarAvance(caballo.calcularAvanceTurno());

	                if (caballo.getMetrosRecorridos() >= c.getDistanciaObjetivo()) {
	                    ganador = caballo;
	                    haTerminadoCarrera = true;
	                    break;
	                }
	            }
	            turnos++;
	        }

	        if (!haTerminadoCarrera) {
	            ganador = c.getCaballos().get(random.nextInt(c.getCaballos().size()));
	            System.out.println("Ningún caballo terminó, se elige ganador aleatorio: " + ganador.getNombre());
	            return carreras;
	        }

	        System.out.println("Ganador: " + ganador.getNombre());
	        for (Apuesta apuesta : c.getApuestas()) {
	            if (apuesta.getCaballo().equals(ganador)) {
	                double premio = apuesta.getImporte() * 2;
	                apuesta.getApostante().sumarSaldo(premio);
	                System.out.println(apuesta.getApostante().getNombre() + " gana " + premio + "€!");
	            }
	        }
	        System.out.println("=====================================");
	    }
	    return carreras;
	}

	public List<Carrera> iniciarApuestas() {
		int[] apuestas = new int[apostantes.size()];
		for (int i = 0; i < apostantes.size(); i++) {
			Apostante apos = apostantes.get(i);
			double saldo = Utils.toScanDouble("\n" + apos.getNombre() + ", introduce tu saldo");
			apos.setSaldo(saldo);
			
			do {
			    Menu.printMenu(Menu.getMenuCarreras(this.carreras));
			    opcion = Utils.toScanInt("Elige una carrera para apostar");
			} while(opcion < 1 || opcion > carreras.size());
			carrera = carreras.get(opcion - 1);
			
			do {
			    Menu.printMenu(Menu.getMenuCaballos(this.carrera.getCaballos()));
			    opcion = Utils.toScanInt("Elige un caballo para apostar");
			} while(opcion < 1 || opcion > carrera.getCaballos().size());
			
			apuestas[i] = opcion;

			do {
	            this.importe = Utils.toScanDouble("Introduce tu apuesta");
	            if (importe > saldo)
	                System.err.println("No puedes apostar más de lo que tienes!");
	        } while (importe > saldo);

			Caballo caballo = carrera.getCaballos().get(opcion - 1);
	        Apuesta apuesta = new Apuesta(apos, caballo, importe);
	        apos.restarSaldo(importe);
	        carrera.addApuesta(apuesta);
	        mostrarResumen(apos, caballo, importe);
		}
		return this.carreras;
	}
	
	private List<Caballo> crearCaballos() {
		List<Caballo> caballos = new ArrayList<>();
		while (caballos.size() < 6) {
			Jinete jinete = SimUtils.crearJinete();
			Caballo caballo = SimUtils.crearCaballoAleatorio(nombre, jinete);
			
			boolean repetido = caballos.stream()
		            .anyMatch(c -> c.getNombre().equalsIgnoreCase(caballo.getNombre()));
			if (!repetido) caballos.add(caballo);
		}
		return caballos;
	}
	
	private void mostrarResumen(Apostante apos, Caballo caballo, double importe) {
		System.out.println("Apuesta registrada: " + apos.getNombre() +
                " apostó " + importe + "€ \nal caballo " + caballo.getNombre() +
                " en la carrera de " + carrera.getNombre());
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

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}
}
