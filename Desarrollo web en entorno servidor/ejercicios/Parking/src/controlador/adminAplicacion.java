package controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.*;


/**
 * Servlet implementation class adminAplicacion
 */
@WebServlet("/adminAplicacion")
public class adminAplicacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int action=Integer.parseInt(request.getParameter("action"));
		try {
		switch (action) {
		case 1:
			
			mostrar(request,response);
			break;
		case 2:
			int id=Integer.parseInt(request.getParameter("id"));
			String  estado=request.getParameter("estado");
			eliminar(request,response,id,estado);
			break;
		case 3:
			String plaza=request.getParameter("plaza");
			String planta=request.getParameter("planta");
			String descripcion=request.getParameter("descripcion");
			
			Plaza e=new Plaza();
			
			e.setPlanta(Integer.parseInt(planta));
			e.setPlaza(Integer.parseInt(plaza));
			e.setDescripcion(descripcion);
			
			insertar(request, response,e);
			break;
		case 4:
			int idm=Integer.parseInt(request.getParameter("id"));
			String  estadom=request.getParameter("estado");
			Plaza  emodi=new Plaza();
			emodi.setId(idm);
			emodi.setEstado(estadom);
			modificar(request, response,emodi);
		}
		}catch(SQLException ex) {
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void mostrar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException,SQLException {
		ArrayList<Plaza> lista=new ArrayList<Plaza>();
		Abmc e1=new Abmc();
		lista=e1.consultar();
		request.setAttribute("miLista",lista);
	RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaPlazas.jsp");
		dispatcher.forward(request, response);
	}
	private void eliminar(HttpServletRequest request, HttpServletResponse response,int id,String estado)throws ServletException, IOException,SQLException {
		
		Abmc e1=new Abmc();
		int ok=e1.eliminar(id,estado);
		request.setAttribute("ok",String.valueOf(ok));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaOk.jsp");
		dispatcher.forward(request, response);
}
private void insertar(HttpServletRequest request, HttpServletResponse response,Plaza e)throws ServletException, IOException,SQLException {
		
		Abmc e1=new Abmc();
		int ok=e1.insertar(e);
		request.setAttribute("ok",String.valueOf(ok));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaOk.jsp");
		dispatcher.forward(request, response);
}
private void modificar(HttpServletRequest request, HttpServletResponse response,Plaza emodi)throws ServletException, IOException,SQLException {
	
	Abmc e1=new Abmc();
	int ok=e1.actualizar(emodi);
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("/adminAplicacion?action=1");
	dispatcher.forward(request, response);
}
}