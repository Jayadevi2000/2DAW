package controlador;

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
import javax.servlet.http.HttpSession;

import modelo.Alumno;
import modelo.producto;

/**
 * Servlet implementation class meterSesion
 */
@WebServlet("/meterSesion")
public class meterSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int nota;
	String dni;
	String nombre;
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		nota=Integer.parseInt(request.getParameter("nota"));
		dni=request.getParameter("dni");
		nombre=request.getParameter("nombre");
		Alumno a=new Alumno(dni,nombre,nota);
		ArrayList<Alumno> als;
		HttpSession sesion= (HttpSession) request.getSession(true);
		als = (ArrayList<Alumno>) sesion.getAttribute("listaAlumnos");
		if ((als == null)) {
			als=new ArrayList<Alumno>();
			als.add(a);
			
		} else {	
			als.add(a);
		//	sesion.removeAttribute("listaAlumnos");
		
		}
		sesion.setAttribute("listaAlumnos", als);
	    response.sendRedirect("index.html");
		 
	}

}
