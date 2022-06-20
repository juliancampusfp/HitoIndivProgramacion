package Ejercicio3;

import java.beans.Statement;
import java.io.IOException;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.sun.jdi.connect.spi.Connection;

public class Añadir {
	public static void main(String[] args) throws IOException {
		// driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("No se ha encontrado el driver para MySQL");
			return;
		}
		System.out.println("Se ha cargado el Driver de MySQL");
		// establecemos conexión
		String cadenaConexion = "jdbc:mysql://localhost:3306/hitoprog";
		String user = "root";
		String pass = "";
		Connection con;
		try {
			con = (Connection) DriverManager.getConnection(cadenaConexion, user, pass);
		} catch (SQLException e) {
			System.out.println("No se ha podido establecer la conexión con la BD");
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Se ha establecido la conexión con la Base de datos");
		// insertamos en base de datos
		try {
				Statement sent = (Statement) ((java.sql.Connection) con).createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet resultado = ((java.sql.Statement) sent).executeQuery("SELECT * FROM productos");
				resultado.moveToInsertRow(); 
				resultado.updateString("nombre", "Manzana"); 
				resultado.updateInt("codigobarras", 10011001); 
				resultado.updateDate("caducidad", new Date(15/03/2023)); 
				resultado.updateInt("unidad", 2000); 
				resultado.updateDouble("precio", 1); 
				resultado.insertRow(); 
	
			} catch (SQLException e) {
				System.out.println("Error");
				System.out.println(e.getMessage());
			}		
		// cerramos conexion
			con.close();
			System.out.println("Cerrando base de datos");
	}
}
