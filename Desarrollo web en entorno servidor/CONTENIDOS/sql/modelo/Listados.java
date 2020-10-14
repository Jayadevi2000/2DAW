package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.*;
import com.mysql.jdbc.Statement;
public class Listados {

	
	
	public ArrayList<Estudiante> obtenerEstudiantes() throws SQLException {
		Connection con=null;
		Statement stm= null;
		ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
		String sql = "SELECT * FROM universitario   order by 1 ";
		Estudiante est;
		con=Conexion.conectar();
		int cont=0;
		 System.out.println("conecta");
		 Statement s = (Statement) con.createStatement();
		 ResultSet res = s.executeQuery (sql);
		 
		while (res.next()) {
			System.out.println(cont);
			cont++;
			int id =res.getInt("id");
			String dni =res.getString("dni");
			String nb =res.getString("nombre");
			String ap1 =res.getString("ape1");
			String ap2=res.getString("ape2");
			String carrera =res.getString("carrera");
			int nota =res.getInt("nota");
			est=new Estudiante (id,dni,nb,ap1,ap2,carrera,nota);
			listaEstudiantes.add(est);
		}
		res.close();
		con.close();

		return listaEstudiantes;
	}
	public ArrayList<String> obtenerCarreras() throws SQLException {
		Connection con=null;
		ArrayList<String> listaCarreras = new ArrayList<String>();
		String sql = "SELECT distinct carrera carre FROM universitario order by 1 ";
		String carrera;
		con=Conexion.conectar();
		
		 System.out.println("conecta");
		 Statement s = (Statement) con.createStatement();
		 ResultSet res = s.executeQuery (sql);
		 
		while (res.next()) {
			
			 carrera =res.getString("carre");
			
			
			listaCarreras.add(carrera);
		}
		res.close();
		con.close();

		return listaCarreras;
	}
}
