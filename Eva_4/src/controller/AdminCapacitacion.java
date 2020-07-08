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

import dao.CapacitacionDao;
import dao.ClienteDao;
import idao.ICapacitacionDao;
import idao.IClienteDao;
import model.Capacitacion;
import model.Cliente;

/**
 * Servlet implementation class AdminCapacitacion
 */
@WebServlet("/AdminCapacitacion")
public class AdminCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ICapacitacionDao capacitacionDAO;

	public void init() {
		String jdbcUrl = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
		String jdbcDriver = getServletContext().getInitParameter("jdbcDriver");

		try {
			capacitacionDAO = new CapacitacionDao(jdbcUrl, jdbcDriver, jdbcUsername, jdbcPassword);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminCapacitacion() {
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
				mostrarCapacitacion(request, response);
				break;
			case "mostrarPorFecha":
				mostrarPorId(request, response);
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

	private void mostrarCapacitacion(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/listadoCapacitacion.jsp");

		List<Capacitacion> lCapacitacion = new ArrayList<Capacitacion>();

		lCapacitacion = capacitacionDAO.listarCapacitacion();

		request.setAttribute("lista_capacitacion", lCapacitacion);

		dispatcher.forward(request, response);

	}

	private void mostrarPorId(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

		int id = Integer.parseInt(request.getParameter("id_capa"));
		Capacitacion capacitacion = capacitacionDAO.obtenerPorId(id);
		request.setAttribute("capacitacion", capacitacion);
		request.getRequestDispatcher("/view/mostrarCapacitacionPorFecha.jsp").forward(request, response);

	}

}
