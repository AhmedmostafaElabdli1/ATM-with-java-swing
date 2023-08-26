/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javaapplication1.Deposit.id;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class WithDraws extends javax.swing.JFrame {

    /** Creates new form WithDrows */
    public WithDraws() {
        initComponents();
    }
    int myAcc;
    public WithDraws(int acc){
        initComponents();
        myAcc=acc; 
        getBalance();
        
    }
   Connection con =null ;
    PreparedStatement pst=null,pst1=null;
    ResultSet Rs = null,Rs1 =null ;
    Statement St =null,St1=null;
    int oldBalance;
   
    
    public int newBalance(int old,int wd){
        return old-wd;
    }
   
    
    
    private void getBalance(){
         try{  
                 String query ="select * from accounts where card_id ="+myAcc ;

                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","Ahmed_mostafa");
                   St1=con.createStatement();
                   Rs1=St1.executeQuery(query);

                   if(Rs1.next()){
                     oldBalance= Rs1.getInt(3); 
                       this.dispose();
                       withdraws_balance.setText(""+oldBalance);
                   }
                   else{
//                       JOptionPane.showMessageDialog(this, "Wrong in Account Number or Password");
                   }
                   
                    
                    
                   
               }
               catch(Exception e){
                    
                   JOptionPane.showMessageDialog(this, e);

               }
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        withdraws_amount = new javax.swing.JTextField();
        withdraw = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        withdraws_balance = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 84, 100));

        jLabel5.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(229, 124, 35));
        jLabel5.setText("ATM MANAGEMENT SYSTEM");

        jLabel7.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 342, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(118, 118, 118)
                .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel7)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel6.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 124, 35));
        jLabel6.setText("Withdraw");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 124, 35));
        jLabel2.setText("Amount  :");

        withdraws_amount.setForeground(new java.awt.Color(2, 84, 100));

        withdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        withdraw.setForeground(new java.awt.Color(229, 124, 35));
        withdraw.setText("Withdraw");
        withdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawMouseClicked(evt);
            }
        });
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 124, 35));
        jLabel4.setText("Your Balance  :");

        withdraws_balance.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        withdraws_balance.setForeground(new java.awt.Color(50, 0, 250));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(204, 204, 204)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 192, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(withdraws_balance, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 192, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(87, 87, 87)
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 192, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(64, 64, 64)
                        .add(withdraws_amount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 182, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(224, 224, 224)
                        .add(jLabel6))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(240, 240, 240)
                        .add(withdraw, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel6)
                .add(34, 34, 34)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(withdraws_balance, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(48, 48, 48)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(withdraws_amount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 92, Short.MAX_VALUE)
                        .add(withdraw, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(40, 40, 40))))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawActionPerformed

        String MyDate;
    private void getDate(){
        Date d =new Date();
        SimpleDateFormat s =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         MyDate = s.format(d);
        
           
   }
    private void WithDrawsMoney(){
         try{
                   getDate();
                   ++id;
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","Ahmed_mostafa");
                   PreparedStatement Add = con.prepareStatement(String.format("insert into transactions values(?, ? ,?  ,?,?)" ));
                   Add.setInt(1,id);
                   Add.setInt(2, myAcc);
                   Add.setInt(3,Integer.valueOf( withdraws_amount.getText()));
                   Add.setString(4,MyDate);
                   Add.setString(5,"WithDraws");
                   int row = Add.executeUpdate();
                   
                    
                   
//                  JOptionPane.showMessageDialog(this, "Account Saved");
                  con.close();
//                  clean();
               }
               catch(Exception e){
                    
                   JOptionPane.showMessageDialog(this, e);

               }
    }
    private void withdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawMouseClicked
        if(withdraws_amount.getText().isEmpty()||withdraws_amount.getText().equals("0")){
                           JOptionPane.showMessageDialog(this, "Please! -Enter Valid Amount");

             
        }
        else if(oldBalance <Integer.valueOf(withdraws_amount.getText())){
                                       JOptionPane.showMessageDialog(this, "Not Enough Balance ! -Enter Valid Amount");

        }
        else{
            try{
                 String query ="update accounts set balance=? where card_id =?";  
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","Ahmed_mostafa");
                 PreparedStatement ps = con.prepareStatement(query);
                 int temp = newBalance(oldBalance,Integer.valueOf(withdraws_amount.getText()));
                 ps.setInt(1,temp);
                 ps.setInt(2, myAcc);
                 if(ps.executeUpdate()==1){
                     WithDrawsMoney();
                     JOptionPane.showMessageDialog(this, "Balance Uptaaded");
                     new mainMenu(myAcc).setVisible(true);
                     this.dispose();
                    
                 }
                 
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);

            }
               }     
    }//GEN-LAST:event_withdrawMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
            System.exit(1);

    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(WithDraws.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithDraws.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithDraws.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithDraws.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithDraws().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton withdraw;
    private javax.swing.JTextField withdraws_amount;
    private javax.swing.JLabel withdraws_balance;
    // End of variables declaration//GEN-END:variables

}
