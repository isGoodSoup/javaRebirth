package es.cursojava.sql.practica;

import java.util.Date;

public class Producto {
	private int id;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	private Date fecha_alta;
	private String estado;
	private String sku;
	private String creado_por;
	private double iva;
	
	public Producto(int id, String nombre, String categoria,
			double precio, int stock, Date fecha_alta, String estado,
			String sku, String creado_por, double iva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.fecha_alta = fecha_alta;
		this.estado = estado;
		this.sku = sku;
		this.creado_por = creado_por;
		this.iva = iva;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public Date getFecha_alta() {
		return fecha_alta;
	}
	
	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public String getCreado_por() {
		return creado_por;
	}
	
	public void setCreado_por(String creado_por) {
		this.creado_por = creado_por;
	}
	
	public double getIva() {
		return iva;
	}
	
	public void setIva(double iva) {
		this.iva = iva;
	}
}
