package es.cursojava.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 * Clase de utilidades para manejar la conexión y operaciones básicas con Hibernate.
 * Métodos:
 * connect: Establece una conexión con la base de datos y devuelve una sesión.
 * insert: Inserta un objeto en la base de datos.
 */
public class HibernateUtils {
	
	/*
	 * Establece una conexión con la base de datos y devuelve una sesión.
	 * @return Session - La sesión de Hibernate para interactuar con la base de datos.
	 */
	public static Session connect() {
		Session session = null;
        try {
			SessionFactory sessionFactory = new Configuration()
	                .configure() // Carga hibernate.cfg.xml
	                .buildSessionFactory();
			
	        session = sessionFactory.openSession();
	        System.out.println(session);
	        
		} catch (Throwable e) {
	        System.err.println("Error al crear la SessionFactory." + e);
	        throw new ExceptionInInitializerError(e);
	    }
        return session;
	}
	
	/*
	 * Inserta un objeto en la base de datos.
	 * @param insertable - El objeto a insertar en la base de datos.
	 * @return
	 * Transaction - La transacción realizada.
	 */
	public static Transaction insert(Object insertable) {
		Transaction tx = null;
        try {
			SessionFactory sessionFactory = new Configuration()
	                .configure() // Carga hibernate.cfg.xml
	                .buildSessionFactory();

	        Session session = sessionFactory.openSession();
	        tx = session.beginTransaction();
	        session.persist(insertable);
	        
	        tx.commit();
		} catch (Throwable e) {
	        System.err.println("Error al crear la SessionFactory." + e);
	        throw new ExceptionInInitializerError(e);
	    }
        return tx;
	}
}
