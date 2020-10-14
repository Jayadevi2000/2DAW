package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static Connection conectar() {
		Connection con = null;
		
		String password = "rootmysql";
		String usuario = "root";
		String url = "jdbc:mysql://localhost/mantenimiento";
				
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/mantenimiento",usuario,password);
			
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}
}
