package controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;


/**
 * Servlet implementation class controladorEstudiante
 */
@WebServlet("/controladorViajes")
public class controladorViajes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int action=Integer.parseInt(request.getParameter("action"));
	try {
	switch (action) {
	case 0:
		LocalDate sn=null;
		LocalDate ln=null;
		String f1n=request.getParameter("f1");
		String f2n=request.getParameter("f2");
		int precion=Integer.parseInt(request.getParameter("precio"));
		if (!f1n.isEmpty() && !f2n.isEmpty()) {
		 sn=LocalDate.parse(f1n);
		 ln=LocalDate.parse(f2n);
		}
		mostrarn(request,response,sn,ln,precion);	
		break;
	case 1:
		String f1=request.getParameter("f1");
		String f2=request.getParameter("f2");
		int precio=Integer.parseInt(request.getParameter("precio"));
		if (f1.isEmpty() || f2.isEmpty()) {
			mostrar(request,response,null,null,precio);	
		}else {
			LocalDate s=LocalDate.parse(f1);
			LocalDate l=LocalDate.parse(f2);
			mostrar(request,response,s,l,precio);	
		}
		
		break;
	
	}
	}catch(SQLException ex) {
	System.out.println("fallo en la sql");
		ex.getStackTrace();
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	private void mostrarn(HttpServletRequest request, HttpServletResponse response,LocalDate sn,LocalDate ln,int precion)throws ServletException, IOException,SQLException {
		ArrayList lista=new ArrayList<Catalogo>();
		OperacionesI e1=new Abmc();
		lista=e1.consultar(sn, ln, precion);
		request.setAttribute("miLista",lista);
	RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaViajes.jsp");
		dispatcher.forward(request, response);
	}
	private void mostrar(HttpServletRequest request, HttpServletResponse response,LocalDate s,LocalDate l,int precio)throws ServletException, IOException,SQLException {
		ArrayList lista=new ArrayList<Catalogo>();
		OperacionesI e1=new Abmc();
		if (precio==0)
		lista=e1.consultarTodo(s,l);
		else if (s==null || l==null) {
			lista=e1.consultarTodo(precio);
		}else {
			lista=e1.consultarTodo(s,l,precio);
		}
		request.setAttribute("miLista",lista);
	RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaViajes.jsp");
		dispatcher.forward(request, response);
	}
	/*
	private void insertar(HttpServletRequest request, HttpServletResponse response,Estudiante u)throws ServletException, IOException,SQLException {
		int ok;
		
		EstudianteInterfaz e1=new Abmc();
		ok=e1.insertar(u);
		request.setAttribute("ok",String.valueOf(ok));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaOk.jsp");
		dispatcher.forward(request, response);
	}
	private void modificar(HttpServletRequest request, HttpServletResponse response,String id)throws ServletException, IOException,SQLException {
		int ident=Integer.parseInt(id);
		EstudianteInterfaz e1=new Abmc();
		Estudiante estu=e1.buscarPorId(ident);
		request.setAttribute("miEstudiante",estu);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formDeMod.jsp");
		dispatcher.forward(request, response);
	}
	private void modificarF(HttpServletRequest request, HttpServletResponse response,Estudiante u1)throws ServletException, IOException,SQLException {
		
		EstudianteInterfaz e1=new Abmc();
		int ok=e1.actualizar(u1);
		request.setAttribute("ok",String.valueOf(ok));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaOk.jsp");
		dispatcher.forward(request, response);
	}
private void eliminar(HttpServletRequest request, HttpServletResponse response,int idborrar)throws ServletException, IOException,SQLException {
		
		EstudianteInterfaz e1=new Abmc();
		int ok=e1.eliminar(idborrar);
		request.setAttribute("ok",String.valueOf(ok));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaOk.jsp");
		dispatcher.forward(request, response);
	}*/
}
