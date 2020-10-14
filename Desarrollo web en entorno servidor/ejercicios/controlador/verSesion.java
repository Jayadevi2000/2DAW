package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.producto;
/**
 * Servlet implementation class verSesion
 */
@WebServlet("/verSesion")
public class verSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession= (HttpSession) request.getSession();
		producto miproducto= (producto) misession.getAttribute("producto");
		PrintWriter pw= response.getWriter();
		pw.println("<html><body> id :"+ miproducto.getId()+ " descripcion: " +miproducto.getDescripcion()+" precio: "+ miproducto.getPrecio());
		pw.close();
	}

	
	
}
