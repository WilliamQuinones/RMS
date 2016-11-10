/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitchencodersrms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author williammcclain
 */
public class EditItem extends javax.swing.JFrame {

    /**
     * Creates new form NewItem
     */
    public EditItem() {
        initComponents();
    }

        String Original=null;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        units = new javax.swing.JRadioButton();
        liters = new javax.swing.JRadioButton();
        pounds = new javax.swing.JRadioButton();
        enter = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        criticalAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        criticalTime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        s1 = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        s3 = new javax.swing.JTextField();
        s4 = new javax.swing.JTextField();
        s5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Name");

        name.setText("name");

        jLabel2.setText("Type");

        units.setText("Units");

        liters.setText("Liters");

        pounds.setText("Pounds");

        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Critical Amount");

        criticalAmount.setText("amount");

        jLabel4.setText("Critical Time");

        criticalTime.setText("days");

        jLabel5.setText("Initial Amount");

        amount.setText("amount");

        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Shipment 1");

        jLabel7.setText("Shipment 3");

        jLabel8.setText("Shipment 4");

        jLabel9.setText("Shipment 5");

        jLabel10.setText("Shipment 2");

        jLabel11.setText(" Amounts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                .addComponent(enter)
                .addGap(232, 232, 232))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(criticalTime)
                    .addComponent(pounds)
                    .addComponent(liters)
                    .addComponent(units)
                    .addComponent(name)
                    .addComponent(criticalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(s1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(units)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(liters))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(pounds))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(criticalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(criticalTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enter)
                    .addComponent(backButton))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        String selected = name.getText();
        Item ni = new Item();
        ni.sendName(selected);
        ni.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3ActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        Connection c = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        PreparedStatement ps1 = null;
        c = KitchenCodersRMS.callDatbase();
        Statement stmt;
        String txt = name.getText();
        String sql;
        Double iAmount = Double.parseDouble(amount.getText());
        Double crit = Double.parseDouble(criticalAmount.getText());
        int time = Integer.parseInt(criticalTime.getText());
        int type = 0;
        if(units.isSelected()){
            type = 1;
        }
        if(liters.isSelected()){
            type = 2;
        }
        if(pounds.isSelected()){
            type = 3;
        }
        Double sh1a = Double.parseDouble(s1.getText());
        Double sh2a = Double.parseDouble(s2.getText());
        Double sh3a = Double.parseDouble(s3.getText());
        Double sh4a = Double.parseDouble(s4.getText());
        Double sh5a = Double.parseDouble(s5.getText());
        
        try{
            stmt = c.createStatement();
            sql = "UPDATE Inventory SET itemname = '"+txt+"' WHERE itemname = '"+Original+"';";
            
            stmt.executeUpdate(sql);
            
            sql = "UPDATE Inventory SET itemamount = "+iAmount+" WHERE itemname = '"+txt+"';";
            
            stmt.executeUpdate(sql);
            sql = "UPDATE Inventory SET criticalamount = "+crit+" WHERE itemname = '"+txt+"';";
            
            stmt.executeUpdate(sql);
            sql = "UPDATE Inventory SET criticaltime = "+time+" WHERE itemname = '"+txt+"';";
            
            stmt.executeUpdate(sql);
            sql = "UPDATE Inventory SET itemtype = "+type+" WHERE itemname = '"+txt+"';";
            
            stmt.executeUpdate(sql);
            sql = "UPDATE Inventory SET s1amount = "+sh1a+" WHERE itemname = '"+txt+"';";
            
            stmt.executeUpdate(sql);
            sql = "UPDATE Inventory SET s2amount = "+sh2a+" WHERE itemname = '"+txt+"';";
            
            stmt.executeUpdate(sql);
            sql = "UPDATE Inventory SET s3amount = "+sh3a+" WHERE itemname = '"+txt+"';";
            
            stmt.executeUpdate(sql);
            sql = "UPDATE Inventory SET s4amount = "+sh4a+" WHERE itemname = '"+txt+"';";
            
            stmt.executeUpdate(sql);
            sql = "UPDATE Inventory SET s5amount = "+sh5a+" WHERE itemname = '"+txt+"';";
            
            stmt.executeUpdate(sql);
            // Date dt = new Date(Date().getTime());
            //int crTime = (int) (new Date().getTime()/1000);
            /*
            sql = "UPDATE Inventory (itemamount, "+snumber+", "+samount+", "+ctime+") WHERE itemname = "+txt+" "
                        +"VALUES ("+iAmount+", "+currentTime+", "+Amount+", "+crTime+")";
            ps1.setString(1, txt);
            ps1.setString(2, snumber);
            ps1.setString(3, samount);
            ps1.setString(4, ctime);
            
           // ps.setInt(3, type1);
            ps1.setDouble(5, iAmount);
            ps1.setInt(6, currentTime);
            ps1.setDouble(7, Amount);
            
            ps1.setInt(8, crTime);
           
            //ps.setDouble(4, cAmount);
            
            ps1.executeUpdate(); */
            stmt = c.createStatement();
            stmt.executeUpdate(sql);
            //c.commit();
           
            
            
            c.close();
            dispose();
        Item ni = new Item();
        ni.sendName(txt);
        ni.setVisible(true);
        this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_enterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         Connection c = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        PreparedStatement ps1 = null;
        c = KitchenCodersRMS.callDatbase();
        Statement stmt;
        try {
            stmt = c.createStatement();
            String sql = "SELECT * FROM Inventory WHERE itemname = ?";
            ps = c.prepareStatement(sql);
            ps.setString(1, name.getText());
            rs = ps.executeQuery();
            System.out.println("query performed");
            ArrayList<String> itemNames = new ArrayList<String>();
            Double amt = null;
            String txt = null;
            String nm = null;
            int type1 = 0;
            int s1a = 0;
            int s2a = 0;
            int s3a = 0;
            int s4a = 0;
            int s5a = 0;
            Double camt = 0.0;
            int ccTime = 0;
            while(rs.next()){
                txt = rs.getString("itemname");
                itemNames.add(txt);
                amt = rs.getDouble("itemamount");
                type1 = rs.getInt("itemtype");
                s1a = rs.getInt("s1amount");
                s2a = rs.getInt("s2amount");
                s3a = rs.getInt("s3amount");
                s4a = rs.getInt("s4amount");
                s5a = rs.getInt("s5amount");
                nm = rs.getString("itemname");
                camt = rs.getDouble("criticalamount");
                ccTime = rs.getInt("criticaltime");
                
                //addInventory(txt);
                //addAmount(amt);
            }
           
                //Double amt = rs.getDouble("itemamount");
                String amount1 = amt.toString();
                amount.setText(amount1);
                String sh1;
                sh1 = Integer.toString(s1a);
                s1.setText(sh1);
                String sh2 = Integer.toString(s2a);
                s2.setText(sh2);
                String sh3 = Integer.toString(s3a);
                s3.setText(sh3);
                String sh4 = Integer.toString(s4a);
                s4.setText(sh4);
                String sh5 = Integer.toString(s5a);
                s5.setText(sh5);
                amount.setText(amt.toString());
                criticalAmount.setText(camt.toString());
                criticalTime.setText(Integer.toString(ccTime));
                c.close();
                 
               
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
                                        


        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItem().setVisible(true);
            }
        });
    }
    void sendName(String info){
        name.setText(info);
        Original = info;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField criticalAmount;
    private javax.swing.JTextField criticalTime;
    private javax.swing.JButton enter;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButton liters;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton pounds;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JRadioButton units;
    // End of variables declaration//GEN-END:variables
}
