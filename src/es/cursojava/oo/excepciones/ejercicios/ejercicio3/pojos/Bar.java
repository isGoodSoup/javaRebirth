package es.cursojava.oo.excepciones.ejercicios.ejercicio3.pojos;

import es.cursojava.utils.Dexter;

public class Bar {
	private String nombre;

	public Bar(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void abrirBar() {
		Dexter.toGetString(this.getNombre().toUpperCase());
		Huesped huesped = new Huesped(
					Dexter.toGetName(), 
					Dexter.toGetID(),
					Dexter.toGetInteger(18, 60)
				);
		Comensal comensal = new Comensal(
					Dexter.toGetName(), 
					Dexter.toGetID(), 
					Dexter.toGetInteger(18, 60), 
					true
				);
		ClienteAsiduo cliente = new ClienteAsiduo(
					Dexter.toGetName(),
					Dexter.toGetID(),
					Dexter.toGetInteger(18, 60),
					"Borracho/a"
				);
		
		ClienteAsiduo cliente2 = new ClienteAsiduo(
				Dexter.toGetName(),
				Dexter.toGetID(),
				Dexter.toGetInteger(18, 60),
				"Pepillo/a"
			);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
