package dao;

import idao.IClienteDao;
import model.Cliente;

import java.sql.*;
import java.util.*;

import connection.Conexion;

public class ClienteDao implements IClienteDao {

	private Conexion con;
	private Connection connection;

	public ClienteDao(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
	}

	@Override
	public boolean crearCliente(Cliente nuevoCliente) throws SQLException {

		int nextID = 1;
		int estadoCliente = 1;

		String sqlNextVal = "SELECT MAX(ID_CLIENTE) FROM CLIENTE";

		con.conectar();

		connection = con.getJdbcConnection();

		PreparedStatement statement = connection.prepareStatement(sqlNextVal);

		ResultSet rs = statement.executeQuery(sqlNextVal);

		if (rs.next()) {

			nextID = rs.getInt("id_cliente");

			nextID += 1;

		}

		rs.close();

		String sqlInsert = "INSERT INTO Cliente (id_cliente, rut_cliente, nombre_cliente, razon_social,"
				+ "giro, direccion_cliente, fono_cliente, mail_cliente, rubro, estado_cliente) " + "VALUES ("
				+ "? , ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		statement = connection.prepareStatement(sqlInsert);

		statement.setInt(1, nextID);
		statement.setString(2, nuevoCliente.getRutCliente());
		statement.setString(3, nuevoCliente.getNombreCliente());
		statement.setString(4, nuevoCliente.getRazonSocial());
		statement.setString(5, nuevoCliente.getGiro());
		statement.setString(6, nuevoCliente.getDirCliente());
		statement.setString(7, nuevoCliente.getFonoCliente());
		statement.setString(8, nuevoCliente.getMailCliente());
		statement.setString(9, nuevoCliente.getRubro());
		statement.setInt(10, estadoCliente);

		boolean filasInsertadas = statement.executeUpdate() > 0;

		con.desconectar();
		return filasInsertadas;
	}

	@Override
	public Cliente obtenerPorRut(String rut) throws SQLException {
		Cliente cliente = null;

		String sql = "SELECT rut_cliente, nombre_cliente, razon_social, giro, direccion_cliente, fono_cliente, "
				+ "mail_cliente, rubro from cliente WHERE rut_cliente = ?";
		con.conectar();
		connection = con.getJdbcConnection();

		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setString(2, rut);

		ResultSet res = statement.executeQuery();

		if (res.next()) {
			cliente = new Cliente(res.getString(2), res.getString(3), res.getString(4), res.getString(5),
					res.getString(6), res.getString(7), res.getString(8), res.getString(9));
		}

		con.desconectar();

		return cliente;
	}

	@Override
	public List<Cliente> listarClientes() throws SQLException {

		System.out.println("inicio metodo listarClientes()");

		List<Cliente> listaClientes = new ArrayList<Cliente>();

		System.out.println("Objeto array list creado");

		String sql = "SELECT * from cliente order by nombre_cliente asc ";

		System.out.println(sql); // LLEGA HASTA AQUI

		try {

			con.conectar();

			System.out.println("conexion a BD OK");

			connection = con.getJdbcConnection();

			System.out.println(connection);

			Statement statement = connection.createStatement();

			ResultSet res = statement.executeQuery(sql);

			while (res.next()) {
				Cliente r = new Cliente(res.getString(2), res.getString(3), res.getString(4), res.getString(5),
						res.getString(6), res.getString(7), res.getString(8), res.getString(9));
				listaClientes.add(r);
			}

			con.desconectar();

		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, m�todo ListarClientes");
			e.printStackTrace();
		}

		return listaClientes;

	}

	@Override
	public boolean actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}
}
