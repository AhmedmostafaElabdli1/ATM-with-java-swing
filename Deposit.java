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
import javax.swing.JOptionPane;
/**
 *
 * @author ahmed
 */
public class Deposit extends javax.swing.JFrame {

    /** Creates new form Deposit */
    public Deposit() {
        initComponents();
    }
     static int id =0;

    public int myAcc;
    public int oldBalance;
    public int newBalance ;

    public Deposit(int acc) {
        initComponents();
        myAcc=acc; 
        getBalance(acc);
        
    }
    Connection con =null ;
    PreparedStatement pst=null,pst1=null;
    ResultSet Rs = null,Rs1 =null ;
    Statement St =null,St1=null;
  
  public int getBalance(int acc){
  
       try{  
                 String query ="select * from accounts where card_id ="+myAcc ;

                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","Ahmed_mostafa");
                   St1=con.createStatement();
                   Rs1=St1.executeQuery(query);

                   if(Rs1.next()){
                     oldBalance= Rs1.getInt(3); 
                     return Rs1.getInt(3); 
                   }
                   else{
//                       JOptionPane.showMessageDialog(this, "Wrong in Account Number or Password");
                   }
                   
                    
                    
                   
               }
               catch(Exception e){
                    
                   JOptionPane.showMessageDialog(this, e);

               }
       return 0;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Deposit_amount = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

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
                .addContainerGap(146, Short.MAX_VALUE)
                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 342, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(131, 131, 131)
                .add(jLabel7)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel7))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(jLabel5)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 124, 35));
        jLabel6.setText("DEPOSIT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 124, 35));
        jLabel2.setText("Amount  :");

        Deposit_amount.setForeground(new java.awt.Color(2, 84, 100));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(229, 124, 35));
        jButton5.setText("DEPOSIT");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(87, 87, 87)
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 192, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(64, 64, 64)
                        .add(Deposit_amount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 182, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(255, 255, 255)
                        .add(jLabel6))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(247, 247, 247)
                        .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jLabel6)
                .add(119, 119, 119)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Deposit_amount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 101, Short.MAX_VALUE)
                .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(66, 66, 66))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
     String MyDate;
    private void getDate(){
        Date d =new Date();
        SimpleDateFormat s =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        MyDate = s.format(d);
        
           
   }
    private void DepositMoney(){
         try{
                   getDate();
                   ++id;
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","Ahmed_mostafa");
                   PreparedStatement Add = con.prepareStatement(String.format("insert into transactions values(?, ? ,?  ,?,?)" ));
                   Add.setInt(1,id);
                   Add.setInt(2, myAcc);
                   Add.setInt(3,Integer.valueOf( Deposit_amount.getText()));
                   Add.setString(4,MyDate);
                   Add.setString(5,"Deposit");
                   int row = Add.executeUpdate();
                   
                    
                   
                  con.close();
               }
               catch(Exception e){
                    
                   JOptionPane.showMessageDialog(this, e);

               }
    }
    public int newBalance(int old,int New){
        return old + New;
    }

    public void Deposit(int New){
       Connection con =null ;
    PreparedStatement pst=null,pst1=null;
    ResultSet Rs = null,Rs1 =null ;
    Statement St =null,St1=null;
  
         if(Deposit_amount.getText().equals(0)|| Integer.valueOf(Deposit_amount.getText())==0){
            JOptionPane.showMessageDialog(this, "Please! -Enter Valid Amount");

             
        }
        else{
            try{
                 String query ="update accounts set balance=? where card_id =?";  
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","Ahmed_mostafa");
                 PreparedStatement ps = con.prepareStatement(query);
                 int temp=newBalance(oldBalance,Integer.valueOf(Deposit_amount.getText()));
                 ps.setInt(1,temp);
                 ps.setInt(2, myAcc);
                 
                 if(ps.executeUpdate()==1){
                    newBalance=newBalance(oldBalance,Integer.valueOf(Deposit_amount.getText()));

                    DepositMoney();
                    JOptionPane.showMessageDialog(this, "Balance Uptaded");
                    
                    new mainMenu(myAcc).setVisible(true);
                    this.dispose();
 }
                 else{
                        JOptionPane.showMessageDialog(this, " Missing Information");
  
                 }
            
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);

            }
          
        }
    }
       
    
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
       Deposit(Integer.valueOf(Deposit_amount.getText()) );
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Deposit_amount;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
