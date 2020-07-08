package model;

public class Cliente {
	
	private String rutCliente;
	private String nombreCliente;
	private String razonSocial;
	private String giro;
	private String dirCliente;
	private String fonoCliente;
	private String mailCliente;
	private String rubro;
	private int estadoCliente;

	public Cliente(String rutCliente, String nombreCliente, String razonSocial, String giro,
			String dirCliente, String fonoCliente, String mailCliente, String rubro) {
		
		super();

		this.rutCliente = rutCliente;
		this.nombreCliente = nombreCliente;
		this.razonSocial = razonSocial;
		this.giro = giro;
		this.dirCliente = dirCliente;
		this.fonoCliente = fonoCliente;
		this.mailCliente = mailCliente;
		this.rubro = rubro;

	}
	
	public String getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getGiro() {
		return giro;
	}
	public void setGiro(String giro) {
		this.giro = giro;
	}
	public String getDirCliente() {
		return dirCliente;
	}
	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}
	public String getFonoCliente() {
		return fonoCliente;
	}
	public void setFonoCliente(String fonoCliente) {
		this.fonoCliente = fonoCliente;
	}
	public String getMailCliente() {
		return mailCliente;
	}
	public void setMailCliente(String mailCliente) {
		this.mailCliente = mailCliente;
	}
	public String getRubro() {
		return rubro;
	}
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	public int getEstadoCliente() {
		return estadoCliente;
	}
	public void setEstadoCliente(int estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	@Override
	public String toString() {
		return "Cliente [rutCliente=" + rutCliente + ", nombreCliente=" + nombreCliente
				+ ", razonSocial=" + razonSocial + ", giro=" + giro + ", dirCliente=" + dirCliente
				+ ", fonoCliente=" + fonoCliente + ", mailCliente=" + mailCliente + ", rubro=" + rubro
				+ ", estadoCliente=" + estadoCliente + "]";
	}
	
	

	
}
