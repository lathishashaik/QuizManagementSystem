/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class ConnectionProvider {
    public static Connection getCon(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
   
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oems", "root", "minnie@143");
            return con;
        }
        catch(Exception e){
            return null;
        }
        
    }
}
