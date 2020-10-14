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

import modelo.*;

/**
 * Servlet implementation class adminOpcion
 */
@WebServlet("/adminOpcion")
public class adminOpcion extends HttpServlet {
	private static final long serialVersionUID = 1L;
     Listados lista=new Listados();
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		System.out.println(action);
		try {
		switch (action) {
		case "s1" :
			mostrar1(request, response);
			break;
		case "s2":
			mostrar2(request, response);
			break;
		}
	} catch (SQLException e) {
		e.getStackTrace();
	}

	

}
	private void mostrar1(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
		System.out.println("entra en mostar estudiantes");
		ArrayList<Estudiante> listaEst= lista.obtenerEstudiantes();
		System.out.println(listaEst.size());
		request.setAttribute("misEstudiantes", listaEst);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaListaEstudiantes.jsp");
		dispatcher.forward(request, response);
	}	
	private void mostrar2(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
		System.out.println("entra en mostar carreras");
		ArrayList<String> listaCarr= lista.obtenerCarreras();
		request.setAttribute("misCarreras", listaCarr);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaListaCarreras.jsp");
		dispatcher.forward(request, response);
	}	
}