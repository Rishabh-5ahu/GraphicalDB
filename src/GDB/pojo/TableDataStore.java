/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GDB.pojo;

import GDB.gui.CreateTableFrame;

/**
 *
 * @author RISHABH SAHU
 */
public class TableDataStore {
    public static CreateTableFrame obj;
    public static String ColumnName;
    public static String DataType;
    public static String size;
    public static String scale;
    public static String defaultValue;
    public static String keyConstraint;
    

    public static String getScale() {
        return scale;
    }
   
    public static String getDefaultValue() {
        return defaultValue;
    }
    
    public static String getkeyConstraint() {
        return keyConstraint;
    }

    public static CreateTableFrame getObj() {
        return obj;
    }

    public static String getColumnName() {
        return ColumnName;
    }

    public static String getDataType() {
        return DataType;
    }

    public static void setDefaultValue(String defaultValue) {
        TableDataStore.defaultValue = defaultValue;
    }
    
    public static String getSize() {
        return size;
    }

    public static void setScale(String scale) {
        TableDataStore.scale = scale;
    }
   
    public static void setkeyConstraint(String constraint) {
        TableDataStore.keyConstraint = constraint;
    }
    
    public static void setObj(CreateTableFrame obj) {
        TableDataStore.obj = obj;
    }

    public static void setColumnName(String ColumnName) {
        TableDataStore.ColumnName = ColumnName;
    }

    public static void setDataType(String DataType) {
        TableDataStore.DataType = DataType;
    }

    public static void setSize(String size) {
        TableDataStore.size = size;
    }
    
}
