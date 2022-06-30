package demo;

import java.util.Date;

public class Normal_Calc extends javax.swing.JFrame {
         double fnum,snum,result;
         String operation;
         
         public Normal_Calc() {
                    initComponents();
                    Date dt=new Date();
                    dateTF.setText("Date: "+dt);
                }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minBtn = new javax.swing.JButton();
        plusBtn = new javax.swing.JButton();
        mulBtn = new javax.swing.JButton();
        GstBtn = new javax.swing.JButton();
        perBtn = new javax.swing.JButton();
        TF1 = new javax.swing.JTextField();
        eqlBtn = new javax.swing.JButton();
        LBL1 = new javax.swing.JLabel();
        clear1 = new javax.swing.JButton();
        divBtn1 = new javax.swing.JButton();
        dateTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minBtn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        minBtn.setText("-");
        minBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minBtnActionPerformed(evt);
            }
        });
        getContentPane().add(minBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 160, -1));

        plusBtn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        plusBtn.setText("+");
        plusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusBtnActionPerformed(evt);
            }
        });
        getContentPane().add(plusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 160, 52));

        mulBtn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mulBtn.setText("*");
        mulBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mulBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 160, 55));

        GstBtn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        GstBtn.setText("GST");
        GstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GstBtnActionPerformed(evt);
            }
        });
        getContentPane().add(GstBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, 200, 50));

        perBtn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        perBtn.setText("%");
        perBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perBtnActionPerformed(evt);
            }
        });
        getContentPane().add(perBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 160, 50));

        TF1.setBackground(new java.awt.Color(0, 0, 204));
        TF1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TF1.setForeground(new java.awt.Color(255, 255, 255));
        TF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF1ActionPerformed(evt);
            }
        });
        getContentPane().add(TF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 547, 270));

        eqlBtn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        eqlBtn.setText("=");
        eqlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqlBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eqlBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 200, 55));

        LBL1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LBL1.setForeground(new java.awt.Color(0, 0, 153));
        LBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL1.setText("Calculator");
        getContentPane().add(LBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 920, 50));

        clear1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        getContentPane().add(clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 200, 50));

        divBtn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        divBtn1.setText("/");
        divBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(divBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 200, -1));

        dateTF.setEditable(false);
        dateTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dateTF.setForeground(new java.awt.Color(51, 204, 0));
        dateTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(dateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 380, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/304742.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void plusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusBtnActionPerformed

        fnum=Double.parseDouble(TF1.getText());
        TF1.setText("");
        operation="+";
    }//GEN-LAST:event_plusBtnActionPerformed

    private void TF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF1ActionPerformed

    private void eqlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqlBtnActionPerformed
        
        String answer;
        snum=Double.parseDouble(TF1.getText());
        
        if(operation=="+")
        {
            result=fnum+snum;
            answer=String.format("%.2f", result);
            TF1.setText(answer);
        }
        
         if(operation=="-")
        {
            result=fnum-snum;
            answer=String.format("%.2f", result);
            TF1.setText(answer);
        }
         
         if(operation=="*")
        {
            result=fnum*snum;
            answer=String.format("%.2f", result);
            TF1.setText(answer);
        }
         
         if(operation=="/")
        {
            result=fnum/snum;
            answer=String.format("%.2f", result);
            TF1.setText(answer);
        }
         
         if(operation=="%")
        {
            result=fnum-((snum*fnum)/100);
            answer=String.format("%.2f", result);
            TF1.setText(answer);
        }  
       
    }//GEN-LAST:event_eqlBtnActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
  
        TF1.setText("");
    }//GEN-LAST:event_clear1ActionPerformed

    private void minBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minBtnActionPerformed
       
        fnum=Double.parseDouble(TF1.getText());
        TF1.setText("");
        operation="-";
    }//GEN-LAST:event_minBtnActionPerformed

    private void mulBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulBtnActionPerformed
       
        fnum=Double.parseDouble(TF1.getText());
        TF1.setText("");
        operation="*";
    }//GEN-LAST:event_mulBtnActionPerformed

    private void GstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GstBtnActionPerformed
       
        String answer;
        fnum=Double.parseDouble(TF1.getText());
        TF1.setText("");
        double gst;
        gst=(5*fnum)/100;
        result=fnum+gst;
        answer=String.format("%.2f", result);
        TF1.setText(answer);
    }//GEN-LAST:event_GstBtnActionPerformed

    private void perBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perBtnActionPerformed

        fnum=Double.parseDouble(TF1.getText());
        TF1.setText("");
        operation="%";
    }//GEN-LAST:event_perBtnActionPerformed

    private void divBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_divBtn1ActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Normal_Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GstBtn;
    private javax.swing.JLabel LBL1;
    private javax.swing.JTextField TF1;
    private javax.swing.JButton clear1;
    private javax.swing.JTextField dateTF;
    private javax.swing.JButton divBtn1;
    private javax.swing.JButton eqlBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton minBtn;
    private javax.swing.JButton mulBtn;
    private javax.swing.JButton perBtn;
    private javax.swing.JButton plusBtn;
    // End of variables declaration//GEN-END:variables
}
