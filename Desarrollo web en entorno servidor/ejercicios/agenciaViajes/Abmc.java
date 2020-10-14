package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import modelo.*;
public class Abmc implements OperacionesI {
	
	public ArrayList<Usuarios> identificar(String login,String clave) {
		ArrayList<Usuarios> lista=new ArrayList<Usuarios>();
		Usuarios e=new Usuarios();
		try {
		Connection con=null;
	con=Conexion.conectar();
	String sql="select * from usuarios where login=? and clave=? ";
	PreparedStatement sentencia=con.prepareStatement(sql);
	sentencia.setString(1,login);
	sentencia.setString(2,clave);
		ResultSet resultado=sentencia.executeQuery();
		System.out.println(sql);
		while (resultado.next()) {
			e.setLogin(resultado.getString("login"));
			e.setClave(resultado.getString("clave"));
		
			lista.add(e);
		}
		sentencia.close();
		resultado.close();
		con.close();
	}catch(SQLException ex) {
		System.out.println("sentencia fallida");
		ex.getStackTrace();
	}
	return lista;
	}

	@Override
	public int insertar(Catalogo e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Catalogo> consultarTodo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Catalogo> consultarTodo(LocalDate f1, LocalDate f2) {
	LocalDate f;
	ArrayList<Catalogo> listaViajes=new ArrayList<Catalogo>();
	Connection con=null;
	Statement sentencia=null;
	String sql="select * from catalogo where fechaInicio between '"+f1+
			"' and '"+f2+"' order by 3";
	System.out.println(sql);
	ResultSet resultado=null;
try {
	con=Conexion.conectar();
	sentencia=con.createStatement();
	resultado=sentencia.executeQuery(sql);
	while (resultado.next()) {
		Catalogo miViaje=new Catalogo();
		miViaje.setId(resultado.getInt(1));
		miViaje.setNombre(resultado.getString(2));
		//conversiones de tipo
		String fecha=String.valueOf(resultado.getDate(3));
		miViaje.setSalida(LocalDate.parse(fecha));
		fecha=String.valueOf(resultado.getDate(4));
		miViaje.setLlegada(LocalDate.parse(fecha));
		miViaje.setDescripcion (resultado.getString(5));
		miViaje.setDetalle (resultado.getString(6));
		miViaje.setPrecio(resultado.getInt(7));
		listaViajes.add(miViaje);
	}
	resultado.close();
	con.close();
}catch(SQLException ex) {
	ex.printStackTrace();
}
	return listaViajes;
}

	@Override
	public ArrayList<Catalogo> consultarTodo(LocalDate f1, LocalDate f2, int precio) {
		LocalDate f;
		ArrayList<Catalogo> listaViajes=new ArrayList<Catalogo>();
		Connection con=null;
		Statement sentencia=null;
		String sql="select * from catalogo where fechaInicio between '"+f1+
				"' and '"+f2+"' and precio<"+precio+"  order by 3";
		System.out.println(sql);
		ResultSet resultado=null;
	try {
		con=Conexion.conectar();
		sentencia=con.createStatement();
		resultado=sentencia.executeQuery(sql);
		while (resultado.next()) {
			Catalogo miViaje=new Catalogo();
			miViaje.setId(resultado.getInt(1));
			miViaje.setNombre(resultado.getString(2));
			//conversiones de tipo
			String fecha=String.valueOf(resultado.getDate(3));
			miViaje.setSalida(LocalDate.parse(fecha));
			fecha=String.valueOf(resultado.getDate(4));
			miViaje.setLlegada(LocalDate.parse(fecha));
			miViaje.setDescripcion (resultado.getString(5));
			miViaje.setDetalle (resultado.getString(6));
			miViaje.setPrecio(resultado.getInt(7));
			listaViajes.add(miViaje);
		}
		resultado.close();
		con.close();
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
		return listaViajes;
		
	}
	public ArrayList<Catalogo> consultar(LocalDate f1, LocalDate f2, int precio) {
		
		int  cuantosCriterios=0;
		String sql="select * from catalogo ";
		ArrayList<Catalogo> listaViajes=new ArrayList<Catalogo>();
		Connection con=null;
		Statement sentencia=null;
		if (f1!=null && f2!=null) {
		sql+=" where fechaInicio between '"+f1+"' and '"+f2+"'"; 
		cuantosCriterios++;
		}
		if (precio!=0) {
			if (cuantosCriterios==0) {
				sql+= "where precio<"+precio+" ";
			}else {
				sql+=" and precio<"+precio+" ";
			}
		}
		sql+=" order by 7,3";
		System.out.println(sql);
		ResultSet resultado=null;
	try {
		con=Conexion.conectar();
		sentencia=con.createStatement();
		resultado=sentencia.executeQuery(sql);
		while (resultado.next()) {
			Catalogo miViaje=new Catalogo();
			miViaje.setId(resultado.getInt(1));
			miViaje.setNombre(resultado.getString(2));
			//conversiones de tipo
			String fecha=String.valueOf(resultado.getDate(3));
			miViaje.setSalida(LocalDate.parse(fecha));
			fecha=String.valueOf(resultado.getDate(4));
			miViaje.setLlegada(LocalDate.parse(fecha));
			miViaje.setDescripcion (resultado.getString(5));
			miViaje.setDetalle (resultado.getString(6));
			miViaje.setPrecio(resultado.getInt(7));
			listaViajes.add(miViaje);
		}
		resultado.close();
		con.close();
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
		return listaViajes;
		
	}
	@Override
	public ArrayList<Catalogo> consultarTodo(int precio) {
		LocalDate f;
		ArrayList<Catalogo> listaViajes=new ArrayList<Catalogo>();
		Connection con=null;
		Statement sentencia=null;
		String sql="select * from catalogo where precio<"+precio+
				" order by 3";
		System.out.println(sql);
		ResultSet resultado=null;
	try {
		con=Conexion.conectar();
		sentencia=con.createStatement();
		resultado=sentencia.executeQuery(sql);
		while (resultado.next()) {
			Catalogo miViaje=new Catalogo();
			miViaje.setId(resultado.getInt(1));
			miViaje.setNombre(resultado.getString(2));
			//conversiones de tipo
			String fecha=String.valueOf(resultado.getDate(3));
			miViaje.setSalida(LocalDate.parse(fecha));
			fecha=String.valueOf(resultado.getDate(4));
			miViaje.setLlegada(LocalDate.parse(fecha));
			miViaje.setDescripcion (resultado.getString(5));
			miViaje.setDetalle (resultado.getString(6));
			miViaje.setPrecio(resultado.getInt(7));
			listaViajes.add(miViaje);
		}
		resultado.close();
		con.close();
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
		return listaViajes;
	}
	
	
	
}
