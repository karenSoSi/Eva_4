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

import dao.ProfesionalDao;
import idao.IProfesionalDao;
import model.Profesional;

/**
 * Servlet implementation class AdminProfesional
 */
@WebServlet("/AdminProfesional")
public class AdminProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IProfesionalDao ProfesionalDAO;

	public void init() {
		String jdbcUrl = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
		String jdbcDriver = getServletContext().getInitParameter("jdbcDriver");

		try {
			ProfesionalDAO = new ProfesionalDao(jdbcUrl, jdbcDriver, jdbcUsername, jdbcPassword);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminProfesional() {
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
				mostrarProfesional(request, response);
				break;
			case "mostrarPorRut":
				mostrarPorRut(request, response);
				break;
			case "actualizar":
				actualizar(request, response);
				break;
			case "eliminar":
				eliminar(request, response);
				break;
			case "crear":
				crear(request, response);
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

	private void index(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

	}

	// CREAR Profesional
	private void crear(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

		String rut = request.getParameter("rut");
		String nombre = request.getParameter("nombre");
		String direccion = request.getParameter("direccion");
		String telefono = request.getParameter("telefono");
		String correo = request.getParameter("correo");

		Profesional Profesional = new Profesional(rut, nombre, direccion, telefono, correo);

		boolean crear = ProfesionalDAO.crearProfesional(Profesional);

		String mensaje = "";

		if (crear)
			mensaje = "El Profesional ha sido creado exitosamente";
		else
			mensaje = "Ocurrió un error al crear el Profesional";

		request.setAttribute("alerta", mensaje);
		request.getRequestDispatcher("/view/registrarProfesional.jsp").forward(request, response);
	}

	// LISTAR ProfesionalS
	private void mostrarProfesional(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/listadoProfesionales.jsp");

		List<Profesional> lProfesionales = new ArrayList<Profesional>();

		lProfesionales = ProfesionalDAO.listarProfesionales();

		request.setAttribute("lista_profesional", lProfesionales);

		dispatcher.forward(request, response);

	}

	// MOSTRAR POR RUT
	private void mostrarPorRut(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

		String rut = request.getParameter("id");
		Profesional profesional = ProfesionalDAO.obtenerPorRut(rut);
		request.setAttribute("profesional", profesional);
		request.getRequestDispatcher("/view/mostrarProfesionalPorRut.jsp").forward(request, response);

	}

	// ACTUALIZAR Profesional
	private void actualizar(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

		String rut = request.getParameter("rut");
		String nombre = request.getParameter("nombre");
		String direccion = request.getParameter("direccion");
		String telefono = request.getParameter("fono");
		String correo = request.getParameter("mail");

		Profesional profesional = new Profesional(rut, nombre,  direccion, telefono, correo);

		boolean editar = ProfesionalDAO.actualizarProfesional(profesional);
		
		List<Profesional> listadoNuevo = ProfesionalDAO.listarProfesionales();

		String mensaje = "";

		if (editar)
			mensaje = "El Profesional se ha editado exitosamente";
		else
			mensaje = "Ocurrió un error al editar el Profesional";

		
		request.setAttribute("alerta", mensaje);
		request.setAttribute("lista_profesional", listadoNuevo);
		request.getRequestDispatcher("/view/listadoProfesionales.jsp").forward(request, response);

	}

	private void eliminar(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

		String rut = request.getParameter("id");
		boolean eliminar = ProfesionalDAO.eliminarProfesional(rut);

		List<Profesional> listadoNuevo = ProfesionalDAO.listarProfesionales();
		

		String mensaje = "";

		if (eliminar)
			mensaje = "El Profesional se ha eliminado exitosamente";
		else
			mensaje = "Ocurrió un error al editar el Profesional";

		request.setAttribute("alerta", mensaje);
		request.setAttribute("lista_profesional", listadoNuevo);
		
		request.getRequestDispatcher("/view/listadoProfesionales.jsp").forward(request, response);

	}

}
