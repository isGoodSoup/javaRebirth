package es.cursojava.oo.hibernate.empresa.entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_EMPRESA")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	@Column(length = 30)
	private String nombre;
	@Column(name = "SOCIEDAD")
	private String sociedad;
	@Column(name = "CIF")
	private String cif;
	@Column(name = "ACTIVIDAD")
	private String actividad;
	@Column(name = "FECHA")
	private Date fecha;
	
	public Empresa() {
		super();
	}

	public Empresa(long id, String nombre, String sociedad, String cif,
			String actividad, Date fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sociedad = sociedad;
		this.cif = cif;
		this.actividad = actividad;
		this.fecha = fecha;
	}
	
	public Empresa(String nombre, String sociedad, String cif, String actividad,
			Date fecha) {
		super();
		this.nombre = nombre;
		this.sociedad = sociedad;
		this.cif = cif;
		this.actividad = actividad;
		this.fecha = fecha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSociedad() {
		return sociedad;
	}

	public void setSociedad(String sociedad) {
		this.sociedad = sociedad;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", sociedad="
				+ sociedad + ", cif=" + cif + ", actividad=" + actividad
				+ ", fecha=" + fecha + "]";
	}
}
