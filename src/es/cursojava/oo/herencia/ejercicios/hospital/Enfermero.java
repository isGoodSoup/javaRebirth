package es.cursojava.oo.herencia.ejercicios.hospital;

public class Enfermero extends EmpleadosHospital {
	private int planta;
	
	public Enfermero() {}
	
	public Enfermero(int planta) {
		super();
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
