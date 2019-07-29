/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GDB.pojo;


/**
 *
 * @author RISHABH SAHU
 */
public class ConnectionPojo {
   private static String username;
   private static String password;

    public static void setUsername(String username) {
        ConnectionPojo.username = username;
    }

    public static void setPassword(String password) {
        ConnectionPojo.password = password;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
   
   
}
