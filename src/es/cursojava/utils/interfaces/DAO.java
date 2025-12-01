package es.cursojava.utils.interfaces;

/*
 * Interfaz que define las operaciones básicas de un DAO (Data Access Object)
 * para la gestión de entidades en una base de datos.
 * Métodos CRUD: Crear, Leer, Actualizar, Eliminar.
 */
public interface DAO {
	void guardar(Object obj);
	void leer(Object obj);
	void actualizar(Object obj);
	void eliminar(Object obj);
	Object encontrarPorId(long id);
	Object encontrarTodos();
	void commit();
}