package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.*;

/**
 * Servlet implementation class mostrarTodo
 */
@WebServlet("/mostrarTodo")
public class mostrarTodo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Abmc op=new Abmc();
		ArrayList<Estudiante> mis=op.consultarTodo();
		request.setAttribute("mensaje","lista de todos los estudiantes ");
		request.setAttribute("miLista",mis);
RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaEstudiantes.jsp"
				);
			dispatcher.forward(request, response);
	}

	

}
