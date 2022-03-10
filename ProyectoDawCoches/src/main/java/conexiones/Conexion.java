package conexiones;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexiones.Conexion;

public class Conexion {
	// Definir la ruta de la base de datos
	private String dbUrl = "jdbc:mysql://localhost:3306/COCHES?useSSL=false";
	// Definir el nombre de usuario de la base de datos
	private String dbUser = "coches";
	// Definir la contraseña de la base de datos
	private String dbPassword = "coches";
	// Definir controlador de carga
	private String jdbcName = "com.mysql.cj.jdbc.Driver";

	public Conexion() {
		// TODO Auto-generated constructor stub
	}

	// Conéctate a la base de datos
	public Connection getConn() throws SQLException {
		Connection conn = null;
		try {
			Class.forName(jdbcName);
		} catch (Exception e) {
			System.out.println("¡Error al cargar el controlador!");
		}
		try {
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
		} catch (SQLException ex) {
			System.out.println("¡Error al conectarse a la base de datos!");
		}
		return conn;
	}

	// prueba
	public static void main(String[] args) {
		 try {
			System.out.println(new Conexion().getConn());
		

		 } catch (SQLException e) {
			e.printStackTrace();
		}
	}

}