package dao;

import connection.Conexion;
import idao.IClienteDao;
import model.Cliente;

import java.sql.*;
import java.util.*;

public class ClienteDao implements IClienteDao {

	private Conexion con;
	private Connection connection;

	public ClienteDao(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
	}

	@Override
	public boolean crearCliente(Cliente nuevoCliente) throws SQLException {
		String sql = "INSERT INTO Cliente (region_id, region_name) VALUES (?, ?)";

		con.conectar();

		connection = con.getJdbcConnection();

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, nuevoCliente.getIdCliente());// datos de clase model.Cliente

		boolean filasInsertadas = statement.executeUpdate() > 0;

		con.desconectar();
		return filasInsertadas;
	}

	@Override
	public Cliente obtenerPorID(int id) throws SQLException {
		Cliente cliente = null;

		String sql = "SELECT region_id, region_name FROM Cliente WHERE region_id = ?";
		con.conectar();
		connection = con.getJdbcConnection();

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);

		ResultSet res = statement.executeQuery();

		if (res.next()) {
			cliente = new Cliente(res.getInt("idCliente"), res.getString("rutCliente"));
		}
		res.close();
		con.desconectar();

		return cliente;
	}

	@Override
	public List<Cliente> listarClientes() throws SQLException {
		List<Cliente> listaCliente = new ArrayList<Cliente>();

		String sql = "SELECT region_id, region_name FROM Cliente";

		con.conectar();
		connection = con.getJdbcConnection();
		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery(sql);

		while (rs.next()) {
			Cliente r = new Cliente(rs.getInt("region_id"), rs.getString("region_name"));
			listaCliente.add(r);
		}

		con.desconectar();

		return listaCliente;

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
