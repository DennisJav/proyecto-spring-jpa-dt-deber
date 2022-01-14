package ec.edu.modelo;

public class Vendedor {

	private Integer id;
	private String nombre;
	private String apellido;
	private Integer ventas;
	private Integer numClientes;
	
	//Metodos set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getVentas() {
		return ventas;
	}
	public void setVentas(Integer ventas) {
		this.ventas = ventas;
	}
	public Integer getNumClientes() {
		return numClientes;
	}
	public void setNumClientes(Integer numClientes) {
		this.numClientes = numClientes;
	}
	
	@Override
	public String toString() {
		return "Vendedor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", ventas=" + ventas
				+ ", numClientes=" + numClientes + "]";
	}
	
	
	
}
