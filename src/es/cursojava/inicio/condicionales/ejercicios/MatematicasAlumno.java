package es.cursojava.inicio.condicionales.ejercicios;

public class MatematicasAlumno {
	public static void main( String[] args ) {
		
		String asignatura = "Matemáticas";
		String nombreAlumno = "Juan";
		int nota = 9;
		String evaluacion = null;
		
		if (nota < 5) {
			evaluacion = "Suspenso";
		} else if (nota > 5 || nota < 7) {
			evaluacion = "Aprovado";
		} else if (nota > 7 || nota < 9) {
			evaluacion = "Notable";
		} else if (nota == 9 || nota == 10) {
			evaluacion = "Sobresaliente";
		}
	
		System.out.println("El alumno " + nombreAlumno + " en la asignatura " + asignatura + " tiene un " + evaluacion);
	}
}
