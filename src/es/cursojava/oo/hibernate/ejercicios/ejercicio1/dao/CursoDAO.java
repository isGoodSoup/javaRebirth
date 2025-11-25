package es.cursojava.oo.hibernate.ejercicios.ejercicio1.dao;

import java.util.List;

import org.hibernate.Session;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Curso;

/*
 * Métodos CRUD (Create, Read, Update, Delete):
 * guardarCurso
 * obtenerCurso
 * actualizarCurso
 * eliminarCurso
 * obtenerCursoPorId
 * obtenerTodosLosCursos
 */
public class CursoDAO {
	private Session session;
	
	public CursoDAO() {
		super();
	}
	
	/*
	 * Guardar un nuevo curso en la base de datos.
	 */
	public void guardarCurso(Curso curso) {
		session.persist(curso);
	}
	
	/*
	 * Obtener un curso de la base de datos.
	 */
	public void obtenerCurso() {
		
	}
	
	/*
	 * Actualizar los detalles de un curso existente.
	 */
	public void actualizarCurso() {
		
	}
	
	/*
	 * Eliminar un curso de la base de datos.
	 */
	public void eliminarCurso() {
		
	}
	
	/*
	 * Obtener un curso por su ID.
	 */
	public void obtenerCursoPorId() {
		
	}
	
	/*
	 * Obtener todos los cursos de la base de datos.
	 */
	public List<Curso> obtenerTodosLosCursos() {
		return session.createQuery("FROM Curso", Curso.class).list();
	}
}
