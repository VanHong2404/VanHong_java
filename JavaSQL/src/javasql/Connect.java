/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Hong Beo
 */
public class Connect {
    public Connection getConnection() throws SQLException {
        Connection conn=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String conStr = "jdbc:mysql://localhost:3306/QLYTHUVIEN";
            conn = DriverManager.getConnection(conStr, "root", "2404");
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }
        return conn;
    }
    
     
}
