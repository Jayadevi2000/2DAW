package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static Connection conectar()   {
		Connection con = null;
		
		String password = "";
		String usuario = "root";
		String url = "jdbc:mysql://localhost/mantenimiento";
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,usuario,password);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}
}
