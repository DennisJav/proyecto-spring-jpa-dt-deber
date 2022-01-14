package ec.edu.modelo;

public class Computador {

	private String serie;
	private String modelo;
	private Integer existencias;
	private String detalle;
	private String servicio;
	
	
	//Metodos set y get
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getExistencias() {
		return existencias;
	}
	public void setExistencias(Integer existencias) {
		this.existencias = existencias;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	
	@Override
	public String toString() {
		return "Computador [serie=" + serie + ", modelo=" + modelo + ", existencias=" + existencias + ", detalle="
				+ detalle + ", servicio=" + servicio + "]";
	}
	
	
}
