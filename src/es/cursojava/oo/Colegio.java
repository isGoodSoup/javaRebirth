package es.cursojava.oo;

public class Colegio {
	
	static Alumno alumnoEstático;
	
	public static void main(String[] args) {
		
		alumnoEstático = new Alumno();
		alumnoEstático.setNombre("Estático"); 
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Alumno1");
		alumno1.setDNI("1111A");
		alumno1.setNotaMedia(7.5);
		String[] asignaturasAlumno = {"Historia","Física", "Química"};
		alumno1.setAsignaturas(asignaturasAlumno);

		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Alumno2");
		alumno2.setDNI("2222B");
		alumno2.setNotaMedia(4.5);
		alumno2.setAsignaturas(new String[] {"Lengua","Matemáticas"});
		
		Alumno alumno3 = new Alumno();
		alumno3.setNombre("Alumno3");
		alumno3.setDNI("333C");
		alumno3.setNotaMedia(9.5);
		alumno3.setAsignaturas(asignaturasAlumno);
		
		Alumno alumno4 = new Alumno("Alumno4", "4444D");
		alumno4.setNotaMedia(8.0);
		alumno4.setAsignaturas(new String[] {"Física","Química"});
		
		Alumno alumno5 = new Alumno("Alumno5", "5555E", 4, asignaturasAlumno);
		
		Alumno[] alumnos = {alumno1,alumno2,alumno3,alumno4,alumno5};
		Colegio colegio = new Colegio();
		colegio = new Colegio();
		colegio.estudiarAlumnos(alumnos);	
	}
	
	
	public void estudiarAlumnos (Alumno[] alumnos) {
		String asignatura = "";
		for (Alumno alumno : alumnos) {
			asignatura = alumno.getAsignaturas()[0];
			System.out.println(alumno);
			System.out.println(asignatura);
			alumno.estudiar();
		}
		
	}
}
