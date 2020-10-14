package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;

/**
 * Servlet implementation class administra
 */
@WebServlet("/administra")
public class administra extends HttpServlet {
	 private static final long serialVersionUID = 1L;
     private String login;
     private String clave;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] dato;
		login=request.getParameter("login").trim();
		clave=request.getParameter("clave").trim();
		if (login.isEmpty() || clave.isEmpty()) {
			request.getRequestDispatcher("/index.jsp").forward(request,response);
		}else {
		Usuario us=new Usuario(login,clave);
		request.setAttribute("atribUsuario", us);
		request.getRequestDispatcher("/entrada.jsp").forward(request,response);
		}
	}

}
