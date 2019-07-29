/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GDB.dbutil;

import GDB.pojo.ConnectionPojo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RISHABH SAHU
 */
public class DBConnection {
    private static Connection conn;
    public static int i=0;
 public  DBConnection()
    {
     try{
    Class.forName("oracle.jdbc.OracleDriver");    
    conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE",ConnectionPojo.getUsername(),ConnectionPojo.getPassword());  
       JOptionPane.showMessageDialog(null,"Connected Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
       i++;
        }
        catch(SQLException ex)
        {
        JOptionPane.showMessageDialog(null,"Invalid Username & Password","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(ClassNotFoundException ex)
        {
        JOptionPane.showMessageDialog(null,"Connection Fail(ClassNotFound) "+ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
}   
  public static int verify()
  {
      return i;
  }
    public static Connection getConnection()
    {
    return conn;
    }
    public static void closeConnection()
    {
        if(conn!=null)
       {
	try
	{
	conn.close();   
        JOptionPane.showMessageDialog(null,"Connection Close Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
	}
        catch(SQLException ex)
	{
            JOptionPane.showMessageDialog(null,"Connection doesn't Close","Error",JOptionPane.ERROR_MESSAGE);
	}
   }
 }
}
