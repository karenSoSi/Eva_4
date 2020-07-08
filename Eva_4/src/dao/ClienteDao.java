package dao;

import idao.IClienteDao;
import model.Cliente;

import java.sql.*;
import java.util.*;

import connection.Conexion;

public class ClienteDao implements IClienteDao {

	private Conexion con;
	private Connection connection;

	public ClienteDao(String jdbcURL, String jdbcDriver, String jdbcUsername, String jdbcPassword) throws SQLException {
		con = new Conexion(jdbcURL, jdbcDriver, jdbcUsername, jdbcPassword);
	}

	@Override
	public boolean crearCliente(Cliente nuevoCliente) throws SQLException, ClassNotFoundException {

		boolean filasInsertadas = false;
		int estadoCliente = 1;

		try {

			con.conectar();

			connection = con.getJdbcConnection();

			String sqlInsert = "INSERT INTO Cliente (rut_cliente, nombre_cliente, razon_social,"
					+ "giro, direccion_cliente, fono_cliente, mail_cliente, rubro, estado_cliente) " + "VALUES ("
					+ "?, ?, ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement statement = connection.prepareStatement(sqlInsert);

			statement.setString(1, nuevoCliente.getRutCliente());
			statement.setString(2, nuevoCliente.getNombreCliente());
			statement.setString(3, nuevoCliente.getRazonSocial());
			statement.setString(4, nuevoCliente.getGiro());
			statement.setString(5, nuevoCliente.getDirCliente());
			statement.setString(6, nuevoCliente.getFonoCliente());
			statement.setString(7, nuevoCliente.getMailCliente());
			statement.setString(8, nuevoCliente.getRubro());
			statement.setInt(9, estadoCliente);

			filasInsertadas = statement.executeUpdate() > 0;

			// con.desconectar();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, método crearCliente");
			e.printStackTrace();
		}

		return filasInsertadas;
	}

	@Override
	public Cliente obtenerPorRut(String rut) throws SQLException, ClassNotFoundException {
		Cliente cliente = null;

		String sql = "SELECT * from cliente WHERE rut_cliente = ?";

		try {
			con.conectar();
			connection = con.getJdbcConnection();

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, rut);

			ResultSet res = statement.executeQuery();

			if (res.next()) {
				cliente = new Cliente(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
						res.getString(5), res.getString(6), res.getString(7), res.getString(8));
			}

			// con.desconectar();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, obtenerPorRut");
			e.printStackTrace();
		}

		return cliente;

	}

	@Override
	public List<Cliente> listarClientes() throws SQLException, ClassNotFoundException {

		List<Cliente> listaClientes = new ArrayList<Cliente>();

		String sql = "SELECT * from cliente order by nombre_cliente asc ";

		try {

			con.conectar();

			connection = con.getJdbcConnection();

			Statement statement = connection.createStatement();

			ResultSet res = statement.executeQuery(sql);

			while (res.next()) {
				Cliente r = new Cliente(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
						res.getString(5), res.getString(6), res.getString(7), res.getString(8));
				listaClientes.add(r);
			}

			// con.desconectar();

		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, método ListarClientes");
			e.printStackTrace();
		}

		return listaClientes;

	}

	@Override
	public boolean actualizarCliente(Cliente nuevoCliente) throws ClassNotFoundException, SQLException {
	
		System.out.println("inicio metodo actualizar cliente DAO");
		
		boolean filasInsertadas = false;

		String sqlUpdate = "UPDATE cliente SET nombre_cliente=?, razon_social=?, giro=?, direccion_cliente=?, "
				+ "fono_cliente=?, mail_cliente=?, rubro=? WHERE rut_cliente = ?";

		try {
			con.conectar();
			
			connection = con.getJdbcConnection();
			
			System.out.println("conexion a bd ok");

			PreparedStatement updateCliente = connection.prepareStatement(sqlUpdate);

			updateCliente.setString(1, nuevoCliente.getNombreCliente());
			
			System.out.println("nombre: " + nuevoCliente.getNombreCliente());
			updateCliente.setString(2, nuevoCliente.getRazonSocial());
			updateCliente.setString(3, nuevoCliente.getGiro());
			updateCliente.setString(4, nuevoCliente.getDirCliente());
			updateCliente.setString(5, nuevoCliente.getFonoCliente());
			
			System.out.println("fono: " + nuevoCliente.getFonoCliente());
			
			updateCliente.setString(6, nuevoCliente.getMailCliente());
			updateCliente.setString(7, nuevoCliente.getRubro());
			updateCliente.setString(8, nuevoCliente.getRutCliente());
			
			System.out.println("rut: " + nuevoCliente.getRutCliente());
			
			System.out.println(updateCliente.toString());
			
			filasInsertadas = updateCliente.executeUpdate() > 0;
			
			System.out.println("filas insertadas: " + filasInsertadas);

			// con.desconectar();

		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, método actualizarCliente");
			e.printStackTrace();
		}

		return filasInsertadas;

	}

	@Override
	public boolean eliminarCliente(String rut) throws ClassNotFoundException, SQLException {
			
		
		boolean filasInsertadas = false; 
		
		String sqlDelete= "delete from cliente where rut_Cliente=?";
		
		try {
			con.conectar();
			PreparedStatement deleteCliente=connection.prepareStatement(sqlDelete);
			
			deleteCliente.setString(1, rut);
			
			filasInsertadas = deleteCliente.executeUpdate()>0;
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, método eliminarCliente");
			e.printStackTrace();
		}

		return filasInsertadas;
	}
}
