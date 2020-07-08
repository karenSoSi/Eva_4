package dao;

import idao.IProfesionalDao;
import model.Profesional;

import java.sql.*;
import java.util.*;

import connection.Conexion;

public class ProfesionalDao implements IProfesionalDao {

	private Conexion con;
	private Connection connection;

	public ProfesionalDao(String jdbcURL, String jdbcDriver, String jdbcUsername, String jdbcPassword)
			throws SQLException {
		con = new Conexion(jdbcURL, jdbcDriver, jdbcUsername, jdbcPassword);
	}

	@Override
	public boolean crearProfesional(Profesional nuevoProfesional) throws SQLException, ClassNotFoundException {

		boolean filasInsertadas = false;
		int estadoProfesional = 1;

		try {

			con.conectar();

			connection = con.getJdbcConnection();

			String sqlInsert = "INSERT INTO Profesional (rut_profesional, nombre_profesional, direccion_profesional, fono_profesional, mail_profesional, estado_profesional) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";

			PreparedStatement statement = connection.prepareStatement(sqlInsert);

			statement.setString(1, nuevoProfesional.getRutProfesional());
			statement.setString(2, nuevoProfesional.getNombreProfesional());
			statement.setString(3, nuevoProfesional.getDirProfesional());
			statement.setString(4, nuevoProfesional.getFonoProfesional());
			statement.setString(5, nuevoProfesional.getMailProfesional());
			statement.setInt(6, estadoProfesional);

			filasInsertadas = statement.executeUpdate() > 0;

			// con.desconectar();
		} catch (SQLException e) {
			System.out.println("Error: Clase Profesional Dao, método crear Profesional");
			e.printStackTrace();
		}

		return filasInsertadas;
	}

	@Override
	public Profesional obtenerPorRut(String rut) throws SQLException, ClassNotFoundException {
		Profesional Profesional = null;

		String sql = "SELECT * from Profesional WHERE rut_profesional = ?";

		try {
			con.conectar();
			connection = con.getJdbcConnection();

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, rut);

			ResultSet res = statement.executeQuery();

			if (res.next()) {
				Profesional = new Profesional(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
						res.getString(5));

			}

			// con.desconectar();
		} catch (SQLException e) {
			System.out.println("Error: Clase Profesional Dao, obtenerPorRut");
			e.printStackTrace();
		}

		return Profesional;

	}
	
	@Override
	public List<Profesional> listarProfesionales() throws SQLException, ClassNotFoundException {

		List<Profesional> listaProfesionales = new ArrayList<Profesional>();

		String sql = "SELECT * from Profesional order by nombre_profesional asc ";

		try {

			con.conectar();

			connection = con.getJdbcConnection();

			Statement statement = connection.createStatement();

			ResultSet res = statement.executeQuery(sql);

			while (res.next()) {
				Profesional r = new Profesional(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
						res.getString(5));
				listaProfesionales.add(r);
			}

			// con.desconectar();

		} catch (SQLException e) {
			System.out.println("Error: Clase ProfesionalDao, método ListarProfesionals");
			e.printStackTrace();
		}

		return listaProfesionales;

	}

	@Override
	public boolean actualizarProfesional(Profesional nuevoProfesional) throws ClassNotFoundException, SQLException {

		System.out.println("inicio metodo actualizar Profesional DAO");

		boolean filasInsertadas = false;

		String sqlUpdate = "UPDATE Profesional SET nombre_profesional=?, direccion_profesional=?, "
				+ "fono_profesional=?, mail_profesional=? WHERE rut_profesional = ?";

		try {
			con.conectar();

			connection = con.getJdbcConnection();

			PreparedStatement updateProfesional = connection.prepareStatement(sqlUpdate);

			updateProfesional.setString(1, nuevoProfesional.getNombreProfesional());

			updateProfesional.setString(2, nuevoProfesional.getDirProfesional());
			updateProfesional.setString(3, nuevoProfesional.getFonoProfesional());

			updateProfesional.setString(4, nuevoProfesional.getMailProfesional());

			updateProfesional.setString(5, nuevoProfesional.getRutProfesional());

			filasInsertadas = updateProfesional.executeUpdate() > 0;

			// con.desconectar();

		} catch (SQLException e) {
			System.out.println("Error: Clase ProfesionalDao, método actualizarProfesional");
			e.printStackTrace();
		}

		return filasInsertadas;

	}

	@Override
	public boolean eliminarProfesional(String rut) throws ClassNotFoundException, SQLException {

		boolean filasInsertadas = false;

		String sqlDelete = "delete from Profesional where rut_profesional=?";

		try {
			con.conectar();
			PreparedStatement deleteProfesional = connection.prepareStatement(sqlDelete);

			deleteProfesional.setString(1, rut);

			filasInsertadas = deleteProfesional.executeUpdate() > 0;

		} catch (SQLException e) {
			System.out.println("Error: Clase ProfesionalDao, método eliminar Profesional");
			e.printStackTrace();
		}

		return filasInsertadas;
	}
}
