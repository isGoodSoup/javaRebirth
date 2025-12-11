package es.cursojava.oo.hibernate.ejercicios.ejercicio1.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Curso;

public class CursoDTO extends Curso {
	private String nombre;
	private Integer codigo;
	private String descripcion;
	private Integer duracionHoras;
	private Boolean isActivo = Boolean.TRUE;
	private String nivel;
	private String categoria;
	private BigDecimal precio;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalDateTime fechaCreacion;
	private AulaDTO aulaDTO;
	
	public CursoDTO() {}

	public CursoDTO(String nombre, Integer codigo, String descripcion,
			Integer duracionHoras, Boolean isActivo, String nivel,
			String categoria, BigDecimal precio, LocalDate fechaInicio,
			LocalDate fechaFin, LocalDateTime fechaCreacion, AulaDTO aulaDTO) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.duracionHoras = duracionHoras;
		this.isActivo = isActivo;
		this.nivel = nivel;
		this.categoria = categoria;
		this.precio = precio;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.fechaCreacion = fechaCreacion;
		this.aulaDTO = aulaDTO;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getDuracionHoras() {
		return duracionHoras;
	}

	public void setDuracionHoras(Integer duracionHoras) {
		this.duracionHoras = duracionHoras;
	}

	public Boolean IsActivo() {
		return isActivo;
	}

	public void setActivo(Boolean isActivo) {
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

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public AulaDTO getAulaDTO() {
		return aulaDTO;
	}

	public void setAulaDTO(AulaDTO aulaDTO) {
		this.aulaDTO = aulaDTO;
	}
}
