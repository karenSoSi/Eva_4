package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import idao.IClienteDao;
import model.Cliente;

/**
 * Servlet implementation class AdminCliente
 */
@WebServlet("/AdminCliente")
public class AdminCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IClienteDao clienteDAO;

	public void init() {
		String jdbcUrl = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

		try {
			clienteDAO = new ClienteDao(jdbcUrl, jdbcUsername, jdbcPassword);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		
		System.out.println(action);
		try {

			switch (action) {
			case "index":
				index(request, response);
				break;
			case "listar":
				mostrarCliente(request, response);
				break;
			case "mostrarPorRut":
				mostrarPorRut(request, response);
				break;
			case "actualizar":
				break;
			case "eliminar":
				break;
			case "crear":
				break;
			default:
				break;
			}

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

	private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCliente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		
		System.out.println("Inicio metodo Mostrar");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/listadoClientes.jsp");
		
		System.out.println("Dispatcher:" + dispatcher);
		
		List<Cliente> lClientes = new ArrayList<Cliente>();
		
		System.out.println("inicio llamada a ClienteDAO" ); //HASTA ACA LLEGA
				
		lClientes= clienteDAO.listarClientes();
		
		System.out.println("inicio setear atributos" );
		
		request.setAttribute("lista_clientes", lClientes);
		
		System.out.println("lista:" + lClientes ); 
		
		dispatcher.forward(request, response);
	
		
	}

	private void mostrarPorRut(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		String rut = request.getParameter("rut");
		Cliente cliente = clienteDAO.obtenerPorRut(rut);
		request.setAttribute("cliente", cliente);
		request.getRequestDispatcher("/view/mostrarClientePorRut.jsp").forward(request, response);

	}

}
