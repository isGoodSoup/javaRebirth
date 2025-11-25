package es.cursojava.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
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
