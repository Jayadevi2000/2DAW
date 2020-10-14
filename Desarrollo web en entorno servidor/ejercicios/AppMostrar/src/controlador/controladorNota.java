package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Abmc;
import modelo.Estudiante;

/**
 * Servlet implementation class controladorNota
 */
@WebServlet("/controladorNota")
public class controladorNota extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int situacion=Integer.parseInt(request.getParameter("nota"));
		Abmc op=new Abmc();
		
		ArrayList<Estudiante> mis=op.consultarPorValor(situacion);
		request.setAttribute("miLista",mis);
		request.setAttribute("mensaje","lista de estudiantes por nota");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaEstudiantes.jsp");
					dispatcher.forward(request, response);
		
	}

	

}
