package model;


public class Capacitacion {

	private int idCapacitacion;
	private String fechaCapa;
	private String horaCapa;
	private String cantAsistentes;
	private String tema;
	private String nombreClienteCapa;
	private String nombreProfesionalCapa;
	
	
	public Capacitacion(String fechaCapa, String horaCapa, String cantAsistentes, String temaCapa, String nombreClienteCapa, 
			String nombreProfesionalCapa)
	{
		super();
		
		
		this.fechaCapa = fechaCapa;
		this.horaCapa = horaCapa;
		this.cantAsistentes = cantAsistentes;
		this.tema = temaCapa;
	}


	public int getIdCapacitacion() {
		return idCapacitacion;
	}


	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	
	public String getFechaCapa() {
		return fechaCapa;
	}


	public void setFechaCapa(String fechaCapa) {
		this.fechaCapa = fechaCapa;
	}


	public String getHoraCapa() {
		return horaCapa;
	}


	public void setHoraCapa(String horaCapa) {
		this.horaCapa = horaCapa;
	}


	public String getCantAsistentes() {
		return cantAsistentes;
	}


	public void setCantAsistentes(String cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
	}


	public String getNombreProfesionalCapa() {
		return nombreProfesionalCapa;
	}


	public void setNombreProfesionalCapa(String nombreProfesionalCapa) {
		this.nombreProfesionalCapa = nombreProfesionalCapa;
	}


	public String getNombreClienteCapa() {
		return nombreClienteCapa;
	}


	public void setNombreClienteCapa(String nombreClienteCapa) {
		this.nombreClienteCapa = nombreClienteCapa;
	}


	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", fechaCapa=" + fechaCapa + ", horaCapa=" + horaCapa
				+ ", cantAsistentes=" + cantAsistentes + ", tema=" + tema + ", nombreClienteCapa=" + nombreClienteCapa
				+ ", nombreProfesionalCapa=" + nombreProfesionalCapa + "]";
	}
	
	


}

	