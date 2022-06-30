package demo;
import java.util.*;// import date and time library from java library    
import java.sql.Connection;// import connection library or import java.sql.*;
import java.sql.DriverManager;// import driver manager from library or import java.sql.*;
import java.sql.ResultSet;//import result set from libraray or import java.sql.*;
import java.sql.Statement;// import statement from library or import java.sql.*;
import javax.swing.JOptionPane;//import joption pane from library 
public class customer_bill extends javax.swing.JFrame {
    public customer_bill() {
        initComponents();
        getCB.doClick();
        Date d=new Date();
        dateTF.setText("Date: "+d);
        msgTA.append("Date : "+d+"\n\n\n");
               getCB.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        billLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        pnLbl = new javax.swing.JLabel();
        pidLbl = new javax.swing.JLabel();
        sizeLbl = new javax.swing.JLabel();
        csizeLbl = new javax.swing.JLabel();
        colorLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        qtyLbl = new javax.swing.JLabel();
        BillTF = new javax.swing.JTextField();
        NameTF = new javax.swing.JTextField();
        pidTF = new javax.swing.JTextField();
        QtyTF = new javax.swing.JTextField();
        PriceTF = new javax.swing.JTextField();
        CB1 = new javax.swing.JComboBox<>();
        CBSize = new javax.swing.JComboBox<>();
        CBCSize = new javax.swing.JComboBox<>();
        CBColor = new javax.swing.JComboBox<>();
        msgTA = new java.awt.TextArea();
        TitleLbl = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        totalBtn = new javax.swing.JButton();
        addBtn1 = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        getCB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        billLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        billLbl.setForeground(new java.awt.Color(255, 255, 255));
        billLbl.setText("BILL NO.");
        getContentPane().add(billLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 117, 173, 43));

        nameLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nameLbl.setText("Name");
        getContentPane().add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 206, 173, 43));

        pnLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pnLbl.setForeground(new java.awt.Color(255, 255, 255));
        pnLbl.setText("Product Name");
        getContentPane().add(pnLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 292, 173, 49));

        pidLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pidLbl.setForeground(new java.awt.Color(255, 255, 255));
        pidLbl.setText("Product ID");
        getContentPane().add(pidLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 391, 173, 43));

        sizeLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sizeLbl.setForeground(new java.awt.Color(255, 255, 255));
        sizeLbl.setText("Size");
        getContentPane().add(sizeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 473, 173, 43));

        csizeLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        csizeLbl.setForeground(new java.awt.Color(255, 255, 255));
        csizeLbl.setText("CupSize");
        getContentPane().add(csizeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 561, 173, 49));

        colorLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        colorLbl.setForeground(new java.awt.Color(255, 255, 255));
        colorLbl.setText("Color");
        getContentPane().add(colorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 638, 173, 43));

        priceLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        priceLbl.setForeground(new java.awt.Color(255, 255, 255));
        priceLbl.setText("Price");
        getContentPane().add(priceLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 724, 173, 43));

        qtyLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        qtyLbl.setForeground(new java.awt.Color(255, 255, 255));
        qtyLbl.setText("Qty");
        getContentPane().add(qtyLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 805, 173, 45));

        BillTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(BillTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 259, 43));

        NameTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(NameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 259, 43));

        pidTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pidTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidTFActionPerformed(evt);
            }
        });
        getContentPane().add(pidTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 259, 43));

        QtyTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(QtyTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 800, 259, 43));

        PriceTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(PriceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 720, 259, 43));

        CB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ITEM" }));
        CB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB1ActionPerformed(evt);
            }
        });
        getContentPane().add(CB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 259, 44));

        CBSize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CBSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "28", "30", "32", "34", "36", "38", "40", "42" }));
        CBSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSizeActionPerformed(evt);
            }
        });
        getContentPane().add(CBSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 259, 43));

        CBCSize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CBCSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));
        CBCSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCSizeActionPerformed(evt);
            }
        });
        getContentPane().add(CBCSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 259, 49));

        CBColor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CBColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "White", "Skin", "Magenta", "Red", "Light Pink", "Pink", "Sky Blue", " " }));
        CBColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBColorActionPerformed(evt);
            }
        });
        getContentPane().add(CBColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, 259, 45));

        msgTA.setBackground(new java.awt.Color(153, 0, 0));
        msgTA.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        msgTA.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(msgTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 563, 650));

        TitleLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        TitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLbl.setText("BALAJI LADIES WEAR");
        getContentPane().add(TitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 540, 47));

        dateTF.setEditable(false);
        dateTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(dateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 570, 40));

        totalBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalBtn.setText("Total");
        totalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(totalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 790, 150, 47));

        addBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addBtn1.setText("ADD");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 790, 141, 47));

        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetBtn.setText("RESET");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 790, 141, 47));

        getCB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getCB.setText("getCB");
        getCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCBActionPerformed(evt);
            }
        });
        getContentPane().add(getCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 790, 140, 47));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/bg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1830, 1180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String pn,pid;
    private void CB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB1ActionPerformed

        CB1.setEditable(false);
        try
        {
            Class.forName("java.sql.Driver");//
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_mgt","root","");//
            Statement stmt=con.createStatement();//
            String sql="SELECT * FROM garments;";
            ResultSet rs=stmt.executeQuery(sql);//
            while(rs.next()) {
                String rs1,rs2;
                rs1=rs.getString("ProductName");
                // rs2=rs.getString("ProductId");
                CB1.addItem(rs1);

            }
        } catch(Exception e) {//
            JOptionPane.showMessageDialog(null, e);
        }

        try
        {
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_mgt","root","");
            Statement stmt=con.createStatement();
            String sql="SELECT * FROM garments where ProductName='" + CB1.getSelectedItem() +" ' ;";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                String rs1=rs.getString("ProductName");
                String rs2=rs.getString("ProductId");
                pn=rs1;
                pid=rs2;
                pidTF.setText(pid);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_CB1ActionPerformed

    private void pidTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidTFActionPerformed

    private void CBSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBSizeActionPerformed

    }//GEN-LAST:event_CBSizeActionPerformed

    private void CBCSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCSizeActionPerformed

    private void CBColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBColorActionPerformed

    int price,p=0,total,t=0,qty,q=0;
    private void totalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBtnActionPerformed
        // TODO add your handling code here:

        msgTA.append("Bill No.: "+BillTF.getText()+"\n");
        msgTA.append("Customer Name: "+NameTF.getText()+"\n\n");
        msgTA.append("\n\n\n\nTotal Amount: "+t+"\n\n");
    }//GEN-LAST:event_totalBtnActionPerformed

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        // TODO add your handling code here
        msgTA.append("Product Id: "+pid+"\n");
        msgTA.append("Product Name: "+pn+"\n");
        msgTA.append("Size: "+CBSize.getSelectedItem()+"\n");
        msgTA.append("Cup Size: "+CBCSize.getSelectedItem()+"\n");
        msgTA.append("Color: "+CBColor.getSelectedItem()+"\n");
        msgTA.append("Qty: "+QtyTF.getText()+"\n");
        msgTA.append("Price: "+PriceTF.getText()+"\n\n\n");
        price=Integer.parseInt(PriceTF.getText());
        p=p+price;
        qty=Integer.parseInt(QtyTF.getText());
        q=q+qty;
        total=price*qty;
        t=t+total;
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:

        getCB.doClick();
        msgTA.setText(null);
        BillTF.setText("");
         price=0;
                    p=0;
                    total=0;
                    t=0;
                    qty=0;
                    q=0;
    }//GEN-LAST:event_resetBtnActionPerformed

    private void getCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCBActionPerformed

        CB1.removeAllItems();
        try
        {
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_mgt","root","");
            Statement stmt=con.createStatement();
            String sql="SELECT ProductName FROM garments;";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()) {
                String r;
                r=rs.getString("ProductName");
                CB1.addItem(r);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_getCBActionPerformed

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
            java.util.logging.Logger.getLogger(customer_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BillTF;
    private javax.swing.JComboBox<String> CB1;
    private javax.swing.JComboBox<String> CBCSize;
    private javax.swing.JComboBox<String> CBColor;
    private javax.swing.JComboBox<String> CBSize;
    private javax.swing.JTextField NameTF;
    private javax.swing.JTextField PriceTF;
    private javax.swing.JTextField QtyTF;
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JButton addBtn1;
    private javax.swing.JLabel billLbl;
    private javax.swing.JLabel colorLbl;
    private javax.swing.JLabel csizeLbl;
    private javax.swing.JTextField dateTF;
    private javax.swing.JButton getCB;
    private javax.swing.JLabel jLabel1;
    private java.awt.TextArea msgTA;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel pidLbl;
    private javax.swing.JTextField pidTF;
    private javax.swing.JLabel pnLbl;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JLabel qtyLbl;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel sizeLbl;
    private javax.swing.JButton totalBtn;
    // End of variables declaration//GEN-END:variables
}
