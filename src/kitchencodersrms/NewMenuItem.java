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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author williammcclain
 */
public class NewMenuItem extends javax.swing.JFrame {
    PreparedStatement ps=null;
    Connection c = null;
    ResultSet rs = null;

    /**
     * Creates new form NewMenuItem
     */
    public NewMenuItem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        item1 = new javax.swing.JTextField();
        item2 = new javax.swing.JTextField();
        item3 = new javax.swing.JTextField();
        item4 = new javax.swing.JTextField();
        item5 = new javax.swing.JTextField();
        amount1 = new javax.swing.JTextField();
        amount2 = new javax.swing.JTextField();
        amount3 = new javax.swing.JTextField();
        amount4 = new javax.swing.JTextField();
        amount5 = new javax.swing.JTextField();
        amount9 = new javax.swing.JTextField();
        amount10 = new javax.swing.JTextField();
        item6 = new javax.swing.JTextField();
        item7 = new javax.swing.JTextField();
        item8 = new javax.swing.JTextField();
        item9 = new javax.swing.JTextField();
        item10 = new javax.swing.JTextField();
        amount6 = new javax.swing.JTextField();
        amount7 = new javax.swing.JTextField();
        amount8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        cost = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        entre = new javax.swing.JRadioButton();
        side = new javax.swing.JRadioButton();
        desert = new javax.swing.JRadioButton();
        drink = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4ActionPerformed(evt);
            }
        });

        amount4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount4ActionPerformed(evt);
            }
        });

        item10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item10ActionPerformed(evt);
            }
        });

        jLabel1.setText("Items");

        jLabel2.setText("Items");

        jLabel3.setText("Amount");

        jLabel4.setText("Amount");

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        jLabel5.setText("Cost");

        jLabel6.setText("Price");

        jLabel7.setText("Name");

        jLabel8.setText("Type");

        entre.setText("Entree");
        entre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreActionPerformed(evt);
            }
        });

        side.setText("Side");

        desert.setText("Dessert");

        drink.setText("Drink");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(amount4)
                                    .addComponent(amount1)
                                    .addComponent(amount2)
                                    .addComponent(amount3)
                                    .addComponent(amount5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(item10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amount9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(amount6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(amount7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(amount8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(amount10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cost)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(184, 184, 184)
                        .addComponent(enter)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1))
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(entre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(side)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(desert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(drink))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(104, 104, 104)
                                .addComponent(jLabel2)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel4)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(entre)
                    .addComponent(side)
                    .addComponent(desert)
                    .addComponent(drink))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(amount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(amount7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(amount8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(amount9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(amount10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(item9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(item10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(amount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(amount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(amount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(amount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(enter))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        dispose();
        Menu s = new Menu();
                        
        s.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item4ActionPerformed

    private void amount4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount4ActionPerformed

    private void item10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item10ActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:
        String name1 = name.getText();
        int type1=0;
        if(entre.isSelected()){
            type1=1;
        }
        if(side.isSelected()){
            type1=2;
        }
        if(desert.isSelected()){
            type1=3;
        }
        if(drink.isSelected()){
            type1=4;
        }
        Double a1=0.0;
        if(amount1.getText().equals("")==false){
        if(Double.parseDouble(amount1.getText())>0 && amount1.getText()!=null){
           a1 =  Double.parseDouble(amount1.getText());
        }
        }
        Double a2=0.0;
        if(amount2.getText().equals("")==false){
        if(Double.parseDouble(amount2.getText())>0 && amount2.getText()!=null){
           a2 =  Double.parseDouble(amount2.getText());
        }
        }
        Double a3=0.0;
        if(amount3.getText().equals("")==false){
        if(Double.parseDouble(amount3.getText())>0 && amount3.getText()!=null){
           a3 =  Double.parseDouble(amount3.getText());
        }
        }
        Double a4=0.0;
        if(amount4.getText().equals("")==false){
        if(Double.parseDouble(amount4.getText())>0 && amount4.getText()!=null){
           a4 =  Double.parseDouble(amount4.getText());
        }
        }
        Double a5=0.0;
        if(amount5.getText().equals("")==false){
        if(Double.parseDouble(amount5.getText())>0 && amount5.getText()!=null){
           a5 =  Double.parseDouble(amount5.getText());
        }
        }
        Double a6=0.0;
        if(amount6.getText().equals("")==false){
        if(Double.parseDouble(amount6.getText())>0 && amount6.getText()!=null){
           a6 =  Double.parseDouble(amount6.getText());
        }
        }
        Double a7=0.0;
        if(amount7.getText().equals("")==false){
        if(Double.parseDouble(amount7.getText())>0 && amount7.getText()!=null){
           a7 =  Double.parseDouble(amount7.getText());
        }
        }
        Double a8=0.0;
        if(amount8.getText().equals("")==false){
        if(Double.parseDouble(amount8.getText())>0 && amount8.getText()!=null){
           a8 =  Double.parseDouble(amount8.getText());
        }
        }
        Double a9=0.0;
        if(amount9.getText().equals("")==false){
        if(Double.parseDouble(amount9.getText())>0 && amount9.getText()!=null){
           a9 =  Double.parseDouble(amount9.getText());
        }
        }
        Double a10=0.0;
        if(amount10.getText().equals("")==false){
        if(Double.parseDouble(amount10.getText())>0 && amount10.getText()!=null){
           a10 =  Double.parseDouble(amount10.getText());
        }
        }
        String i1 = item1.getText();
        String i2 = item2.getText();
        String i3 = item3.getText();
        String i4 = item4.getText();
        String i5 = item5.getText();
        String i6 = item6.getText();
        String i7 = item7.getText();
        String i8 = item8.getText();
        String i9 = item9.getText();
        String i10 = item10.getText();
        Double cst= 0.0;
        if(cost.getText()!=null){
            cst =  Double.parseDouble(cost.getText());
        }
        Double prc= 0.0;
        if(price.getText()!=null){
            prc =  Double.parseDouble(price.getText());
        }
        c = KitchenCodersRMS.callDatbase();
        String sql = "INSERT INTO MenuItem (name,type,cost,price,item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,amount1,amount2,amount3,amount4,amount5,amount6,amount7,amount8,amount9,amount10) "
                        +"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, name1);
            ps.setInt(2, type1);
            ps.setDouble(3, cst);
            ps.setDouble(4, prc);
            ps.setString(5, i1);
            ps.setString(6, i2);
            ps.setString(7, i3);
            ps.setString(8, i4);
            ps.setString(9, i5);
            ps.setString(10, i6);
            ps.setString(11, i7);
            ps.setString(12, i8);
            ps.setString(13, i9);
            ps.setString(14, i10);
            ps.setDouble(15, a1);
            ps.setDouble(16, a2);
            ps.setDouble(17, a3);
            ps.setDouble(18, a4);
            ps.setDouble(19, a5);
            ps.setDouble(20, a6);
            ps.setDouble(21, a7);
            ps.setDouble(22, a8);
            ps.setDouble(23, a9);
            ps.setDouble(24, a10);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        Menu s = new Menu();
                        
        s.setVisible(true);
    }//GEN-LAST:event_enterActionPerformed

    private void entreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entreActionPerformed

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
            java.util.logging.Logger.getLogger(NewMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMenuItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField amount1;
    private javax.swing.JTextField amount10;
    private javax.swing.JTextField amount2;
    private javax.swing.JTextField amount3;
    private javax.swing.JTextField amount4;
    private javax.swing.JTextField amount5;
    private javax.swing.JTextField amount6;
    private javax.swing.JTextField amount7;
    private javax.swing.JTextField amount8;
    private javax.swing.JTextField amount9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cost;
    private javax.swing.JRadioButton desert;
    private javax.swing.JRadioButton drink;
    private javax.swing.JButton enter;
    private javax.swing.JRadioButton entre;
    private javax.swing.JTextField item1;
    private javax.swing.JTextField item10;
    private javax.swing.JTextField item2;
    private javax.swing.JTextField item3;
    private javax.swing.JTextField item4;
    private javax.swing.JTextField item5;
    private javax.swing.JTextField item6;
    private javax.swing.JTextField item7;
    private javax.swing.JTextField item8;
    private javax.swing.JTextField item9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JRadioButton side;
    // End of variables declaration//GEN-END:variables
}
