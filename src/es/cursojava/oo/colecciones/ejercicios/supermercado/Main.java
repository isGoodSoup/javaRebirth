package es.cursojava.oo.colecciones.ejercicios.supermercado;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.oo.colecciones.ejercicios.supermercado.alimentos.Baguette;
import es.cursojava.oo.colecciones.ejercicios.supermercado.alimentos.Manzana;
import es.cursojava.oo.colecciones.ejercicios.supermercado.alimentos.Platano;
import es.cursojava.utils.Executable;
import es.cursojava.utils.Gen;

public class Main implements Executable {
	private Supermercado market;
	private List<Cliente> clientes = new ArrayList<>();
	private List<List<Alimentos>> stock = new ArrayList<>();
	private List<Alimentos> platanos = new ArrayList<>();
	private List<Alimentos> baguettes = new ArrayList<>();
	private List<Alimentos> manzanas = new ArrayList<>();
	private static final Logger log = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
		main.exit();
	}

	@Override
	public void run() {
		market = new Supermercado("Aldi");
		log.info("Bienvenido al {}!", market.getNombre());
		
		List<Alimentos> car1 = new ArrayList<>();
		Cliente c1 = new Cliente(Gen.toGetName(), Gen.toGetID(), Gen.toGetInteger(18, 80), car1);
		clientes.add(c1);
		
		List<Alimentos> car2 = new ArrayList<>();
		Cliente c2 = new Cliente(Gen.toGetName(), Gen.toGetID(), Gen.toGetInteger(18, 80), car2);
		clientes.add(c2);
		
		List<Alimentos> car3 = new ArrayList<>();
		Cliente c3 = new Cliente(Gen.toGetName(), Gen.toGetID(), Gen.toGetInteger(18, 80), car3);
		clientes.add(c3);
		
		List<Alimentos> car4 = new ArrayList<>();
		Cliente c4 = new Cliente(Gen.toGetName(), Gen.toGetID(), Gen.toGetInteger(18, 80), car4);
		clientes.add(c4);
		
		Alimentos p1 = crearPlatano(new Platano("Canario"));
		Alimentos p2 = crearPlatano(new Platano("Maduro"));
		Alimentos p3 = crearPlatano(new Platano("Banana"));
		Alimentos p4 = crearPlatano(new Platano("Banana"));
		stock.add(platanos);
		car1.add(p2); car2.add(p4);
		
		Alimentos b1 = crearBaguette(new Baguette(true, "Baguette"));
		Alimentos b2 = crearBaguette(new Baguette(true, "Chapata"));
		Alimentos b3 = crearBaguette(new Baguette(false, "Integral"));
		Alimentos b4 = crearBaguette(new Baguette(true, "Negro"));
		stock.add(baguettes);
		car1.add(b4); car2.add(b3); car3.add(b2);
		
		Alimentos m1 = crearManzana(new Manzana("Verde"));
		Alimentos m2 = crearManzana(new Manzana("Roja"));
		Alimentos m3 = crearManzana(new Manzana("Verde claro"));
		Alimentos m4 = crearManzana(new Manzana("Roja"));
		stock.add(manzanas);
		car2.add(m4); car4.add(m2);
		
		
	}
	
	public Alimentos crearPlatano(Platano platano) {
		platanos.add(platano);
		return platano;
	}
	
	public Alimentos crearBaguette(Baguette baguette) {
		baguettes.add(baguette);
		return baguette;
	}
	
	public Alimentos crearManzana(Manzana manzana) {
		manzanas.add(manzana);
		return manzana;
	}
	
	@Override
	public void test() {}

	@Override
	public void exit() {
		System.exit(0);
	}
}
