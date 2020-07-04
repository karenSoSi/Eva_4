package model;

public class Cliente {
	
	private int idCliente;
	private String rutCliente;
	
	
	
	public Cliente(int idCliente, String rutCliente) {
		super();
		this.idCliente = idCliente;
		this.rutCliente = rutCliente;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	//falta agregar el resto

}
