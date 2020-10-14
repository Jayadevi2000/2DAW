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
 * Servlet implementation class crearSesion
 */
@WebServlet("/crearSesion")
public class crearSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession= request.getSession(true);
		producto miproducto= new producto(1,"tf nuevo", "electronica", 234.8, 1);
		misession.setAttribute("producto",miproducto);
		PrintWriter pw= response.getWriter();
		pw.println("<html><body><p>Producto en session</p>");
		pw.println("<p><a href=\"verSesion\">ver lo que hay en sesion</a></p>");
		pw.println("</body></html>");
		pw.close();
	}

	

}
