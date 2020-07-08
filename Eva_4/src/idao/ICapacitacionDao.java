package idao;

import java.sql.SQLException;
import java.util.List;

import model.Capacitacion;

public interface ICapacitacionDao {

	boolean crearCapacitacion(Capacitacion capacitacion) throws SQLException, ClassNotFoundException;

	List<Capacitacion> listarCapacitacion() throws SQLException, ClassNotFoundException;

	boolean actualizarCapacitacion(Capacitacion capacitacion) throws ClassNotFoundException;

	boolean eliminarCapacitacion(Capacitacion capacitacion) throws ClassNotFoundException;

	Capacitacion obtenerPorRut(String rut) throws SQLException, ClassNotFoundException;

	Capacitacion obtenerPorId(int id);
}