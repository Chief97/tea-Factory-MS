/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.sql.*;
import com.mysql.jdbc.Connection;
/**
 *
 * @author sggra
 */
public class DBconnect {

    public static Connection getConnection() 
    { 
        Connection conn=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3406/teaplantation", "root", "root");
        }
        
        catch (Exception e)
        {
            System.out.println("error in connection:"+e);
        }
        return conn;
    }

    public String preparestatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
