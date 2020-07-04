package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Accidente
 */
@WebServlet("/Accidente")
public class Accidente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accidente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		String parametro = request.getParameter("parametro");
		System.out.println("Parametros");
		if (parametro !=null) {
			if (parametro.equals("enviar")) {
				//request.getRequestDispatcher("RecibeFormulario.jsp").forward(request, response);
				getServletContext().getRequestDispatcher("/view/exitoFormulario.jsp").forward(request, response);
			} else if (parametro.equals("FormularioAccidente")) {
				getServletContext().getRequestDispatcher("/view/FormularioAccidente.jsp").forward(request, response);
				}
			} else {
				getServletContext().getRequestDispatcher("/view/FormularioAccidente.jsp").forward(request, response);
			}
		}
	}


