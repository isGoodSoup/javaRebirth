package es.cursojava.oo.hibernate.ejercicios.ejercicio5.dto;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.oo.hibernate.ejercicios.ejercicio5.entities.Alumno;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class AlumnoDTO extends Alumno {
	private Long id;
	private String nombre;
	private String email;
	private int edad;
	private int codigo_curso;
	private Curso curso;
	
	public AlumnoDTO() {}
	
	public AlumnoDTO(String nombre, String email, int edad, int codigo_curso,
			Curso curso) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.codigo_curso = codigo_curso;
		this.curso = curso;
	}

	public AlumnoDTO(String nombre, String email, int edad, int codigo_curso) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.codigo_curso = codigo_curso;
	}
	
	public AlumnoDTO(String nombre, String email, @Min(18) @Max(90) int edad) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCodigo_curso() {
		return codigo_curso;
	}

	public void setCodigo_curso(int codigo_curso) {
		this.codigo_curso = codigo_curso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
