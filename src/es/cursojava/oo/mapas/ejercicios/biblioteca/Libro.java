package es.cursojava.oo.mapas.ejercicios.biblioteca;

public class Libro {
	private String titulo;
	private long isbn;
	private int anio;
	
	public Libro(String titulo, long isbn, int anio) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.anio = anio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
}
