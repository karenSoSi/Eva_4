package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Accidente {

	private int idAccidente;
	private LocalDate fechaAccidente;
	private LocalTime horaAccidente;
	private String tipoAccidente;
	private String descripcion;
	private LocalDate fechaIngreso;
	private LocalTime horaIngreso;
	
	public Accidente( LocalDate fechaAccidente, LocalTime horaAccidente, String tipoAccidente,
			String descripcion, LocalDate fechaIngreso, LocalTime horaIngreso) {
		super();

		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.tipoAccidente = tipoAccidente;
		this.descripcion = descripcion;
		this.fechaIngreso = fechaIngreso;
		this.horaIngreso = horaIngreso;
	}

	public int getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
	}

	public LocalDate getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(LocalDate fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public LocalTime getHoraAccidente() {
		return horaAccidente;
	}

	public void setHoraAccidente(LocalTime horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public String getTipoAccidente() {
		return tipoAccidente;
	}

	public void setTipoAccidente(String tipoAccidente) {
		this.tipoAccidente = tipoAccidente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public LocalTime getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(LocalTime horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	@Override
	public String toString() {
		return "Accidente [idAccidente=" + idAccidente + ", fechaAccidente=" + fechaAccidente + ", horaAccidente="
				+ horaAccidente + ", tipoAccidente=" + tipoAccidente + ", descripcion=" + descripcion
				+ ", fechaIngreso=" + fechaIngreso + ", horaIngreso=" + horaIngreso + "]";
	}
	
	

	
	
}
