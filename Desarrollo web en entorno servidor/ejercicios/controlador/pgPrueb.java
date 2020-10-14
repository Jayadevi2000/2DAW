package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class pgPrueb
 */
@WebServlet("/pgPrueb")
public class pgPrueb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		try{
			out.println("<html>");
			out.println("<head>");
			out.println("<title> info</title>");
			out.println("</head>");
			out.println("<body>");
			HttpSession sesion=request.getSession(); 
			out.println("<p> IdSesion: "+sesion.getId());
			out.println(" Creación: "+sesion.getCreationTime()+"</p>");
			Date momento=new Date(sesion.getCreationTime());
			out.println("<p>Creación: "+momento+"</p>");
			out.println("<p><a href=\"index.html\">volver</a></p>");
			out.println("</body>");
			out.println("</html>");
			
		}
	finally {
		out.close();
	}
	}

	

}
