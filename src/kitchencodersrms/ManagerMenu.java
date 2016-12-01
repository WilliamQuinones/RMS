/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitchencodersrms;

/**
 *
 * @author williammcclain
 */
public class ManagerMenu extends javax.swing.JFrame {

    /**
     * Creates new form ManagerMenu
     */
    public ManagerMenu() {
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

        employeesButton = new javax.swing.JButton();
        SchedulingButton = new javax.swing.JButton();
        inventoryButton = new javax.swing.JButton();
        analyticsButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        back = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        employeesButton.setText("Employees");
        employeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesButtonActionPerformed(evt);
            }
        });

        SchedulingButton.setText("Scheduling");
        SchedulingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchedulingButtonActionPerformed(evt);
            }
        });

        inventoryButton.setText("Inventory");
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });

        analyticsButton.setText("Analytics");
        analyticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyticsButtonActionPerformed(evt);
            }
        });

        menuButton.setText("Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        admin.setText("Add Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Next week's schedule hasn't been set yet!");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Reminders:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(employeesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SchedulingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventoryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(analyticsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(employeesButton)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SchedulingButton)
                        .addGap(26, 26, 26)
                        .addComponent(inventoryButton)
                        .addGap(30, 30, 30)
                        .addComponent(analyticsButton)
                        .addGap(26, 26, 26)
                        .addComponent(menuButton)
                        .addGap(28, 28, 28)
                        .addComponent(admin))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        Login s = new Login();
                        
        s.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        dispose();
        NewAdmin s = new NewAdmin();
                        
        s.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed

    private void SchedulingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchedulingButtonActionPerformed
        dispose();
        Schedule s = new Schedule();
                        
        s.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_SchedulingButtonActionPerformed

    private void analyticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyticsButtonActionPerformed
        dispose();
        Analytics s = new Analytics();
                        
        s.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_analyticsButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        dispose();
        Menu s = new Menu();
                        
        s.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_menuButtonActionPerformed

    private void employeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesButtonActionPerformed
        dispose();
        Employees s = new Employees();
                        
        s.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_employeesButtonActionPerformed

    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed
        dispose();
        Inventory s = new Inventory();
                        
        s.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoryButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SchedulingButton;
    private javax.swing.JButton admin;
    private javax.swing.JButton analyticsButton;
    private javax.swing.JButton back;
    private javax.swing.JButton employeesButton;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton menuButton;
    // End of variables declaration//GEN-END:variables
}
