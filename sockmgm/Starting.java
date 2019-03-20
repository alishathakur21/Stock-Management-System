/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockmgm;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Starting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
               try{
                   
            String db="jdbc:mysql://localhost/stockdb";
            Connection myconnection=DriverManager.getConnection(db,"root","");
            String q="select * from addemp";
            PreparedStatement myst=myconnection.prepareStatement(q);
            
            ResultSet res=myst.executeQuery();
             if(res.next())
             {
                 Login obj=new Login();
                 obj.setVisible(true);
                 
             }
             else
             {
                 Adduser obj=new Adduser();
                 obj.setVisible(true);
             }
                   
      
       }
        catch(Exception e)
        {
                  
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }


    }
    
}
