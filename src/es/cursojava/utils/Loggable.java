package es.cursojava.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Clase base para proporcionar funcionalidad de registro (logging) a las clases que la extienden.
 * Proporciona un logger configurado con el nombre de la clase hija.
 * 
 * Esto facilita el seguimiento y depuración del código al permitir 
 * que cada clase tenga su propio logger.
 * 
 * Las clases que extienden Loggable pueden utilizar el logger para 
 * registrar mensajes de información, advertencias, errores, etc.
 */
public abstract class Loggable {
	protected final Logger LOG = LoggerFactory.getLogger(getClass().getSimpleName());
}
