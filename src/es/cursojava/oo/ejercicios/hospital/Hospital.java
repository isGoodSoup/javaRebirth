package es.cursojava.oo.ejercicios.hospital;

public class Hospital {
	private String nombre;
	
	public static void main(String[] args) {
		Hospital hospital = new Hospital("Hospital Santa María de Jesús");
		hospital.abrirHospital();
	}
	
	public Hospital() {
		
	}
	
	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void abrirHospital() {
		Paciente[][] pacientes = new Paciente[3][];
	}
}
