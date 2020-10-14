package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Abmc;
import modelo.Usuario;

/**
 * Servlet implementation class adminUsuarios
 */
@WebServlet("/adminUsuarios")
public class adminUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login=request.getParameter("login").trim();
		String clave=request.getParameter("clave").trim();
		if (login.isEmpty() || clave.isEmpty()) {
			response.sendRedirect("index.jsp");
		}else {
		Abmc op=new Abmc();
		Usuario us=op.usuarioIdentifica(login, clave);
		if (us!=null  ) {
			HttpSession sesion=request.getSession();
			sesion.setAttribute("login", us.getLogin());
			sesion.setAttribute("tipo", us.getTipo());
			response.sendRedirect("despliegaEntrada.jsp");
		}else {
			response.sendRedirect("index.jsp");
		}
		}
	}

}
