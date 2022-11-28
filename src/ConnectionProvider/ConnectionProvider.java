/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class ConnectionProvider {
    
     public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem", "root", "Eseces@1000");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
   
     }
    
}
