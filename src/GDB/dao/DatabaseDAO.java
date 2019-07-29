/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GDB.dao;

import GDB.dbutil.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RISHABH SAHU
 */
public class DatabaseDAO {

    public static ArrayList<String> getAllTableName() throws SQLException {
        Connection conn =DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from tab");
        ArrayList<String> tableList = new ArrayList<>();
        while (rs.next()) {
             tableList.add(rs.getString(1));
        }
        return tableList;
    }
    public static ArrayList<String> getAllTableAttribute(String table) throws SQLException
     {
         Connection conn =DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("select utc.COLUMN_NAME,utc.DATA_TYPE from USER_TAB_COLUMNS utc WHERE utc.TABLE_NAME=? ");
         ps.setString(1, table);
         ResultSet rs=ps.executeQuery();
         ArrayList<String> attributeList=new ArrayList<>();
         while (rs.next()) {
             attributeList.add(rs.getString(1));
        }
        return attributeList;
     }
    public static ArrayList<String> getColumnItems(String table,String col)throws SQLException
    {
         Connection conn =DBConnection.getConnection();
         String str="select "+col+" from "+table;
         PreparedStatement ps=conn.prepareStatement(str);
          ResultSet rs=ps.executeQuery();
         ArrayList<String> colItemList=new ArrayList<>();
         while (rs.next()) {
             colItemList.add(rs.getString(1));
        }
        return colItemList;
    }
   public static String getDataType(String table,String col)throws SQLException
    {
    Connection conn =DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select utc.DATA_TYPE from USER_TAB_COLUMNS utc WHERE utc.TABLE_NAME=? and utc.COLUMN_NAME=? ");
    ps.setString(1, table);
    ps.setString(2, col);
    ResultSet rs=ps.executeQuery();
    String str="";
    if(rs.next())
       str=rs.getString(1);
    return str;
    }
    public static int runQuery(String query)throws SQLException
    {
    Connection conn =DBConnection.getConnection();
    Statement st= conn.createStatement();
    int res=st.executeUpdate(query); 
    return res;
    }
    public static void runQuery2(String query)throws SQLException
    {
    Connection conn =DBConnection.getConnection();
    Statement st= conn.createStatement();
    st.executeUpdate(query); 
    }
    public static ArrayList<String> runQuery3(String query,ArrayList<String> dList)throws SQLException
    {
    Connection conn =DBConnection.getConnection();
    Statement st= conn.createStatement();
    ResultSet rs=st.executeQuery(query);
    ArrayList<String> List = new ArrayList<>();
        System.out.println(dList.size());
       while(rs.next())
       {
        for(int i=0;i<dList.size();)
        {
         switch(dList.get(i))
         {
             case "VARCHAR2":
             List.add(rs.getString(i+1));i++;break;
             case "CHAR":
             List.add(rs.getString(i+1));i++;break;  
             case "NUMBER" : case "INT":
             List.add(String.valueOf(rs.getInt(i+1)));i++;break;
             case "DATE":
             List.add(String.valueOf(rs.getDate(i+1)));i++;break;
             case "FLOAT":
             List.add(String.valueOf(rs.getDouble(i+1)));i++;break; 
             case "REAL":
             List.add(String.valueOf(rs.getFloat(i+1)));i++;break; 
             case "DECIMAL":case "NUMERIC":
             List.add(String.valueOf(rs.getBigDecimal(i+1)));i++;break;
             case "SMALLINT":
             List.add(String.valueOf(rs.getShort(i+1)));i++;break;
         }
        }
       }
   return List;
    }
}