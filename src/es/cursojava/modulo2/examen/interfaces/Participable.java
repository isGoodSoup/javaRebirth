package es.cursojava.modulo2.examen.interfaces;

import es.cursojava.utils.Utils;

public interface Participable {
	default public String getIdentificador() {
		return Utils.toGetID();
	}
}
