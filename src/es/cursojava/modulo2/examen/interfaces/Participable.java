package es.cursojava.modulo2.examen.interfaces;

import es.cursojava.utils.CAT;

public interface Participable {
	default public String getIdentificador() {
		return CAT.toGetID();
	}
}
