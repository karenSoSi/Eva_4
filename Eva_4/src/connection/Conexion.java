package connection;

import java.sql.*;

public class Conexion {

	private Connection jdbcConnection;
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	
	public Conexion(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		super();
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
		
	}
	
	public void conectar() throws SQLException {
		
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}

	}
	
	public void desconectar() throws SQLException {
		
		if (jdbcConnection != null && !jdbcConnection.isClosed()){
			jdbcConnection.close();
		}
	}
	
	public Connection getJdbcConnection() {
		return jdbcConnection;
	}
}
