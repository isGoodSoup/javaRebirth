package es.cursojava.oo.ejercicios.hospital;

public class Habitacion {
	private int numero;
	private Paciente paciente;
	
	public Habitacion() {
		
	}

	public Habitacion(int numero, Paciente paciente) {
		super();
		this.numero = numero;
		this.paciente = paciente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}
