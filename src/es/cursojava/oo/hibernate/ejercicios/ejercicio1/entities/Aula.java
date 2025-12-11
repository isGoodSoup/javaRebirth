package es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_AULAS")
public class Aula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AULA_ID")
	private Long id;
	@Column(name = "NOMBRE", unique = true, nullable = false, length = 50)
	private String nombre;
	@Column(name = "UBICACION", nullable = false, length = 100)
	private String ubicacion;
	@Column(name = "CAPACIDAD", nullable = false, length = 3)
	private Integer capacidad;
	
	public Aula() {}
	
	public Aula(String nombre, String ubicacion, Integer capacidad) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.capacidad = capacidad;
	}
	
	public Aula(String nombre, Integer capacidad, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.capacidad = capacidad;
	}

	public Aula(Long id, String nombre, String ubicacion, Integer capacidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.capacidad = capacidad;
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

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
}
