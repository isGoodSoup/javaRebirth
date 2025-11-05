package es.cursojava.modulo2.examen.interfaces;

import es.cursojava.utils.Charlie;

public interface Participable {
	default public String getIdentificador() {
		return Charlie.toGetID();
	}
}
