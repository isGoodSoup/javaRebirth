package es.cursojava.utils;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAO {

	private Session session;
	private Transaction transaction;
	
	public DAO() {
		session = HibernateUtils.getSession();
		transaction = session.beginTransaction();
	}
	
	public void guardar(Object obj) {
		session.persist(obj);
	}
	
	public void eliminarCurso() {
		
	}

	public void actualizarCurso() {
		
	}
	
	public void commitTransaction() {
		transaction.commit();
	}
}
