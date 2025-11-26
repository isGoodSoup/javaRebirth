package es.cursojava.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 * Clase de utilidad para gestionar la sesión de Hibernate.
 * Proporciona métodos para obtener sesiones y realizar operaciones básicas.
 * Métodos:
 * - getSession(): Obtiene una nueva sesión de Hibernate.
 * - insert(Object insertable): Inserta un objeto en la base de datos.
 * - shutdown(): Cierra la fábrica de sesiones.
 */
public class HibernateUtils {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    /*
	 * Construye la fábrica de sesiones utilizando la configuración de Hibernate.
	 * @return La fábrica de sesiones.
	 */
    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            System.err.println("Error creando SessionFactory: " + e.getMessage());
            throw new ExceptionInInitializerError(e);
        }
    }
    
    /*
     * Obtiene una nueva sesión de Hibernate.
     * @return Una nueva sesión de Hibernate.
     */
    public static Session getSession() {
        return sessionFactory.openSession();
    }

    /*
	 * Inserta un objeto en la base de datos.
	 * @param insertable El objeto a insertar.
	 */
    public static void insert(Object insertable) {
    	Transaction tx = null;
        try (Session session = getSession()) {
        	tx = session.beginTransaction();
            session.persist(insertable);
            tx.commit();
        } catch (Exception e) {
            System.err.println("Error insertando objeto: " + e.getMessage());
        }
    }
    
    /*
     * Cierra la fábrica de sesiones.
     */
    public static void shutdown() {
        sessionFactory.close();
    }
}
