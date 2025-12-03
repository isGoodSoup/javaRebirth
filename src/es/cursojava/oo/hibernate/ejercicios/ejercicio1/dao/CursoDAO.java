package es.cursojava.oo.hibernate.ejercicios.ejercicio1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.utils.HibernateUtils;

/*
 * Clase DAO para la entidad Curso.
 * Proporciona métodos para realizar operaciones CRUD en la base de datos.
 * Métodos incluidos:
 * - guardarCurso: Guarda un nuevo curso en la base de datos.
 * - eliminarCurso: Elimina un curso de la base de datos.
 * - actualizarCurso: Actualiza un curso existente en la base de datos.
 * - obtenerCursoPorId: Obtiene un curso por su ID.
 * - obtenerTodosLosCursos: Obtiene una lista de todos los cursos en la base de datos.
 * - commitTransaction: Confirma la transacción actual.
 */
public class CursoDAO {
	
	private Session session;
	private Transaction transaction;
	
	public CursoDAO() {
		this.session = HibernateUtils.getSession();
		this.transaction = session.beginTransaction();
	}
	
	public void guardarCurso(Curso curso) {
		session.persist(curso);
	}
	
	public void eliminarCurso() {
		
	}

	public void actualizarCurso() {
		
	}
	
	public Curso obtenerCursoPorId(Long id) {
		return session.get(Curso.class, id);
	}
	
	public List<Curso> obtenerTodosLosCursos() {
		return session.createQuery("from Curso", Curso.class).list();
	}

	public void commitTransaction() {
		transaction.commit();
	}
	
	
	
}
