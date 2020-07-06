package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Capacitacion {

	private int idCapacitacion;
	private String clienteCapa;
	private String profesionalCapa;
	private LocalDate fechaCapa;
	private LocalTime horaCapa;
	private String cantAsistentes;
	private String tema;
	
	
	public Capacitacion(String clienteCapa, String profesionalCapa, LocalDate fechaCapa,
			LocalTime horaCapa, String cantAsistentes, String temaCapa) {
		super();
		
		this.clienteCapa = clienteCapa;
		this.profesionalCapa = profesionalCapa;
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


	public String getClienteCapa() {
		return clienteCapa;
	}


	public void setClienteCapa(String clienteCapa) {
		this.clienteCapa = clienteCapa;
	}


	public String getProfesionalCapa() {
		return profesionalCapa;
	}


	public void setProfesionalCapa(String profesionalCapa) {
		this.profesionalCapa = profesionalCapa;
	}


	public LocalDate getFechaCapa() {
		return fechaCapa;
	}


	public void setFechaCapa(LocalDate fechaCapa) {
		this.fechaCapa = fechaCapa;
	}


	public LocalTime getHoraCapa() {
		return horaCapa;
	}


	public void setHoraCapa(LocalTime horaCapa) {
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


	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", clienteCapa=" + clienteCapa + ", profesionalCapa="
				+ profesionalCapa + ", fechaCapa=" + fechaCapa + ", horaCapa=" + horaCapa + ", cantAsistentes="
				+ cantAsistentes + ", tema=" + tema + "]";
	}
	
	
	

	


}

	