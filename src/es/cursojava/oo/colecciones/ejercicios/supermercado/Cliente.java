package es.cursojava.oo.colecciones.ejercicios.supermercado;

import java.util.List;

public class Cliente extends Persona {
	private List<Alimentos> carrito;
	
	public Cliente(String nombre, String dni, int edad, List<Alimentos> carrito) {
		super(nombre, dni, edad);
		this.carrito = carrito;
	}

	public List<Alimentos> getCarrito() {
		return carrito;
	}

	public void setCarrito(List<Alimentos> carrito) {
		this.carrito = carrito;
	}
}
