package es.cursojava.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Loggable {
	protected final Logger LOG = LoggerFactory.getLogger(getClass().getSimpleName());
}
