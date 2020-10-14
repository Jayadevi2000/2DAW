package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class entradaAdmin
 */
@WebServlet("/entradaAdmin")
public class entradaAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession miSesion= request.getSession();
		String lg=(String)request.getAttribute("atribLogin");
		String tipo=(String)request.getAttribute("atribTipo");
		miSesion.setAttribute("loginUs", lg);
		miSesion.setAttribute("atribTipo", tipo);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		try {
			out.println("<!DOCTYPE html><head><title> informacion</title></head>");
			out.println("<body>");
			out.println("<p>bienvenido usuario"+lg +"</p>");
			out.println("<p> usuario de tipo "+tipo +"</p>");
			if (tipo.equals("A")) {
				out.println("administrador");
			}else {
				out.println("usuario normal");
			}
out.println("<p><a href=\"pg.jsp\">navegar</a></p>");
					out.println("</body>");
			out.println("</html>");
		}finally {
			out.close();
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
