package es.cursojava.oo.colecciones.ejercicios.supermercado;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.cursojava.oo.colecciones.ejercicios.supermercado.alimentos.Baguette;
import es.cursojava.oo.colecciones.ejercicios.supermercado.alimentos.Manzana;
import es.cursojava.oo.colecciones.ejercicios.supermercado.alimentos.Platano;

public class Supermercado {
	private String nombre;
	private List<Alimentos> platanos = new ArrayList<>();
	private List<Alimentos> baguettes = new ArrayList<>();
	private List<Alimentos> manzanas = new ArrayList<>();
	private List<List<Alimentos>> stock;
	private Set<Cliente> clientes;
	
	public Supermercado() {}
	
	public Supermercado(String nombre) {
		super();
		this.nombre = nombre;
		this.stock = new ArrayList<>();
		this.clientes = new HashSet<>();
	}
	
	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void toStock() {
		List<List<Alimentos>> stock = new ArrayList<>();
		
		crearAlimentos(new Platano("Canario"));
		crearAlimentos(new Platano("Maduro"));
		crearAlimentos(new Platano("Banana"));
		crearAlimentos(new Platano("Banana"));
		stock.add(platanos);
		
		crearAlimentos(new Baguette(true, "Baguette"));
		crearAlimentos(new Baguette(true, "Chapata"));
		crearAlimentos(new Baguette(false, "Integral"));
		crearAlimentos(new Baguette(true, "Negro"));
		stock.add(baguettes);
		
		crearAlimentos(new Manzana("Verde"));
		crearAlimentos(new Manzana("Roja"));
		crearAlimentos(new Manzana("Verde claro"));
		crearAlimentos(new Manzana("Rubi"));
		stock.add(manzanas);
		
		this.stock = stock;
	}
	
	public Alimentos crearAlimentos(Platano platano) {
		platanos.add(platano);
		return platano;
	}
	
	public Alimentos crearAlimentos(Baguette baguette) {
		baguettes.add(baguette);
		return baguette;
	}
	
	public Alimentos crearAlimentos(Manzana manzana) {
		manzanas.add(manzana);
		return manzana;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<List<Alimentos>> getStock() {
		return stock;
	}
	
	public void setStock(List<List<Alimentos>> stock) {
		this.stock = stock;
	}
	
	public Set<Cliente> getClientes() {
		return clientes;
	}
	
	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
}
