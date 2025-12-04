package es.cursojava.oo.hibernate.ejercicios.ejercicio1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Aula;
import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.utils.HibernateUtils;

/*
 * Clase DAO para la entidad Curso que maneja las operaciones CRUD utilizando Hibernate.
 * 
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
	
	public void eliminarCurso(Curso curso) {
		session.remove(curso);
	}

	public void actualizarCurso(Curso curso) {
		session.merge(curso);
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
	
	public void setAulaCurso(Aula aula, Curso curso) {
		curso.setAula(aula);
	}
	
	public Aula getAulaCurso(Curso curso) {
		return curso.getAula();
	}
}
