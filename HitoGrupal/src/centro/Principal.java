package centro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Principal {
 
	
	public static void main(String[] args) {
		
		int notas=0;
		
		Alumno alum = new Alumno("pepe","pepe","pepe", 1231,3,4,5);
		
		// Paso 1: Cargar el driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("No se ha encontrado el driver para MySQL");
			return;
		}
		System.out.println("Se ha cargado el Driver de MySQL");
		
		// Paso 2: Establecer conexión con la base de datos
		String cadenaConexion = "jdbc:mysql://localhost:3306/centro";
		String user = "root";
		String pass = ""; 
		Connection con;
		try {
			con = DriverManager.getConnection(cadenaConexion, user, pass);
		} catch (SQLException e) {
			System.out.println("Error en la conexión con la BD");
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Se ha establecido la conexión con la Base de datos");
		
		// Paso 3: Interactuar con la BD (todavía pendiente)
		
		
		/* Paso 4: Cerrar la conexión
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("No se ha podido cerrar la conexión con la BD");
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Se ha cerrado la base de datos")*/
		
		
		
	try {
			Statement sentencia = con.createStatement();
			ResultSet rs = sentencia.executeQuery("SELECT * FROM curso");
			System.out.println("Cursos");
			while (rs.next()) {
				System.out.print(rs.getString("nombreCurso"));
				System.out.print(" - "); 
				System.out.print(rs.getString("fecha"));
				System.out.print(" - "); 
				System.out.print(rs.getInt("idcurso"));
				System.out.println(); // Retorno de carro
			}
		} catch (SQLException e) {
			System.out.println("Error al realizar el listado de productos");
			System.out.println(e.getMessage());
		}

		
		
	
	try {
			Statement sentencia = con.createStatement();
			ResultSet rs = sentencia.executeQuery("SELECT * FROM alumnos");
			System.out.println("Alumnos");
			while (rs.next()) {
				System.out.print(rs.getString("dni"));
				System.out.print(" - "); 
				System.out.print(rs.getString("nombre"));
				System.out.print(" - "); 
				System.out.print(rs.getString("apellidos"));
				System.out.print(" - "); 
				System.out.print(rs.getInt("Num_Matricula"));
				System.out.print(" - "); 
				System.out.print(rs.getInt("T1"));
				System.out.print(" - "); 
				System.out.print(rs.getInt("T2"));
				System.out.print(" - "); 
				System.out.print(rs.getInt("T3"));
				notas=rs.getInt("T1")+rs.getInt("T2")+rs.getInt("T3");
				System.out.print(" - "); 
				System.out.println(alum.toString());
				System.out.print(" - "); 
				System.out.println(alum.media(notas)); 
					
				
				System.out.println(); // Retorno de carro
			}
		} catch (SQLException e) {
			System.out.println("Error al realizar el listado de productos");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Error al realizar el listado de productos");
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
	}
}
