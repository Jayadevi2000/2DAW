package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Linea;
import modelo.Archivo;

/**
 * Servlet implementation class anexaDatos
 */
@WebServlet("/anexaDatos")
public class anexaDatos extends HttpServlet {
	private String origen;
	private String destino;
	private double factor;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		origen = request.getParameter("origen");
		destino = request.getParameter("destino");
		factor = Double.parseDouble(request.getParameter("factor"));
		Linea l = new Linea(origen,destino,factor);
		Archivo a = new Archivo("D:\\Escritorio\\eclipse_workspace\\usoDelGet\\WebContent\\factor.txt");
		a.add(l.generaLinea());
		request.getRequestDispatcher("/muestraResultado.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
