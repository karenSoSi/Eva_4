package controller;


public class ValidarUsuario{
	
	private String usuario;
	private String clave;
	

	
	public void setUsuario(String u1) { this.usuario = u1; } 
    public void setClave(String p1) { this.clave = p1; }
    
    public String getUsuario() { return usuario; } 
    public String getClave() { return clave; }
	
	public boolean validar(String u1, String p1) {
		if (u1.equals(usuario) && p1.equals(clave)) 
            return true; 
        else
            return false; 
	}

}
