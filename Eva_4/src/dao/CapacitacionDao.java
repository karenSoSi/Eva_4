package dao;

import idao.ICapacitacionDao;
import model.Capacitacion;

import java.sql.*;
import java.util.*;


import connection.Conexion;

public class CapacitacionDao implements ICapacitacionDao {

	private Conexion con;
	private Connection connection;

	public CapacitacionDao(String jdbcURL, String jdbcDriver, String jdbcUsername, String jdbcPassword) throws SQLException {
		con = new Conexion(jdbcURL, jdbcDriver, jdbcUsername, jdbcPassword);
	}

	@Override
	public boolean crearCapacitacion(Capacitacion nuevoCapacitacion) throws SQLException, ClassNotFoundException {

		boolean filasInsertadas= false;

		try {
			
			con.conectar();

			connection = con.getJdbcConnection();


			String sqlInsert = "INSERT INTO Capacitacion (fecha_capacitacion=?, hora_capacitacion=?, cant_asistentes=?, tema=?, cliente_rut_cliente=?, profesional_rut_profesional) " + "VALUES ("
					+ "? , ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement statement = connection.prepareStatement(sqlInsert);


			statement.setString(1, nuevoCapacitacion.getFechaCapa());
			statement.setString(2, nuevoCapacitacion.getHoraCapa());
			statement.setString(3, nuevoCapacitacion.getCantAsistentes());
			statement.setString(4, nuevoCapacitacion.getTema());
			statement.setString(5, nuevoCapacitacion.getNombreClienteCapa());
			statement.setString(6, nuevoCapacitacion.getNombreProfesionalCapa());

			filasInsertadas = statement.executeUpdate() > 0;

			con.desconectar();
		}catch (SQLException e) {
			System.out.println("Error: Clase CapacitacionDao, método crearCapacitacion");
			e.printStackTrace();
		}

		
		return filasInsertadas;
	}

	@Override
	public Capacitacion obtenerPorRut(String id) throws SQLException, ClassNotFoundException {
		Capacitacion capacitacion = null;

		String sql = "SELECT * from capaitacion where id_capacitacion=?";

		con.conectar();
		connection = con.getJdbcConnection();

		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setString(1, id);

		ResultSet res = statement.executeQuery();

		if (res.next()) {
			capacitacion = new Capacitacion(res.getString(2), res.getString(3), res.getString(4), res.getString(5),  res.getString(6),  res.getString(7));
		}

		con.desconectar();

		return capacitacion;
	}

	@Override
	public List<Capacitacion> listarCapacitacion() throws SQLException, ClassNotFoundException {

		
		List<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();

		String sql = "SELECT * from capacitacion order by fecha_capacitacion asc ";

		try {

			con.conectar();

			connection = con.getJdbcConnection();

			Statement statement = connection.createStatement();

			ResultSet res = statement.executeQuery(sql);

			while (res.next()) {
				Capacitacion r = new Capacitacion(res.getString(2), res.getString(3), res.getString(4), res.getString(5),  res.getString(6),  res.getString(7));
				listaCapacitacion.add(r);
			}

			con.desconectar();

		} catch (SQLException e) {
			System.out.println("Error: Clase CapacitacionDao, método ListarCapacitacion");
			e.printStackTrace();
		}

		return listaCapacitacion;

	}

	@Override
	public boolean actualizarCapacitacion(Capacitacion nuevoCapacitacion) throws ClassNotFoundException {


		boolean filasInsertadas = false;

		String sql = "UPDATE capacitacion SET fecha_capacitacion=?, hora_capacitacion=?, cant_asistentes=?, tema=?, cliente_rut_cliente=?, profesional_rut_profesional=?";

		try {
			con.conectar();
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(2, nuevoCapacitacion.getFechaCapa());
			statement.setString(3, nuevoCapacitacion.getHoraCapa());
			statement.setString(4, nuevoCapacitacion.getCantAsistentes());
			statement.setString(5, nuevoCapacitacion.getTema());
			statement.setString(6, nuevoCapacitacion.getNombreClienteCapa());
			statement.setString(7, nuevoCapacitacion.getNombreProfesionalCapa());
			
			filasInsertadas = statement.executeUpdate() > 0;

			con.desconectar();
		
		} catch (SQLException e) {
			System.out.println("Error: Clase CapacitacionDao, método actualizarCapacitacion");
			e.printStackTrace();
		}

		
		return filasInsertadas;

	}

	@Override
	public boolean eliminarCapacitacion(Capacitacion capacitacion) {
		
		
		return false;
	}

	@Override
	public Capacitacion obtenerPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
