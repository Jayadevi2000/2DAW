package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Archivo;

/**
 * Servlet implementation class lector
 */
@WebServlet("/lector")
public class lector extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext contexto=request.getServletContext();
		String path=contexto.getRealPath("ideas.txt");
		Archivo a=new Archivo(path);
		ArrayList<String> datos=a.leerArchivo();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		try {
			out.println("<!DOCTYPE html>");
			out.println("<head>");
			out.println("<title> lectorEscritor</title>");
			out.println("</head>");
			out.println("<body>");
			for (int i=0;i<datos.size();i++) {
				out.println(datos.get(i)+"<br/>");
			}
			out.println("<p><a href=\"index.jsp\">añadir</a></p>");
			
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
