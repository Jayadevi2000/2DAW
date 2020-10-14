package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Abmc  {
	
	public Abmc() {
		
	}
	
	
/*	public Usuario usuarioIdentifica(String login,String clave) {
		Usuario usu=null;
		try {
		Connection con=null;
		con=Conexion.conectar();
String sql="select * from usuarios where login=? and clave=? ";
PreparedStatement sentencia=con.prepareStatement(sql);
sentencia.setString(1,login);
sentencia.setString(2,clave);
ResultSet res=sentencia.executeQuery();
if (res.next()) {
	usu=new Usuario(res.getString("login"),res.getString("clave"));
	usu.setTipo(res.getString("tipo"));
}
sentencia.close();
res.close();
con.close();
		}catch (SQLException ex) {
			System.out.println(" error sql");
		}
		
		return usu;
	}
	
	*/
	public ArrayList<Estudiante> consultarPorValor(int valor){
		//0 sus 1 apr
		ArrayList<Estudiante> listaEst=new ArrayList<Estudiante>();
		Connection con=null;
		Statement sentencia=null;
		String sql="select * from universitario where ";
		
			sql+=" nota>="+valor+"   order by 4  ";
		System.out.println(sql);
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
	public ArrayList<Estudiante> consultarTodo(){
		ArrayList<Estudiante> listaEst=new ArrayList<Estudiante>();
		Connection con=null;
		Statement sentencia=null;
String sql="select * from universitario  order by 4  ";
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
