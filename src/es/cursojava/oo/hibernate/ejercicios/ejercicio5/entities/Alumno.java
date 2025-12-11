package es.cursojava.oo.hibernate.ejercicios.ejercicio5.entities;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Curso;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "TB_ALUMNO")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ALUMNO")
	private Long id;
	@Column(name = "NOMBRE", nullable = false, unique = true, length = 100)
	private String nombre;
	@Column(name = "EMAIL", nullable = true, unique = true, length = 50)
	private String email;
	@Column(name = "EDAD", nullable = false)
	@Min(18)
	@Max(90)
	private int edad;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODIGO_CURSO", referencedColumnName = "CODIGO")
	private Curso curso;

	public Alumno() {}

	public Alumno(String nombre, String email, @Min(18) @Max(90) int edad,
			Curso curso) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.curso = curso;
	}
	
	public Alumno(String nombre, String email, @Min(18) @Max(90) int edad) {
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

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", email=" + email + ", edad="
				+ edad + "]";
	}
}
