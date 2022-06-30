
package demo;
import java.util.*;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame 
{ 
    public Login() {
        initComponents();
        Date dt=new Date();
        dateTF.setText("Date: "+dt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        UTF = new javax.swing.JTextField();
        LBTN = new javax.swing.JButton();
        PWD1 = new javax.swing.JPasswordField();
        dateTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(214, 214, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("User Id");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 50));

        l2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("Password");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 240, 50));

        UTF.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(UTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 320, 50));

        LBTN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LBTN.setText("LOGIN");
        LBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBTNActionPerformed(evt);
            }
        });
        getContentPane().add(LBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 270, -1));

        PWD1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PWD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWD1ActionPerformed(evt);
            }
        });
        PWD1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PWD1KeyPressed(evt);
            }
        });
        getContentPane().add(PWD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 320, 50));

        dateTF.setEditable(false);
        dateTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dateTF.setForeground(new java.awt.Color(51, 204, 0));
        dateTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(dateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 380, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/304764.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBTNActionPerformed
        
        String uid=UTF.getText();
        String pwd=String.valueOf(PWD1.getPassword());
        if(uid.equals("balaji"))
            if(pwd.equals("balaji123"))
            {
                new Home().setVisible(true);
                dispose();
            }
            else
                    JOptionPane.showMessageDialog(null,"wrong password");
        else
            JOptionPane.showMessageDialog(null,"wrong id");
    }//GEN-LAST:event_LBTNActionPerformed

    private void PWD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PWD1ActionPerformed

    private void PWD1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PWD1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PWD1KeyPressed

    
   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LBTN;
    private javax.swing.JPasswordField PWD1;
    private javax.swing.JTextField UTF;
    private javax.swing.JTextField dateTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
