package es.cursojava.oo.excepciones.ejercicios.ejercicio3.pojos;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.oo.excepciones.ejercicios.ejercicio3.excepciones.ExtremeTemperatureException;
import es.cursojava.utils.Dexter;

public class Bar {
	private String nombre;

	public Bar(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void abrirBar() {
		Dexter.toGetString(this.getNombre().toUpperCase());
		List<Cliente> clientes = entrarClientes();
		for (Cliente c : clientes) {
			c.beberCafe();
		}
	}
	
	private List<Cliente> entrarClientes() {
		List<Cliente> clientes = new ArrayList<>();
		Huesped huesped = new Huesped(
					Dexter.toGetName(), 
					Dexter.toGetID(),
					Dexter.toGetInteger(18, 60)
				);
		clientes.add(huesped);
		Comensal comensal;
		try {
			comensal = new Comensal(
						Dexter.toGetName(), 
						Dexter.toGetID(), 
						Dexter.toGetInteger(18, 60), 
						new TazaCafe("negro", Math.random() * 100),
						true
					);
			clientes.add(comensal);
		} catch (ExtremeTemperatureException e) {
			Dexter.printException(e);
		}
		
		ClienteAsiduo cliente;
		try {
			cliente = new ClienteAsiduo(
						Dexter.toGetName(),
						Dexter.toGetID(),
						Dexter.toGetInteger(18, 60),
						new TazaCafe("bombón", Math.random() * 100),
						"Cuentín"
					);
			clientes.add(cliente);
		} catch (ExtremeTemperatureException e) {
			Dexter.printException(e);
		}
		
		ClienteAsiduo cliente2;
		try {
			cliente2 = new ClienteAsiduo(
						Dexter.toGetName(),
						Dexter.toGetID(),
						Dexter.toGetInteger(18, 60),
						new TazaCafe("suave", Math.random() * 100),
						"Pepillo/a"
					);
			clientes.add(cliente2);
		} catch (ExtremeTemperatureException e) {
			Dexter.printException(e);
		}
		return clientes;
	}
}
