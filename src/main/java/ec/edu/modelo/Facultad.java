package ec.edu.modelo;

public class Facultad {

	private Integer id;
	private String carrera;
	private Integer numAlumnos;
	private Integer numProfesores;
	private Integer calificaciones;
	
	//Metodos set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public Integer getNumAlumnos() {
		return numAlumnos;
	}
	public void setNumAlumnos(Integer numAlumnos) {
		this.numAlumnos = numAlumnos;
	}
	public Integer getNumProfesores() {
		return numProfesores;
	}
	public void setNumProfesores(Integer numProfesores) {
		this.numProfesores = numProfesores;
	}
	public Integer getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(Integer calificaciones) {
		this.calificaciones = calificaciones;
	}
	
	@Override
	public String toString() {
		return "Facultad [id=" + id + ", carrera=" + carrera + ", numAlumnos=" + numAlumnos + ", numProfesores="
				+ numProfesores + ", calificaciones=" + calificaciones + "]";
	}
	
	
	
}
