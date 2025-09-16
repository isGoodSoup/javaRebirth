package es.cursojava.oo.herencia;

public class Vaca extends Animal {
	private int numCuernos;

	public Vaca() {
	
	}

	public Vaca(String nombre, double peso, 
			long id, int numCuernos) {
		super(nombre, peso, id);
	}
	
	public void mugir() {
		System.out.println("El animal " + this.getNombre() + " está mugiendo");
	}

	public int getNumCuernos() {
		return numCuernos;
	}

	public void setNumCuernos(int numCuernos) {
		this.numCuernos = numCuernos;
	}
}
