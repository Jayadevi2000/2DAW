package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Alumno;

/**
 * Servlet implementation class verAlumnosCalificados
 */
@WebServlet("/verAlumnosCalificados")
public class verAlumnosCalificados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion= (HttpSession) request.getSession();
		ArrayList<Alumno> als= (ArrayList<Alumno>) sesion.getAttribute("listaAlumnos");
		//producto miproducto= (producto) misession.getAttribute("producto");
		request.setAttribute("atribListaAlumnos", als);
		 request.getRequestDispatcher("/muestraLista.jsp").forward(request, response);
	}

	

}
