
package demo;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
        
public class LovinoForm extends javax.swing.JFrame {

   
    public LovinoForm() {
        initComponents();
        java.util.Date dt=new java.util.Date();
        dateTF.setText("Date: "+dt);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBL = new javax.swing.JTable();
        showBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        updBtn1 = new javax.swing.JButton();
        dateTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        TBL.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sno.", "Size", "Cup Size", "Qty", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TBL);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 990, 270));

        showBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        showBtn.setText("SHOW");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });
        getContentPane().add(showBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 180, -1));

        delBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delBtn.setText("DELETE");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        getContentPane().add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 160, -1));

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 160, -1));

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 180, -1));

        updBtn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updBtn1.setText("UPDATE");
        updBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(updBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 190, -1));

        dateTF.setEditable(false);
        dateTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dateTF.setForeground(new java.awt.Color(51, 204, 0));
        dateTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(dateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 380, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        DefaultTableModel model=(DefaultTableModel) TBL.getModel();
         try
            {
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_mgt","root","");
                Statement stmt=con.createStatement();
              //  JOptionPane.showMessageDialog(null," Connected");
                String sql="SELECT * FROM lovinoform;";
                ResultSet rs=stmt.executeQuery(sql);
                
                while(rs.next())
                    {
                        String sno=rs.getString("Sno");
                        String size=rs.getString("Size");
                        String cupsize=rs.getString("CupSize");
                        String qty=rs.getString("Qty");
                        String price=rs.getString("Price");
                        
                        model.addRow(new Object[] {sno,size,cupsize,qty,price});
                    }
                rs.close();
                stmt.close();
                con.close();
            }     
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
    }//GEN-LAST:event_showBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
     
                new Update_Lovinoform().setVisible(true);
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void updBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updBtn1ActionPerformed
            
               new Update_Lovinoform().setVisible(true);
    }//GEN-LAST:event_updBtn1ActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
                
                new Update_Lovinoform().setVisible(true);
    }//GEN-LAST:event_delBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        
                new Garments().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LovinoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LovinoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LovinoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LovinoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LovinoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBL;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateTF;
    private javax.swing.JButton delBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showBtn;
    private javax.swing.JButton updBtn1;
    // End of variables declaration//GEN-END:variables
}
