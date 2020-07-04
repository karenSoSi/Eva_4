package idao;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;

public interface IClienteDao {

	public boolean crearCliente(Cliente cliente) throws SQLException;
	public List<Cliente> listarClientes() throws SQLException;
	public boolean actualizarCliente(Cliente cliente);
	public boolean eliminarCliente(Cliente cliente);
	public Cliente obtenerPorID(int idCliente) throws SQLException;
}