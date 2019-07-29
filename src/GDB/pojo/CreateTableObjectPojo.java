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
public class CreateTableObjectPojo {
    static CreateTableFrame obj;

    public static CreateTableFrame getObj() {
        return obj;
    }

    public static void setObj(CreateTableFrame obj) {
        CreateTableObjectPojo.obj = obj;
    }
    
}
