package connection;

import java.sql.*;

/**rodrigo pavez
 *
 */
public class Conexion {

	private static Connection jdbcConnection;
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private String jdbcDriver;

	public Conexion(String jdbcURL, String jdbcDriver, String jdbcUsername, String jdbcPassword) {
		super();
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
		this.jdbcDriver = jdbcDriver;

	}

	public void conectar() throws SQLException, ClassNotFoundException {

		Class.forName(jdbcDriver);
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
		
			jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}

	}

	public void desconectar() throws SQLException {

		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}

	public Connection getJdbcConnection() {
		return jdbcConnection;
	}

}
