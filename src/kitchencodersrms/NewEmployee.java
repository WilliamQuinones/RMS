/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitchencodersrms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author williammcclain
 */
public class NewEmployee extends javax.swing.JFrame {

    Statement stmt =null;
    Connection c = null;
    /**
     * Creates new form NewEmployee
     */
    public NewEmployee() {
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

        backButton = new javax.swing.JButton();
        wage1 = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        wage2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        wedLunch = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jobTitle2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        monDinner = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        wage3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        socialSecurity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        middleName = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        zipCode = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tuesdayLunch = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jobTitle = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tuesdayDinner = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        monLunch = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        wedDinner = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        thursLunch = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        thursDinner = new javax.swing.JCheckBox();
        fridayLunch = new javax.swing.JCheckBox();
        fridayDinner = new javax.swing.JCheckBox();
        satLunch = new javax.swing.JCheckBox();
        satDinner = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        sunLunch = new javax.swing.JCheckBox();
        sunDinner = new javax.swing.JCheckBox();
        jobTitle1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addButton.setText("Submit");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel26.setText("Job Title 1");

        jLabel27.setText("Hourly Wage 1");

        jLabel28.setText("Job Title 2");

        jLabel13.setText("Job Title 3");

        jLabel14.setText("Hourly Wage 3");

        jLabel3.setText("Last Name");

        jLabel5.setText("Phone Number");

        jLabel17.setText("Social Security");

        jLabel12.setText("Hourly Wage 2");

        jLabel1.setText("First Name");

        jLabel2.setText("Middle Name");

        jLabel6.setText("Address");

        jLabel10.setText("Wednesday");

        jLabel7.setText("City");

        jLabel8.setText("Zip Code");

        jLabel9.setText("State");

        jLabel15.setText("Thursday");

        jLabel19.setText("Friday");

        jLabel20.setText("Saturday");

        jLabel21.setText("Monday");

        jLabel22.setText("Sunday");

        jLabel23.setText("Tuesday");

        jLabel18.setText("Lunch");

        jLabel24.setText("Dinner");

        jLabel4.setText("Availability");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(zipCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(city, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(middleName)
                                    .addComponent(state)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(socialSecurity)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(wage2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jobTitle2)
                                    .addComponent(wage3)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jobTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(wage1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(wedLunch)
                                    .addComponent(tuesdayLunch)
                                    .addComponent(monLunch)
                                    .addComponent(thursLunch)
                                    .addComponent(fridayLunch)
                                    .addComponent(satLunch)
                                    .addComponent(sunLunch))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sunDinner)
                                    .addComponent(satDinner)
                                    .addComponent(fridayDinner)
                                    .addComponent(thursDinner)
                                    .addComponent(tuesdayDinner)
                                    .addComponent(monDinner)
                                    .addComponent(jLabel24)
                                    .addComponent(wedDinner))
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(121, 121, 121))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(middleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(socialSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jobTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(wage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jobTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(wage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel21)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel23)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(tuesdayLunch))
                                            .addComponent(monLunch))
                                        .addGap(3, 3, 3)
                                        .addComponent(wedLunch)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(thursLunch)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fridayLunch)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(satLunch)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sunLunch))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(monDinner)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tuesdayDinner)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(wedDinner)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(thursDinner)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fridayDinner)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(satDinner)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sunDinner)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        Employees s = new Employees();
        s.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:RMS.db");
        }catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
        }
        try {
            stmt = c.createStatement();

        
        String firstname = firstName.getText();
        String middlename = middleName.getText();
        String lastname = lastName.getText();
        String jobtitle1 = jobTitle.getText();
        String jobtitle2 = jobTitle1.getText();
        String jobtitle3 = jobTitle2.getText();
        String phonenumber = phoneNumber.getText();
        String street = address.getText();
        String cityname = city.getText();
        String statename = state.getText();  
        String zip = zipCode.getText();
        String social = socialSecurity.getText().replaceAll("\\D+","");
        int employeeID = Integer.parseInt(social)%10000;
        String wageTemp = wage1.getText();
        float hourlywage1 = Float.parseFloat(wageTemp);
        wageTemp = wage2.getText();
        float hourlywage2 = Float.parseFloat(wageTemp);
        wageTemp = wage3.getText();
        float hourlywage3 = Float.parseFloat(wageTemp);
        int monday = 0, tuesday = 0, wednesday = 0, thursday = 0,
                friday = 0, saturday = 0, sunday = 0;
        
        
        if(monLunch.isSelected() && monDinner.isSelected()){
            monday = 3;
        }else if(monLunch.isSelected() && !monDinner.isSelected()){
            monday = 1;
        }else if(!monLunch.isSelected() && monDinner.isSelected()){
            monday = 2;
        }else if(!monLunch.isSelected() && !monDinner.isSelected()){
            monday = 0;
        }
        
        if(tuesdayLunch.isSelected() && tuesdayDinner.isSelected()){
            tuesday = 3;
        }else if(tuesdayLunch.isSelected() && !tuesdayDinner.isSelected()){
            tuesday = 1;
        }else if(!tuesdayLunch.isSelected() && tuesdayDinner.isSelected()){
            tuesday = 2;
        }else if(!tuesdayLunch.isSelected() && !tuesdayDinner.isSelected()){
            tuesday = 0;
        }
        
        if(wedLunch.isSelected() && wedDinner.isSelected()){
            wednesday = 3;
        }else if(wedLunch.isSelected() && !wedDinner.isSelected()){
            wednesday = 1;
        }else if(!wedLunch.isSelected() && wedDinner.isSelected()){
            wednesday = 2;
        }else if(!wedLunch.isSelected() && !wedDinner.isSelected()){
            wednesday = 0;
        }
        
        if(thursLunch.isSelected() && thursDinner.isSelected()){
            thursday = 3;
        }else if(thursLunch.isSelected() && !thursDinner.isSelected()){
            thursday = 1;
        }else if(!thursLunch.isSelected() && thursDinner.isSelected()){
            thursday = 2;
        }else if(!thursLunch.isSelected() && !thursDinner.isSelected()){
            thursday = 0;
        }
        
        if(fridayLunch.isSelected() && fridayDinner.isSelected()){
            friday = 3;
        }else if(fridayLunch.isSelected() && !fridayDinner.isSelected()){
            friday = 1;
        }else if(!fridayLunch.isSelected() && fridayDinner.isSelected()){
            friday = 2;
        }else if(!fridayLunch.isSelected() && !fridayDinner.isSelected()){
            friday = 0;
        }
        
        if(satLunch.isSelected() && satDinner.isSelected()){
            saturday = 3;
        }else if(satLunch.isSelected() && !satDinner.isSelected()){
            saturday = 1;
        }else if(!satLunch.isSelected() && satDinner.isSelected()){
            saturday = 2;
        }else if(!satLunch.isSelected() && !satDinner.isSelected()){
            saturday = 0;
        }
        
        if(sunLunch.isSelected() && sunDinner.isSelected()){
            sunday = 3;
        }else if(sunLunch.isSelected() && !sunDinner.isSelected()){
            sunday = 1;
        }else if(!sunLunch.isSelected() && sunDinner.isSelected()){
            sunday = 2;
        }else if(!sunLunch.isSelected() && !sunDinner.isSelected()){
            sunday = 0;
        }
        
        
        
            String sql="INSERT INTO Employee ( firstname, middlename, lastname, "
                    + "jobtitle1, jobtitle2, jobtitle3, phonenumber, street,"
                    + " city, state, zipcode, employeeid, monday, tuesday,"
                    + "wednesday, thursday, friday, saturday, sunday, hourlywage1, "
                    + "hourlywage2, hourlywage3, socialsecurity)"
                     + "VALUES('" + firstname + "', '" + middlename + "', '" + 
                    lastname + "', '" + jobtitle1 + "', '" + jobtitle2 + "', '"
                    + jobtitle3 + "', '" + phonenumber + "', '" + street + 
                    "', '" + cityname + "', '" + statename + "', '" + zip +
                     "', '" + employeeID + "', '" + monday + "', '" + tuesday
                     + "', '" + wednesday + "', '" + thursday + "', '" + friday
                     + "', '" + saturday + "', '" + sunday + "', '" + hourlywage1
                     + "', '" + hourlywage2 + "', '" + hourlywage3 + "', '" + social
                    + "')";
            stmt.executeUpdate(sql);
            
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField address;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField city;
    private javax.swing.JTextField firstName;
    private javax.swing.JCheckBox fridayDinner;
    private javax.swing.JCheckBox fridayLunch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jobTitle;
    private javax.swing.JTextField jobTitle1;
    private javax.swing.JTextField jobTitle2;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField middleName;
    private javax.swing.JCheckBox monDinner;
    private javax.swing.JCheckBox monLunch;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JCheckBox satDinner;
    private javax.swing.JCheckBox satLunch;
    private javax.swing.JTextField socialSecurity;
    private javax.swing.JTextField state;
    private javax.swing.JCheckBox sunDinner;
    private javax.swing.JCheckBox sunLunch;
    private javax.swing.JCheckBox thursDinner;
    private javax.swing.JCheckBox thursLunch;
    private javax.swing.JCheckBox tuesdayDinner;
    private javax.swing.JCheckBox tuesdayLunch;
    private javax.swing.JTextField wage1;
    private javax.swing.JTextField wage2;
    private javax.swing.JTextField wage3;
    private javax.swing.JCheckBox wedDinner;
    private javax.swing.JCheckBox wedLunch;
    private javax.swing.JTextField zipCode;
    // End of variables declaration//GEN-END:variables
}
