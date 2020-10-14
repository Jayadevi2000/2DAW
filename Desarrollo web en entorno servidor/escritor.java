package controlador;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Archivo;

/**
 * Servlet implementation class escritor
 */
@WebServlet("/escritor")
public class escritor extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext contexto=request.getServletContext();
		String path=contexto.getRealPath("ideas.txt");
		Archivo a=new Archivo(path);
		String linea=request.getParameter("linea");
		if (linea.trim()!="") {
			a.add(linea);
		}
		response.sendRedirect("lector");
	}

}
