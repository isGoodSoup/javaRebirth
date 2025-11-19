package es.cursojava.modulo2.examen2.main;

import es.cursojava.utils.Loggable;
import es.cursojava.utils.interfaces.Curso;

public class CursoImpl extends Loggable implements Curso {

	@Override
	public String getCurso() {
		return null;
	}

	@Override
	public int getCodigo() {
		return 0;
	}

	@Override
	public int getCupo() {
		return 0;
	}
}
