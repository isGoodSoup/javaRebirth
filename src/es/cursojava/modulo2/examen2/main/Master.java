package es.cursojava.modulo2.examen2.main;

public class Master extends CursoImpl {
	private boolean oficial;
	private String curso;
	private int codigo;
	private int cupo;
	
	public Master(boolean oficial, String curso, int codigo, int cupo) {
		super();
		this.oficial = oficial;
		this.curso = curso;
		this.codigo = codigo;
		this.cupo = cupo;
	}

	public boolean isOficial() {
		return oficial;
	}

	public void setOficial(boolean oficial) {
		this.oficial = oficial;
	}

	@Override
	public String getCurso() {
		return this.curso;
	}

	@Override
	public int getCodigo() {
		return this.codigo;
	}

	@Override
	public int getCupo() {
		return this.cupo;
	}

	@Override
	public String toString() {
		return codigo + " - " + curso + ", " + cupo + ", " + oficial;
	}
}
