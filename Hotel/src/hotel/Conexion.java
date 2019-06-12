/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Fernando
 */
public class Conexion {
    public static Connection conectar() {
		Connection con = null;
 
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/basereserva?user=root&password=root";
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conexion Satisfactoria");
			}
 
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
    
}
