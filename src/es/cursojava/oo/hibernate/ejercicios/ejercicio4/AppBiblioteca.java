package es.cursojava.oo.hibernate.ejercicios.ejercicio4;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.oo.hibernate.ejercicios.ejercicio4.dao.EstudianteDAO;
import es.cursojava.oo.hibernate.ejercicios.ejercicio4.entities.CarnetBiblioteca;
import es.cursojava.oo.hibernate.ejercicios.ejercicio4.entities.Estudiante;
import es.cursojava.utils.HibernateUtils;
import es.cursojava.utils.interfaces.Iniciable;
import utils.Dexter;

public class AppBiblioteca implements Iniciable {
	private EstudianteDAO dao = new EstudianteDAO();
	private int contador = 0;
	private final int MAX_ESTUDIANTES = 9;
	
	public static void main(String[] args) {
		new AppBiblioteca().init();
	}
	
	@Override
	public void init() {
		List<Estudiante> estudiantes = new ArrayList<>();
		Session session = HibernateUtils.getSession();
		Transaction tx = session.beginTransaction();
		
		while(contador < MAX_ESTUDIANTES) {
			System.out.println("Creando estudiante " + (contador + 1));
			if(contador == MAX_ESTUDIANTES) { break; }
			CarnetBiblioteca cb = new CarnetBiblioteca(Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.now().plusYears(1)));
			String nombre = Dexter.toGetName();
			Estudiante e = new Estudiante(nombre, Dexter.toGetEmail(nombre), Dexter.toGetInteger());
			e.setcarnetBiblioteca(cb);
			dao.guardar(e);
			estudiantes.add(e);
			contador++;
		}
		
		for (Estudiante e : estudiantes) {
			Estudiante est = session.get(Estudiante.class, 1);
			System.out.println(est);
			System.out.println(e.getCarnetBiblioteca().getFechaDeEmision());
		}
		
		tx.commit();
		session.close();
	}
}
