package model;

public class Profesional {
	
	private int idProfesional;
	private String rutProfesional;
	private String nombreProfesional;
	private String dirProfesional;
	private String fonoProfesional;
	private String mailProfesional;
	private int estadoProfesional;
	
	
	public Profesional(int idProfesional, String rutProfesional, String nombreProfesional, String dirProfesional,
			String fonoProfesional, String mailProfesional, int estadoProfesional) {
		super();
		this.idProfesional = idProfesional;
		this.rutProfesional = rutProfesional;
		this.nombreProfesional = nombreProfesional;
		this.dirProfesional = dirProfesional;
		this.fonoProfesional = fonoProfesional;
		this.mailProfesional = mailProfesional;
		this.estadoProfesional = estadoProfesional;
	}


	public int getIdProfesional() {
		return idProfesional;
	}


	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}


	public String getRutProfesional() {
		return rutProfesional;
	}


	public void setRutProfesional(String rutProfesional) {
		this.rutProfesional = rutProfesional;
	}


	public String getNombreProfesional() {
		return nombreProfesional;
	}


	public void setNombreProfesional(String nombreProfesional) {
		this.nombreProfesional = nombreProfesional;
	}


	public String getDirProfesional() {
		return dirProfesional;
	}


	public void setDirProfesional(String dirProfesional) {
		this.dirProfesional = dirProfesional;
	}


	public String getFonoProfesional() {
		return fonoProfesional;
	}


	public void setFonoProfesional(String fonoProfesional) {
		this.fonoProfesional = fonoProfesional;
	}


	public String getMailProfesional() {
		return mailProfesional;
	}


	public void setMailProfesional(String mailProfesional) {
		this.mailProfesional = mailProfesional;
	}


	public int getEstadoProfesional() {
		return estadoProfesional;
	}


	public void setEstadoProfesional(int estadoProfesional) {
		this.estadoProfesional = estadoProfesional;
	}


	@Override
	public String toString() {
		return "Profesional [idProfesional=" + idProfesional + ", rutProfesional=" + rutProfesional
				+ ", nombreProfesional=" + nombreProfesional + ", dirProfesional=" + dirProfesional
				+ ", fonoProfesional=" + fonoProfesional + ", mailProfesional=" + mailProfesional
				+ ", estadoProfesional=" + estadoProfesional + "]";
	}
	
	
	

}
