package idao;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;

public interface IClienteDao {

	boolean crearCliente(Cliente cliente) throws SQLException, ClassNotFoundException;

	List<Cliente> listarClientes() throws SQLException, ClassNotFoundException;

	boolean actualizarCliente(Cliente cliente) throws ClassNotFoundException, SQLException;

	boolean eliminarCliente(String rut) throws ClassNotFoundException, SQLException;

	Cliente obtenerPorRut(String rut) throws SQLException, ClassNotFoundException;
}
