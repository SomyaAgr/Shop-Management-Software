
package demo;

import java.util.Date;

public class Home extends javax.swing.JFrame {
 public Home() {
        initComponents();
       Date dt=new Date();
      //  dateTF.setText("Date: "+dt);
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        Stock = new javax.swing.JMenu();
        GMI = new javax.swing.JMenuItem();
        Cal = new javax.swing.JMenu();
        Normal = new javax.swing.JMenuItem();
        Bill = new javax.swing.JMenu();
        customer = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(214, 214, 0, 0));

        desktopPane.setBackground(new java.awt.Color(0, 17, 218));
        desktopPane.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/demo/Two-Businessmen-Shaking-Hands-Article-201806211800.jpg")))); // NOI18N
        desktopPane.setAlignmentX(1.0F);
        desktopPane.setAlignmentY(1.0F);
        desktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktopPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l2.setText(" BALAJI LADIES WEAR MANAGEMENT PORTAL");
        desktopPane.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 860, 70));

        l1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l1.setText("WELCOME TO ");
        desktopPane.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 290, 70));

        l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/Two-Businessmen-Shaking-Hands-Article-201806211800.jpg"))); // NOI18N
        desktopPane.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        Stock.setForeground(new java.awt.Color(0, 0, 153));
        Stock.setMnemonic('f');
        Stock.setText("Stock");
        Stock.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockActionPerformed(evt);
            }
        });

        GMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        GMI.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        GMI.setForeground(new java.awt.Color(204, 0, 102));
        GMI.setMnemonic('o');
        GMI.setText("Garments");
        GMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GMIActionPerformed(evt);
            }
        });
        Stock.add(GMI);

        menuBar.add(Stock);

        Cal.setForeground(new java.awt.Color(0, 0, 153));
        Cal.setMnemonic('e');
        Cal.setText("Calculator");
        Cal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        Normal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Normal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Normal.setForeground(new java.awt.Color(204, 0, 51));
        Normal.setMnemonic('t');
        Normal.setText("Normal");
        Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormalActionPerformed(evt);
            }
        });
        Cal.add(Normal);

        menuBar.add(Cal);

        Bill.setForeground(new java.awt.Color(0, 0, 153));
        Bill.setMnemonic('h');
        Bill.setText("Bill");
        Bill.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        customer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        customer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        customer.setForeground(new java.awt.Color(204, 0, 51));
        customer.setMnemonic('c');
        customer.setText("Customer Bill");
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        Bill.add(customer);

        menuBar.add(Bill);

        jMenu1.setForeground(new java.awt.Color(0, 0, 153));
        jMenu1.setText("Back");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(204, 0, 51));
        jMenuItem1.setText("Go Back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        desktopPane.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GMIActionPerformed
       new Garments().setVisible(true);
    }//GEN-LAST:event_GMIActionPerformed

    private void StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockActionPerformed
          
    }//GEN-LAST:event_StockActionPerformed

    private void NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalActionPerformed
       new Normal_Calc().setVisible(true);
    }//GEN-LAST:event_NormalActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
    new customer_bill().setVisible(true);
    }//GEN-LAST:event_customerActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Login().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Bill;
    private javax.swing.JMenu Cal;
    private javax.swing.JMenuItem GMI;
    private javax.swing.JMenuItem Normal;
    private javax.swing.JMenu Stock;
    private javax.swing.JMenuItem customer;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
