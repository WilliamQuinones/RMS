/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitchencodersrms;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Dan
 */
public class FOHscheduleNextWeek extends javax.swing.JFrame {
    Statement stmt = null;
    Connection c = null;
    ResultSet rs;
    String name, sundayAM = " ", sundayPM = " ", mondayAM = " ", mondayPM = " ", tuesdayAM = " ", tuesdayPM = " ", wednesdayAM = " ",
                    wednesdayPM = " ", thursdayAM = " ", thursdayPM = " ", fridayAM = " ", fridayPM = " ", saturdayAM = " ",
                    saturdayPM = " ", jobtitle1 = " ", jobtitle2 = " ", jobtitle3 = " ", phone;
    int sunday, monday, tuesday, wednesday, thursday, friday, saturday;
    boolean isSchedulePopulatedThisWeek = false, isNextWeekUpdated = false;
    int j;
    
    /**
     * Creates new form FOHscheduleNextWeek
     */
    public FOHscheduleNextWeek() {
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

        jLabel1 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fohScheduleTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1270, 781));
        setSize(new java.awt.Dimension(1270, 781));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("FOH Schedule for next week");

        submitButton.setText("Save Changes");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        fohScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new String [][] {
                {"Date", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Server", null, "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM"},
                {"SA", null, "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM"},
                {"Host", null, "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM"},
                {"Bar", null, "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM", "AM", "PM"}
            },
            new String [] {
                "Name", "Phone", "Sunday", "", "Monday", "", "Tuesday", "", "Wednesday", "", "Thursday", "", "Friday", "", "Saturday", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

        });
        fohScheduleTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(fohScheduleTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1243, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:

        String rowValue;
        DefaultTableModel model = (DefaultTableModel) fohScheduleTable.getModel();
        int nRow = model.getRowCount(), nCol = model.getColumnCount();
        for(int i = 2; i <= nRow - 1; i++){
            rowValue = model.getValueAt(i, 0).toString();
            if(!rowValue.equals("Date") || !rowValue.equals("Server") || !rowValue.equals("Host") ||
                !rowValue.equals("Bar") || !rowValue.equals("SA")){
                name  = model.getValueAt(i, 0).toString();
                sundayAM = model.getValueAt(i, 2).toString();
                sundayPM = model.getValueAt(i, 3).toString();
                mondayAM = model.getValueAt(i, 4).toString();
                mondayPM = model.getValueAt(i, 5).toString();
                tuesdayAM = model.getValueAt(i, 6).toString();
                tuesdayPM = model.getValueAt(i, 7).toString();
                wednesdayAM = model.getValueAt(i, 8).toString();
                wednesdayPM = model.getValueAt(i, 9).toString();
                thursdayAM = model.getValueAt(i, 10).toString();
                thursdayPM = model.getValueAt(i, 11).toString();
                fridayAM = model.getValueAt(i, 12).toString();
                fridayPM = model.getValueAt(i, 13).toString();
                saturdayAM = model.getValueAt(i, 14).toString();
                saturdayPM = model.getValueAt(i, 15).toString();
                try{
                    stmt = c.createStatement();
                    String sql = "UPDATE ScheduleNext SET sundayam ='" + sundayAM + "', sundaypm='" + sundayPM +
                    "', mondayam='" + mondayAM + "', mondaypm='" + mondayPM + "', tuesdayam='" + tuesdayAM +
                    "', tuesdaypm='" + tuesdayPM + "', wednesdayam='" + wednesdayAM + "', wednesdaypm='" + wednesdayPM +
                    "', thursdayam='" + thursdayAM + "', thursdaypm='" + thursdayPM + "', fridayam='" + fridayAM + "', fridaypm='" +
                    fridayPM + "', saturdayam='" + saturdayAM + "', saturdaypm='" + saturdayPM + "', hasbeenupdated='" + "yes" +
                    "' WHERE name='" + name + "';";
                    stmt.executeUpdate(sql);
                    c.commit();

                }catch(SQLException ex){Logger.getLogger(FOHschedule.class.getName()).log(Level.SEVERE, null, ex);}

            }

        }
        int input = JOptionPane.showOptionDialog(null, "Schedule updated", "Success", JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE, null, null, null);

    }//GEN-LAST:event_submitButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
               
        String temp = "";
        String rowValue;
        Calendar cal = Calendar.getInstance();
        int dayCounter = 0;
       
        //set up table style
        MyTableCellRenderer rando = new MyTableCellRenderer();
        fohScheduleTable.setDefaultRenderer(String.class, rando);
        for(int i = 0; i < fohScheduleTable.getColumnCount(); i++){
            fohScheduleTable.getColumnModel().getColumn(i).setCellRenderer(rando);           
        }      
        DefaultTableModel model = (DefaultTableModel) fohScheduleTable.getModel();
        int nRow = model.getRowCount(), nCol = model.getColumnCount();
        for(int i = 2; i < nCol; i++){ 
            if(i%2==0){
                model.setValueAt((cal.get(Calendar.MONTH) + 1 + "/" + (cal.get(Calendar.DAY_OF_MONTH) + 8 + dayCounter)), 0, i);
               dayCounter++;
            }
               
        }
        //set checks to update table
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:RMS.db");
            c.setAutoCommit(false);
        }catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
        }
        

        try{
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT hasbeenupdated FROM ScheduleNext");
            ArrayList<String> hasBeenUpdateList = new ArrayList<String>();
            while(rs.next()){          
                hasBeenUpdateList.add(rs.getString("hasbeenupdated"));        
                temp = rs.getString("hasbeenupdated");
            }
            if(!hasBeenUpdateList.isEmpty()){
                
                if(temp.equals("yes")){ //check if next week's schedule is updated and ready
                    isNextWeekUpdated = true;
                }
            }
rs.close();
        }catch(Exception e){}
        
        //set up schedule tables based on states from checks
        
        if(isNextWeekUpdated == false){
            try{
                stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM Employee WHERE FOH=1");
                while(rs.next()){          
                    name = rs.getString("firstname");
                    name += " " + rs.getString("lastname");
                    jobtitle1 = rs.getString("jobtitle1");
                    jobtitle2 = rs.getString("jobtitle2");
                    jobtitle3 = rs.getString("jobtitle3");
                    phone = rs.getString("phonenumber");

                    for(int i = 0; i < nRow; i++){
                        rowValue = model.getValueAt(i, 0).toString();

                        if(rowValue.equals(jobtitle1)){      
                            model.insertRow(i+1,new String[]{name, phone, " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "});
                            nRow = model.getRowCount();
                        }
                        if(rowValue.equals(jobtitle2)){      
                            model.insertRow(i+1,new String[]{name, phone, " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "});
                            nRow = model.getRowCount();
                        }
                        if(rowValue.equals(jobtitle3)){      
                            model.insertRow(i+1,new String[]{name, phone, " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "});
                            nRow = model.getRowCount();
                        }
                    }
                    
                    try{
                    stmt = c.createStatement();
                    String sql = "INSERT INTO ScheduleNext(name,phonenumber,jobtitle1,jobtitle2,jobtitle3)"+
                            "VALUES('" + name + "', '" + phone + "', '" + jobtitle1 + "', '" + jobtitle2 + "', '" + jobtitle3 + "')";
                    stmt.executeUpdate(sql);
                }catch(SQLException ex){Logger.getLogger(FOHschedule.class.getName()).log(Level.SEVERE, null, ex);}
                }
                //c.close();
                rs.close();
            }catch(SQLException ex){Logger.getLogger(FOHschedule.class.getName()).log(Level.SEVERE, null, ex);}
        }else if(isNextWeekUpdated == true){
            nRow = model.getRowCount();
            try{
                stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM ScheduleNext");
                while(rs.next()){          
                    name = rs.getString("name");
                    jobtitle1 = rs.getString("jobtitle1");
                    jobtitle2 = rs.getString("jobtitle2");
                    jobtitle3 = rs.getString("jobtitle3");
                    phone = rs.getString("phonenumber");

                         sundayAM = rs.getString("sundayam");
                         sundayPM = rs.getString("sundaypm");
                         mondayAM = rs.getString("mondayam");
                         mondayPM = rs.getString("mondaypm");
                         tuesdayAM = rs.getString("tuesdayam");
                         tuesdayPM = rs.getString("tuesdaypm");
                         wednesdayAM = rs.getString("wednesdayam");
                         wednesdayPM = rs.getString("wednesdaypm");
                         thursdayAM = rs.getString("thursdayam");
                         thursdayPM = rs.getString("thursdaypm");
                         fridayAM = rs.getString("fridayam");
                         fridayPM = rs.getString("fridaypm");
                         saturdayAM = rs.getString("saturdayam");
                         saturdayPM = rs.getString("saturdaypm");

                 

                    for(int i = 0; i < nRow; i++){
                        rowValue = model.getValueAt(i, 0).toString();

                        if(rowValue.equals("Server")){     
                            if(jobtitle1.equals("Server") || jobtitle2.equals("Server") || jobtitle3.equals("Server")){
                                model.insertRow(i+1,new String[]{name, phone, sundayAM, sundayPM, mondayAM, mondayPM, tuesdayAM, tuesdayPM, wednesdayAM, wednesdayPM,
                                    thursdayAM, thursdayPM, fridayAM, fridayPM, saturdayAM, saturdayPM});
                                nRow = model.getRowCount();
                            }
                            
                        }
                        if(rowValue.equals("Host")){      
                            if(jobtitle1.equals("Host") || jobtitle2.equals("Host") || jobtitle3.equals("Host")){
                                model.insertRow(i+1,new String[]{name, phone, sundayAM, sundayPM, mondayAM, mondayPM, tuesdayAM, tuesdayPM, wednesdayAM, wednesdayPM,
                                    thursdayAM, thursdayPM, fridayAM, fridayPM, saturdayAM, saturdayPM});
                                nRow = model.getRowCount();
                            }
                        }
                        if(rowValue.equals("SA")){      
                            if(jobtitle1.equals("SA") || jobtitle2.equals("SA") || jobtitle3.equals("SA")){
                                model.insertRow(i+1,new String[]{name, phone, sundayAM, sundayPM, mondayAM, mondayPM, tuesdayAM, tuesdayPM, wednesdayAM, wednesdayPM,
                                    thursdayAM, thursdayPM, fridayAM, fridayPM, saturdayAM, saturdayPM});
                                nRow = model.getRowCount();
                            }
                        }if(rowValue.equals("Bar")){      
                            if(jobtitle1.equals("Bar") || jobtitle2.equals("Bar") || jobtitle3.equals("Bar")){
                                model.insertRow(i+1,new String[]{name, phone, sundayAM, sundayPM, mondayAM, mondayPM, tuesdayAM, tuesdayPM, wednesdayAM, wednesdayPM,
                                    thursdayAM, thursdayPM, fridayAM, fridayPM, saturdayAM, saturdayPM});
                                nRow = model.getRowCount();
                            }
                        }
                    }

                }
                //c.close();
                rs.close();
            }catch(SQLException ex){Logger.getLogger(FOHschedule.class.getName()).log(Level.SEVERE, null, ex);}
            
        }
        
        


        resizeColumnWidth(fohScheduleTable);

        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try{
            c.close();
        }   catch(Exception e){
            
        }   
        dispose();
       
        FOHschedule s = new FOHschedule();                  
                        s.setVisible(true);  
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FOHscheduleNextWeek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FOHscheduleNextWeek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FOHscheduleNextWeek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FOHscheduleNextWeek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FOHscheduleNextWeek().setVisible(true);
            }
        });
    }

        public void resizeColumnWidth(JTable table) {
    final TableColumnModel columnModel = table.getColumnModel();
    for (int column = 0; column <= 1; column++) {
        int width = 15; // Min width
        for (int row = 0; row < table.getRowCount(); row++) {
            TableCellRenderer renderer = table.getCellRenderer(row, column);
            Component comp = table.prepareRenderer(renderer, row, column);
            width = Math.max(comp.getPreferredSize().width +1 , width);
        }
        if(width > 300)
            width=300;
        columnModel.getColumn(column).setPreferredWidth(width);
    }
}
    
    public class MyTableCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                   boolean hasFocus, int row, int column){
        Component comp = super.getTableCellRendererComponent(
                      table,  value, isSelected, hasFocus, row, column);
 
        String s =  table.getModel().getValueAt(row, 0).toString();

        if(s.equals("Server")) 
        {
            comp.setBackground(Color.YELLOW);
            comp.setForeground(Color.BLACK);
        }
        else if(s.equals("SA")) 
        {
            comp.setBackground(Color.CYAN);
            comp.setForeground(Color.BLACK);
        }else if(s.equals("Host")) 
        {
            comp.setBackground(Color.ORANGE);
            comp.setForeground(Color.BLACK);
        }else if(s.equals("Bar")) 
        {
            comp.setBackground(Color.GREEN);
            comp.setForeground(Color.BLACK);
        }else{
            comp.setBackground(null);
            comp.setForeground(Color.BLACK);
        }

        return( comp );
       }
    
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable fohScheduleTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
