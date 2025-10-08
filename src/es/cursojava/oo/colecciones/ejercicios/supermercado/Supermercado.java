package es.cursojava.oo.colecciones.ejercicios.supermercado;

import java.util.List;
import java.util.Set;

public class Supermercado {
	private String nombre;
	private List<List<Alimentos>> stock;
	private Set<Cliente> clientes;
	
	public Supermercado() {}
	
	public Supermercado(String nombre) {
		this.nombre = nombre;
	}
	
	public Supermercado(String nombre, List<List<Alimentos>> stock, Set<Cliente> clientes) {
		super();
		this.nombre = nombre;
		this.stock = stock;
		this.clientes = clientes;
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
