/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;




import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hms";
            String username = "root";
            String password = "01634400765tT@";
            c = DriverManager.getConnection(url, username, password);
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

