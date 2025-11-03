package es.cursojava.modulo2.examen.main;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.getNombre();
		main.run();
	}
	
	public String getNombre() {
		return "DDP";
	}
	
	public void run() {
		GranPremio premio = new GranPremio("Gran Premio de Madrid");
		premio.empezarGranPremio();
	}
}
