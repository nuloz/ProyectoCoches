package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoCoches;
import entidades.Coches;

/**
 * Servlet implementation class Control
 */
@WebServlet("/Control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Control() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacion = request.getParameter("operacion");
		switch (operacion) {
		case "tabla":
		
			DaoCoches daocoches = new DaoCoches();
			List<Coches> coches;
			try {
				coches = daocoches.listadoCoches();
				System.out.println(coches.size() + "TAMAÑO DE COCHES");
				request.setAttribute("listacoche", coches);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		
			request.getRequestDispatcher("Index.jsp").forward(request, response);
			
			break;
		case "modificar":
			String idcoches = request.getParameter("idcoches");
			String precio =  request.getParameter("precio");
			DaoCoches dc = new DaoCoches();
			dc.modificarPrecio(Integer.parseInt(idcoches), Double.parseDouble(precio));
			
			request.getRequestDispatcher("correcto.jsp").forward(request, response);
			break;
		default:
			break;
		}
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
