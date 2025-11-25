package es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CURSO")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	private int codigo;
	private String nombre;
	private String descripcion;
	private int horas_totales;
	private boolean isActivo;
	private String nivel;
	private String categoria;
	private double precio;
	private LocalDate fecha_inicio;
	private LocalDate fecha_fin;
	private LocalDateTime fecha_creacion;
	
	public Curso() {
		super();
	}

	public Curso(long id, int codigo, String nombre, String descripcion,
			int horas_totales, boolean isActivo, String nivel, String categoria,
			double precio, LocalDate fecha_inicio, LocalDate fecha_fin,
			LocalDateTime fecha_creacion) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horas_totales = horas_totales;
		this.isActivo = isActivo;
		this.nivel = nivel;
		this.categoria = categoria;
		this.precio = precio;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.fecha_creacion = fecha_creacion;
	}

	public Curso(int codigo, String nombre, String descripcion,
			int horas_totales, boolean isActivo, String nivel, String categoria,
			double precio, LocalDate fecha_inicio, LocalDate fecha_fin,
			LocalDateTime fecha_creacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horas_totales = horas_totales;
		this.isActivo = isActivo;
		this.nivel = nivel;
		this.categoria = categoria;
		this.precio = precio;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.fecha_creacion = fecha_creacion;
	}
	
	public Curso(long id, int codigo, String nombre, String descripcion,
			int horas_totales, boolean isActivo, LocalDateTime fecha_creacion) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horas_totales = horas_totales;
		this.isActivo = isActivo;
		this.fecha_creacion = fecha_creacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getHoras_totales() {
		return horas_totales;
	}

	public void setHoras_totales(int horas_totales) {
		this.horas_totales = horas_totales;
	}

	public boolean isActivo() {
		return isActivo;
	}

	public void setActivo(boolean isActivo) {
		this.isActivo = isActivo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public LocalDate getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public LocalDate getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(LocalDate fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public LocalDateTime getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(LocalDateTime fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
}
