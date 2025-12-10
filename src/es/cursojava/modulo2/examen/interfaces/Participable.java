package es.cursojava.modulo2.examen.interfaces;

import utils.Dexter;

public interface Participable {
	default public String getIdentificador() {
		return Dexter.toGetID();
	}
}
