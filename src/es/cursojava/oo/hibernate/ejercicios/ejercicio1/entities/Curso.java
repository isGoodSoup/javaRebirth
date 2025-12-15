package es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import es.cursojava.oo.hibernate.ejercicios.ejercicio5.entities.Alumno;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CURSO")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CURSO_SEQ")
	@SequenceGenerator(name = "CURSO_SEQ", sequenceName = "SEQ_CURSO", allocationSize = 1)
	@Column(name = "ID")
	private Long id;
	@Column(name = "CODIGO", nullable = false)
	private int codigo;
	@Column(name = "NOMBRE", length = 100, nullable = false)
	private String nombre;
	@Column(name = "DESCRIPCION", length = 500)
	private String descripcion;
	@Column(name = "HORAS_TOTALES")
	private int horas_totales;
	@Column(name = "IS_ACTIVO")
	private boolean isActivo;
	@Column(name = "NIVEL", length = 50)
	private String nivel;
	@Column(name = "CATEGORIA", length = 100)
	private String categoria;
	@Column(name = "PRECIO")
	private BigDecimal precio;
	@Column(name = "FECHA_INICIO")
	private LocalDate fecha_inicio;
	@Column(name = "FECHA_FIN")
	private LocalDate fecha_fin;
	@Column(name = "FECHA_CREACION", nullable = true)
	private LocalDateTime fecha_creacion;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "AULA_ID")
	private Aula aula;
	@OneToMany( mappedBy = "curso", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Alumno> alumnos = new ArrayList<>();

	public Curso() {
		super();
	}

	public Curso(long id, int codigo, String nombre, String descripcion,
			int horas_totales, boolean isActivo, String nivel, String categoria,
			BigDecimal precio, LocalDate fecha_inicio, LocalDate fecha_fin,
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
			BigDecimal precio, LocalDate fecha_inicio, LocalDate fecha_fin,
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

	public Integer getCodigo() {
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

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
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

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public void addAlumno(Alumno alumno) {
        alumnos.add(alumno);
        alumno.setCurso(this);
    }

    public void removeAlumno(Alumno alumno) {
        alumnos.remove(alumno);
        alumno.setCurso(null);
    }
}
