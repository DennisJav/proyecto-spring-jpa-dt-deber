package ec.edu.modelo;

public class Tecnico {

	private Integer id;
	private String nombre;
	private String apellido;
	private String area;
	private String cargo;
	
	//metodos set y get
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return "Tecnico [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", area=" + area + ", cargo="
				+ cargo + "]";
	}
	
	
}
