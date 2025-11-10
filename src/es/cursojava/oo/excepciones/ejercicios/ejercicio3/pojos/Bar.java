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
	
	public void abrirBar() {
		Dexter.toGetString(this.getNombre().toUpperCase());
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
						new TazaCafe("negro", 40),
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
						new TazaCafe("bombón", 10),
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
						new TazaCafe("suave", 90),
						"Pepillo/a"
					);
			clientes.add(cliente2);
		} catch (ExtremeTemperatureException e) {
			Dexter.printException(e);
		}
		
		for (Cliente c : clientes) {
			c.beberCafe();
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
