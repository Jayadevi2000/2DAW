package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Abmc  {
	// primer metodo1
	public Abmc() {
		
	}
	
	public int cuantos() {
		Connection con=null;
		Statement sentencia=null;
		int filas=0;
		
		String sql="select count(*)  from plazas ";
		try {
			con=Conexion.conectar();
			sentencia=con.createStatement();
			ResultSet resultado=sentencia.executeQuery(sql);
			if (resultado.next()) {
				filas=resultado.getInt(1);
				
			}
			resultado.close();
			sentencia.close();
			con.close();
		}catch(SQLException ex) {
			ex.getStackTrace();
		}
		return filas;
	}
	//2 metodo
	public int eliminar(int identificador,String estado) {
		Connection con=null;
	Statement sentencia=null;
	int ok=0;
	if (estado.equals("L")){
	
	String sql="delete from  plazas where id=";
	
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
	}
	return ok;
	};
	//3 metodo ppal
	public Usuario usuarioIdentifica(String login,String clave) {
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
	
	//4 metodo basico
	public ArrayList<Plaza> consultar(){
		ArrayList<Plaza> listaPlazas=new ArrayList<Plaza>();
		Connection con=null;
		Statement sentencia=null;
String sql="select * from plazas  order by 2,3 ";
		
		ResultSet resultado=null;
	try {
		con=Conexion.conectar();
		sentencia=con.createStatement();
		resultado=sentencia.executeQuery(sql);
		while (resultado.next()) {
			Plaza miPlaza=new Plaza();
			miPlaza.setId(resultado.getInt("id"));
			miPlaza.setPlanta(resultado.getInt("planta"));
			miPlaza.setPlaza(resultado.getInt("plaza"));
			miPlaza.setEstado(resultado.getString("estado"));
			miPlaza.setDescripcion(resultado.getString("descripcion"));
			listaPlazas.add(miPlaza);
		}
		resultado.close();
		con.close();
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
		return listaPlazas;
	}
	//5 insertar
	public int insertar(Plaza e) {
		Connection con=null;
	Statement sentencia=null;
	int ok=0;
	String sql="insert into plazas values(NULL,";
	sql+=e.getPlanta()+",";
	sql+=e.getPlaza()+",'L','"+e.getDescripcion()+"')";
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
	};
	//6 cambiar de estado
	public int actualizar(Plaza e) {
		Connection con=null;
	Statement sentencia=null;
	int ok=0;
	String nuevoEstado;
	if (e.getEstado().equals("L")) {
		nuevoEstado="O";
	}else nuevoEstado="L";
	String sql="update  plazas set estado='";
	sql+=nuevoEstado+"' where id="+e.getId()+" ";
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
	};
}
