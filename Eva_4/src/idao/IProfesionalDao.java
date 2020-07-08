package idao;

import java.sql.SQLException;
import java.util.List;

import model.Profesional;

public interface IProfesionalDao {

	boolean crearProfesional(Profesional Profesional) throws SQLException, ClassNotFoundException;

	List<Profesional> listarProfesionales() throws SQLException, ClassNotFoundException;

	boolean actualizarProfesional(Profesional Profesional) throws ClassNotFoundException, SQLException;

	boolean eliminarProfesional(String rut) throws ClassNotFoundException, SQLException;

	Profesional obtenerPorRut(String rut) throws SQLException, ClassNotFoundException;
}
