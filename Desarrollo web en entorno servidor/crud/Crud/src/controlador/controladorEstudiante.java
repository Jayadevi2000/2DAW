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

import modelo.Abmc;
import modelo.Estudiante;
import modelo.EstudianteInterfaz;

/**
 * Servlet implementation class controladorEstudiante
 */
@WebServlet("/controladorEstudiante")
public class controladorEstudiante extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int action=Integer.parseInt(request.getParameter("action"));
	try {
	switch (action) {
	case 1:
		mostrar(request,response);
		break;
	case 2:
		Estudiante u=new Estudiante();
		u.setDni(request.getParameter("dni"));
		u.setNombre(request.getParameter("nombre"));
		u.setAp1(request.getParameter("ape1"));
		u.setAp2(request.getParameter("ape2"));
		u.setCarrera (request.getParameter("carrera"));
		u.setNota(Integer.parseInt(request.getParameter("nota")));
	    insertar(request,response,u);
	    break;
	case 3:
		String id=request.getParameter("id");
		modificar(request,response,id);
		break;
	case 4://comprobar nombres
		String dnif=request.getParameter("dni");
		String nombref=request.getParameter("nombre");
		String ap1f=request.getParameter("ape1");
		String ap2f=request.getParameter("ape2");
		String carreraf=request.getParameter("carrera");
		int notaf=Integer.parseInt(request.getParameter("nota"));
		int idf=Integer.parseInt(request.getParameter("ident"));
		Estudiante u1=new Estudiante();
		u1.setDni(dnif);
		u1.setNombre(nombref);
		u1.setAp1(ap1f);
		u1.setAp2(ap2f);
		u1.setCarrera (carreraf);
		u1.setNota(notaf);
		u1.setId(idf);
		modificarF(request,response,u1);
		break;
	case 5:
		int idborrar=Integer.parseInt(request.getParameter("id"));
		
		eliminar(request,response,idborrar);
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
	private void mostrar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException,SQLException {
		ArrayList lista=new ArrayList<Estudiante>();
		EstudianteInterfaz e1=new Abmc();
		lista=e1.consultarTodo();
		request.setAttribute("miLista",lista);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/despliegaEstudiantes.jsp");
		dispatcher.forward(request, response);
	}
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
	}
}
