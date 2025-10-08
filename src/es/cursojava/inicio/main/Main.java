package es.cursojava.inicio.main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.Gen;

public class Main {
	private static final Logger log = LoggerFactory.getLogger(new Object() {}.getClass().getEnclosingClass());
	
	public static void main(String[] args) {
//		log.error("error");
//		log.warn("warn");
//		log.info("info");
//		log.debug("debug");
		Main main = new Main();
		main.run();
	}
	
	public void run() {
		log.info(Gen.toGetID());
	}
}