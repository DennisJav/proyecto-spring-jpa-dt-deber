package ec.edu.modelo;

public class Hospital {
	
	private Integer id;
	private String especialidad;
	private String director;
	private Integer numEmpleados;
	private Integer numPacientes;
	
	//metodos set  y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Integer getNumEmpleados() {
		return numEmpleados;
	}
	public void setNumEmpleados(Integer numEmpleados) {
		this.numEmpleados = numEmpleados;
	}
	public Integer getNumPacientes() {
		return numPacientes;
	}
	public void setNumPacientes(Integer numPacientes) {
		this.numPacientes = numPacientes;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", especialidad=" + especialidad + ", director=" + director + ", numEmpleados="
				+ numEmpleados + ", numPacientes=" + numPacientes + "]";
	}
	
	

}
