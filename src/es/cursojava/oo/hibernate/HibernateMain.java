package es.cursojava.oo.hibernate;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import es.cursojava.oo.hibernate.empresa.entities.Empresa;

public class HibernateMain {
    public static void main(String[] args) {

        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure() // Carga hibernate.cfg.xml
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            System.out.println(session);
            
            Transaction tx = session.beginTransaction();
            
            Empresa empresa1 = new Empresa("Jabones Llorente", "S.A.", "4219543F", "Venta jabones", Calendar.getInstance().getTime());
    		Empresa empresa2 = new Empresa("FunkoPop", "S.A.", "4219543F", "Funkos pop", Calendar.getInstance().getTime());
    		
    		session.persist(empresa1);
    		session.persist(empresa2);
    		
    		tx.commit();
    		List<Empresa> empresas = session.createQuery("from Empresa", Empresa.class).list();
            
    		for (Empresa empresa : empresas) {
				System.out.println(empresa);
			}
    		
        } catch (Throwable ex) {
            System.err.println("Error al crear la SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
