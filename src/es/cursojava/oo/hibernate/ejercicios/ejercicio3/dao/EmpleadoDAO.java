package es.cursojava.oo.hibernate.ejercicios.ejercicio3.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.utils.HibernateUtils;
import es.cursojava.utils.interfaces.DAO;

/*
 * DAO (Data Access Object) para la entidad Empleado.
 * Proporciona métodos para realizar operaciones CRUD en la base de datos.
 * Utiliza Hibernate para la gestión de la persistencia.
 */
public class EmpleadoDAO implements DAO {
	private Session session;
	private Transaction tx;
	
	public EmpleadoDAO() {
		super();
		this.session = HibernateUtils.getSession();
		this.tx = session.beginTransaction();
	}

	@Override
	public void guardar(Object obj) {
		session.persist(obj);
	}

	@Override
	public void leer(Object obj) {
		session.refresh(obj);
	}

	@Override
	public void actualizar(Object obj) {
		session.merge(obj);
	}

	@Override
	public void eliminar(Object obj) {
		session.remove(obj);
	}

	@Override
	public Object encontrarPorId(long id) {
		return session.get(Object.class, id);
	}

	@Override
	public List<Object> encontrarTodos() {
		return session.createQuery("from TB_EMPLEADO", Object.class).list();
	}

	@Override
	public void commit() {
		tx.commit();
	}

}
