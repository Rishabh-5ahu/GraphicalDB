/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GDB.gui;

import GDB.dao.DatabaseDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RISHABH SAHU
 */
public class UpdateQueryFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateQueryFrame
     */
    private boolean tableAttributeNotSelected=true;
    private boolean tableAttributeNotSelected2=true;
    private String Datatype;
    private String Datatype2;
    public UpdateQueryFrame() {
        initComponents();
        loadTableName();
        super.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcTableName = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jcTableAttribute = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        txtValue = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jcTableAttribute2 = new javax.swing.JComboBox<>();
        jcColumnItem = new javax.swing.JComboBox<>();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Table");

        jcTableName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTableNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Select Table:");

        btnOK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Set"));

        jcTableAttribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTableAttributeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcTableAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcTableAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Value"));

        txtValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValueActionPerformed(evt);
            }
        });
        txtValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValueKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtValue)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Where"));
        jPanel4.setToolTipText("");

        jcTableAttribute2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTableAttribute2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcTableAttribute2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jcColumnItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcTableAttribute2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcColumnItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcTableName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnOK)
                        .addComponent(btnBack))
                    .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcTableNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTableNameActionPerformed
        try
        {
           ArrayList<String> List=DatabaseDAO.getAllTableAttribute(jcTableName.getSelectedItem().toString());
           tableAttributeNotSelected=true;
           tableAttributeNotSelected2=true;
           jcTableAttribute.removeAllItems();
           jcTableAttribute2.removeAllItems();
            for(String tabAttribute:List)
            {
                jcTableAttribute.addItem(tabAttribute);
                jcTableAttribute2.addItem(tabAttribute);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "SQLException "+ex,"Error ",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jcTableNameActionPerformed

    private void jcTableAttribute2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTableAttribute2ActionPerformed
         if(tableAttributeNotSelected2){
         tableAttributeNotSelected2=false;
         return;
        }
        try
        {
            ArrayList<String> List=DatabaseDAO.getColumnItems(jcTableName.getSelectedItem().toString(),jcTableAttribute2.getSelectedItem().toString());
            Datatype2=DatabaseDAO.getDataType(jcTableName.getSelectedItem().toString(),jcTableAttribute2.getSelectedItem().toString());
            Datatype=DatabaseDAO.getDataType(jcTableName.getSelectedItem().toString(),jcTableAttribute.getSelectedItem().toString());
            //For lblmsg
            jcColumnItem.removeAllItems();
            for(String colItem:List)
            {
                jcColumnItem.addItem(colItem);
            }           
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "SQLException "+ex,"Error ",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jcTableAttribute2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      QuerySelectionFrame qsf=new QuerySelectionFrame();
      qsf.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String str="";
        if((Datatype.equals("VARCHAR2")||Datatype.equals("CHAR"))&&(Datatype2.equals("VARCHAR2")||Datatype2.equals("CHAR")))
        str="update "+jcTableName.getSelectedItem().toString()+" set "+jcTableAttribute.getSelectedItem().toString()+" = '"+txtValue.getText()+"' where "+jcTableAttribute2.getSelectedItem().toString()+" = '"+jcColumnItem.getSelectedItem().toString()+"'";
        else if((Datatype.equals("NUMBER")||Datatype2.equals("INT"))&&(Datatype2.equals("NUMBER")||Datatype2.equalsIgnoreCase("INT")))
        str="update "+jcTableName.getSelectedItem().toString()+" set "+jcTableAttribute.getSelectedItem().toString()+" = "+txtValue.getText()+" where "+jcTableAttribute2.getSelectedItem().toString()+" = "+jcColumnItem.getSelectedItem().toString();   
        else if((Datatype.equals("VARCHAR2")||Datatype.equals("CHAR"))&&(Datatype2.equals("NUMBER")||Datatype2.equalsIgnoreCase("INT")))
        str="update "+jcTableName.getSelectedItem().toString()+" set "+jcTableAttribute.getSelectedItem().toString()+" = '"+txtValue.getText()+"' where "+jcTableAttribute2.getSelectedItem().toString()+" = "+jcColumnItem.getSelectedItem().toString();    
        else  
        str="update "+jcTableName.getSelectedItem().toString()+" set "+jcTableAttribute.getSelectedItem().toString()+" = "+txtValue.getText()+" where "+jcTableAttribute2.getSelectedItem().toString()+" = '"+jcColumnItem.getSelectedItem().toString()+"'";        
        try
        {
            int res=DatabaseDAO.runQuery(str);
             if(res!=0)
             {
                 JOptionPane.showMessageDialog(null,"Updated Successfully.","Success ",JOptionPane.INFORMATION_MESSAGE);
                 txtValue.setText("");
             }
              else
                 JOptionPane.showMessageDialog(null,"Record not Update","Error ",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "SQLException "+ex,"Error ",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void txtValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValueActionPerformed
        
    }//GEN-LAST:event_txtValueActionPerformed

    private void jcTableAttributeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTableAttributeActionPerformed
       if(tableAttributeNotSelected){
         tableAttributeNotSelected=false;
         return;
        }
       try
        {Datatype=DatabaseDAO.getDataType(jcTableName.getSelectedItem().toString(),jcTableAttribute.getSelectedItem().toString());}
       catch(SQLException ex)
       {JOptionPane.showMessageDialog(null, "SQLException "+ex,"Error ",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_jcTableAttributeActionPerformed

    private void txtValueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValueKeyReleased
      if(txtValue.getText().isEmpty())
      lblMsg.setText("");
      else if(Datatype.equals("INT")||Datatype.equals("NUMBER")||Datatype.equals("INTEGER"))
      {
       try 
       {
       Integer.parseInt(txtValue.getText());
       lblMsg.setText("");
       } 
      catch (NumberFormatException e)  {
      lblMsg.setText("Provide Correct Input");
      btnOK.setEnabled(false);}
    }
    }//GEN-LAST:event_txtValueKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateQueryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateQueryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateQueryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateQueryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateQueryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> jcColumnItem;
    private javax.swing.JComboBox<String> jcTableAttribute;
    private javax.swing.JComboBox<String> jcTableAttribute2;
    private javax.swing.JComboBox<String> jcTableName;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
public  void loadTableName()
{
    try{
        ArrayList<String> tableList=DatabaseDAO.getAllTableName();
         if(tableList.isEmpty()==true)
             JOptionPane.showMessageDialog(null, "Sorry.! No Table is created yet","No Record",JOptionPane.INFORMATION_MESSAGE);
        else
         {
        jcTableName.removeAllItems(); 
        for(String tList:tableList)
        jcTableName.addItem(tList);    
        }
        }
    catch(SQLException ex)
    {
      JOptionPane.showMessageDialog(null, "SQLException "+ex,"Error ",JOptionPane.ERROR_MESSAGE);  
    }
}
}
