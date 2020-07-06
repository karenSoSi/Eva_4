package idao;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;

public interface IClienteDao {

	boolean crearCliente(Cliente cliente) throws SQLException;

	List<Cliente> listarClientes() throws SQLException;

	boolean actualizarCliente(Cliente cliente);

	boolean eliminarCliente(Cliente cliente);

	Cliente obtenerPorRut(String rut) throws SQLException;
}