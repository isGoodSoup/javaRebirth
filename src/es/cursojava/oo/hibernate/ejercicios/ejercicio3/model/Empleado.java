package es.cursojava.oo.hibernate.ejercicios.ejercicio3.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_EMPLEADO")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EMPLEADO")
	private Long id;
	@Column(name = "NIF", nullable = false, unique = true)
	private String nif;
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;
	@Column(name = "DEPARTAMENTO", nullable = false)
	private String departamento;
	@Column(name = "SALARIO", nullable = false)
	private BigDecimal salario;
	
	public Empleado(Long id, String nif, String nombre, String departamento,
			BigDecimal salario) {
		super();
		this.id = id;
		this.nif = nif;
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}
	
	public Empleado(String nif, String nombre, String departamento,
			BigDecimal salario) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "ID = " + id + ", NIF = " + nif + ", NOMBRE = " + nombre + 
				", DEPARTAMENTO = " + departamento + ", SALARIO = " + salario;
	}
}
