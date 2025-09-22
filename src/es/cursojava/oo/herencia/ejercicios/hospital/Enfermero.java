package es.cursojava.oo.herencia.ejercicios.hospital;

public class Enfermero extends EmpleadosHospital {
	private int planta;
	
	public Enfermero() {}
	
	public Enfermero(String nombre, int edad, int planta) {
		super(nombre, edad);
		this.planta = planta;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public void atenderPaciente() {}
}
