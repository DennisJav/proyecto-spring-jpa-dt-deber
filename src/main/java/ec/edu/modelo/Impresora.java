package ec.edu.modelo;

public class Impresora {
	private String serie;
	private String modelo;
	private String danio;
	private String servicio;
	private Integer monto;
	
	//metodos set y get
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
	public String getDanio() {
		return danio;
	}
	public void setDanio(String danio) {
		this.danio = danio;
	}
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public Integer getMonto() {
		return monto;
	}
	public void setMonto(Integer monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "Impresora [serie=" + serie + ", modelo=" + modelo + ", danio=" + danio + ", servicio=" + servicio
				+ ", monto=" + monto + "]";
	}
	
	
}
