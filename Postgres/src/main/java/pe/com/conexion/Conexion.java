/**
 * 
 */
package pe.com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 */
public class Conexion {

	private static final String Driver = "org.postgresql.Driver";
	private static final String url =  "jdbc:postgresql://localhost:5432/Pruebas";
	private static final String user =  "postgres";
	private static final String pass =  "root";
	
	public static Connection getConexion() throws ClassNotFoundException, SQLException {
		
		Class.forName(Driver);
				
		return DriverManager.getConnection(url,user,pass);
		
	}
	
	
}
