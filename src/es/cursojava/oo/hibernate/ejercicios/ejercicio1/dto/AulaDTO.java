package es.cursojava.oo.hibernate.ejercicios.ejercicio1.dto;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Aula;

public class AulaDTO extends Aula {
	private Long id;
	private String nombre;
	private String ubicacion;
	private Integer capacidad;
	
	public AulaDTO() {}
	
	public AulaDTO(String nombre, String ubicacion, Integer capacidad) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.capacidad = capacidad;
	}

	public AulaDTO(Long id, String nombre, String ubicacion, Integer capacidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.capacidad = capacidad;
	}
	
	public AulaDTO(String nombre, Integer capacidad, String ubicacion) {
		super();
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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
}
