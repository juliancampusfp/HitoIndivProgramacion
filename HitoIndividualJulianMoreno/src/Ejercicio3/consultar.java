package Ejercicio3;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class consultar {
	public static void main(String[] args) throws SQLException {
		//driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("No se ha encontrado el driver para MySQL");
			return;
		}
		System.out.println("Se ha cargado el Driver de MySQL");
		
		//conexión con base de datos
		String cadenaConexion = "jdbc:mysql://localhost:3306/hitoprog";
		String user = "root";
		String pass = ""; 
		Connection con ;
		try {
			con = DriverManager.getConnection(cadenaConexion, user, pass);
		} catch (SQLException e) {
			System.out.println("Error en la conexión con la BD");
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Se ha establecido la conexión con la Base de datos");

		try {
			Statement sent = (Statement) con.createStatement();
			ResultSet resultado = ((java.sql.Statement) sent).executeQuery("select * from comida");
			while (resultado.next()) {
				System.out.print(resultado.getString("nombre"));
				System.out.print(" -- "); 
				System.out.print(resultado.getInt("codigobarras"));
				System.out.print(" -- "); 
				System.out.print(resultado.getDate("caducidad"));
				System.out.print(" -- "); 
				System.out.print(resultado.getInt("unidad"));
				System.out.print(" -- "); 
				System.out.print(resultado.getDouble("precio"));
				System.out.print(" -- "); 
				System.out.println("");
			}
		} 
		catch (SQLException e) {
			System.out.println("Error");
			System.out.println(e.getMessage());
		}
		//cerramos base de datos 
		con.close();
		System.out.println("Cerrando base de datos");
	}
}