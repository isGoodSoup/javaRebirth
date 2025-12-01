package es.cursojava.utils;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.utils.interfaces.DAO;

public class CursoDAO implements DAO {
	private Session session;
	private Transaction transaction;
	
	public CursoDAO() {
		session = HibernateUtils.getSession();
		transaction = session.beginTransaction();
	}
	
	@Override
	public void guardar(Object obj) {
		session.persist(obj);
	}

	@Override
	public void leer(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object encontrarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object encontrarTodos() {
		return null;
	}

	@Override
	public void commit() {
		transaction.commit();
	}
}
