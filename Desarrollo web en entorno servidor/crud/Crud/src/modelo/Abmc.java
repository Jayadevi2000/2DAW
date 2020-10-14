package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Abmc implements EstudianteInterfaz {
	public Estudiante buscarPorId(int id) {
		Connection con=null;
	Statement sentencia=null;
	int ok=0;
	Estudiante e=new Estudiante();
	String sql="select * from universitario where id="+id+" ";
	try {
		con=Conexion.conectar();
		sentencia=con.createStatement();
		ResultSet resultado=sentencia.executeQuery(sql);
		while (resultado.next()) {
			e.setId(resultado.getInt("id"));
			e.setDni(resultado.getString("dni"));
			e.setNombre(resultado.getString("nombre"));
			e.setAp1(resultado.getString("ape1"));
			e.setAp2(resultado.getString("ape2"));
			e.setCarrera (resultado.getString("carrera"));
			e.setNota(resultado.getInt("nota"));
		}
		resultado.close();
		sentencia.close();
		con.close();
	}catch(SQLException ex) {
		ex.getStackTrace();
	}
	return e;
	};
	public int eliminar(int identificador) {
		Connection con=null;
	Statement sentencia=null;
	int ok=0;
	String sql="delete from  universitario where id=";
	
	sql+=identificador+" ";
	System.out.println(sql);
	try {
		con=Conexion.conectar();
		sentencia=con.createStatement();
		ok=sentencia.executeUpdate(sql);
		sentencia.close();
		con.close();
	}catch(SQLException ex) {
		ex.getStackTrace();
	}
	return ok;
	}
	public int actualizar(Estudiante e) {
		Connection con=null;
	Statement sentencia=null;
	int ok=0;
	String sql="update  universitario set dni='";
	sql+=e.getDni()+"',nombre='";
	sql+=e.getNombre()+"',ape1='";
	sql+=e.getAp1()+"',ape2='";
	sql+=e.getAp2()+"',carrera='";
	sql+=e.getCarrera()+"',nota=";
	sql+=e.getNota()+" where id="+e.getId()+" ";
	System.out.println(sql);
	try {
		con=Conexion.conectar();
		sentencia=con.createStatement();
		ok=sentencia.executeUpdate(sql);
		sentencia.close();
		con.close();
	}catch(SQLException ex) {
		ex.getStackTrace();
	}
	return ok;
	}
	public int insertar(Estudiante e) {
		Connection con=null;
	Statement sentencia=null;
	int ok=0;
	String sql="insert into universitario values(NULL,'";
	sql+=e.getDni()+"','";
	sql+=e.getNombre()+"','";
	sql+=e.getAp1()+"','";
	sql+=e.getAp2()+"','";
	sql+=e.getCarrera()+"',";
	sql+=e.getNota()+")";
	try {
		con=Conexion.conectar();
		sentencia=con.createStatement();
		ok=sentencia.executeUpdate(sql);
		sentencia.close();
		con.close();
	}catch(SQLException ex) {
		ex.getStackTrace();
	}
	return ok;
	}
	
	public ArrayList<Estudiante> consultarTodo(){
		ArrayList<Estudiante> listaEst=new ArrayList<Estudiante>();
		Connection con=null;
		Statement sentencia=null;
		String sql="select * from universitario  order by 4";
		ResultSet resultado=null;
	try {
		con=Conexion.conectar();
		sentencia=con.createStatement();
		resultado=sentencia.executeQuery(sql);
		while (resultado.next()) {
			Estudiante miEstu=new Estudiante();
			miEstu.setId(resultado.getInt("id"));
			miEstu.setDni(resultado.getString("dni"));
			miEstu.setNombre(resultado.getString("nombre"));
			miEstu.setAp1(resultado.getString("ape1"));
			miEstu.setAp2(resultado.getString("ape2"));
			miEstu.setCarrera (resultado.getString("carrera"));
			miEstu.setNota(resultado.getInt("nota"));
			listaEst.add(miEstu);
		}
		resultado.close();
		con.close();
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
		return listaEst;
	}
}
