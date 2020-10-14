package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Piramide;

/**
 * Servlet implementation class trataDatos
 */


@WebServlet("/trataDatos")
public class trataDatos extends HttpServlet {
	private int base;
	private String img;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//invoca a doPost
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		base = Integer.parseInt(request.getParameter("base"));
		img = request.getParameter("imagen");
		
		Piramide p = new Piramide (base,img);
		request.setAttribute("atribPiramide", p);
		request.getRequestDispatcher("/muestraPiramide.jsp").forward(request, response);
		
		
		//crear un objeto ClaseA llamado a
		//guardar objeto con request.setAttribute("atribCClaseA",a);
		//con esta instruccion se hace un reenvio a traves de forward a la vista que los represente
		//request.getRequestDispatcher("/muestraDatos.jsp").forward(request, response);
	}
	

}
