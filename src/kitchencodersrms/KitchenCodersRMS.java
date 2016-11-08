/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitchencodersrms;

import java.awt.List;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author williammcclain
 */
public class KitchenCodersRMS {
  
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        
        
     //Create or check for database   
    Connection c = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:RMS.db");
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
    
    
    //Create or check for Login table in database if it does not exist
    
        // SQL statement to create a Login table
        String sql = "CREATE TABLE IF NOT EXISTS Login (\n"+
                " id integer PRIMARY KEY AUTOINCREMENT,\n"+
                " username text NOT NULL,\n"+
                " password text NOT NULL,\n"+
                " manager integer\n"+
                ");";
        try {
            
           
            
            Statement stmt = c.createStatement();
            stmt.execute(sql);
            System.out.println("Added Login Table");
            
            //Checking to see if there are values in the Login table
            ResultSet rs = stmt.executeQuery("SELECT username FROM Login");
            ArrayList<String> UserNames = new ArrayList<String>();
            
            while(rs.next()){
                UserNames.add(rs.getString("username"));
            }
            
            //If there are no values in the table creates an admin user
            
            if (UserNames.size() == 0){
                
                sql = "INSERT INTO Login (id,username,password,manager) "
                        +"VALUES (1, 'admin', 'admin', 1)";
                stmt.execute(sql);
                System.out.println("Added admin");
                
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(KitchenCodersRMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Same for Inventory Table
        //intem type use switch case to determine type
        
        sql = "CREATE TABLE IF NOT EXISTS Inventory (\n"+
                " id integer PRIMARY KEY AUTOINCREMENT,\n"+
                " itemname text NOT NULL,\n"+
                " itemtype integer,\n"+
                " itemamount integer,\n"+
                " criticalamount integer,\n"+
                " criticaltime integer,\n"+
                " shipment1 integer,\n"+
                " shipment2 integer,\n"+
                " shipment3 integer,\n"+
                " shipment4 integer,\n"+
                " shipment5 integer,\n"+
                " s1critical integer,\n"+
                " s2critical integer,\n"+
                " s3critical integer,\n"+
                " s4critical integer,\n"+
                " s5critical integer,\n"+
                " s1amount integer,\n"+
                " s2amount integer,\n"+
                " s3amount integer,\n"+
                " s4amount integer,\n"+
                " s5amount integer\n"+
                ");";
        try {
            
           
            
            Statement stmt = c.createStatement();
            stmt.execute(sql);
            System.out.println("Added Inventory Table");
            
        
        } catch (SQLException ex) {
            Logger.getLogger(KitchenCodersRMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //create MenuItem table
        //cost is amount it costs to make, price is the amount it is sold for
        //type insteger for entree desert drink
        sql = "CREATE TABLE IF NOT EXISTS MenuItem (\n"+
                " id integer PRIMARY KEY AUTOINCREMENT,\n"+
                " name text NOT NULL,\n"+
                " type integer,\n"+
                " cost real,\n"+
                " price real,\n"+
                " item1 text,\n"+
                " item2 text,\n"+
                " item3 text,\n"+
                " item4 text,\n"+
                " item5 text,\n"+
                " item6 text,\n"+
                " item7 text,\n"+
                " item8 text,\n"+
                " item9 text,\n"+
                " item10 text,\n"+
                " amount1 real,\n"+
                " amount2 real,\n"+
                " amount3 real,\n"+
                " amount4 real,\n"+
                " amount5 real,\n"+
                " amount6 real,\n"+
                " amount7 real,\n"+
                " amount8 real,\n"+
                " amount9 real,\n"+
                " amount10 real\n"+
                ");";
        try {
            
           
            
            Statement stmt = c.createStatement();
            stmt.execute(sql);
            System.out.println("Added Inventory Table");
            
        
        } catch (SQLException ex) {
            Logger.getLogger(KitchenCodersRMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Employee database
        // days of week 0= not available 1= shift 1 2= shift 2 3= both
        
                sql = "CREATE TABLE IF NOT EXISTS Employee (\n"+
                " id integer PRIMARY KEY AUTOINCREMENT,\n"+
                " firstname text NOT NULL,\n"+
                " middlename text,\n"+
                " lastname text NOT NULL,\n"+
                " jobtitle text,\n"+
                " phonenumber text,\n"+
                " street text,\n"+
                " city text,\n"+
                " state text,\n"+
                " zipcode text,\n"+
                " employeeid integer,\n"+
                " monday integer,\n"+
                " tuesday integer,\n"+
                " wednesday integer,\n"+
                " thursday integer,\n"+
                " friday integer,\n"+
                " saturday integer,\n"+
                " sunday integer,\n"+
                " hourlywage real,\n"+
                " hoursworked integer,\n"+
                " tips real,\n"+
                " socialsecurity text\n"+
                ");";
        try {
            
           
            
            Statement stmt = c.createStatement();
            stmt.execute(sql);
            System.out.println("Added Employee Table");
            
        
        } catch (SQLException ex) {
            Logger.getLogger(KitchenCodersRMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Create Tickets table
        //Open used like a boolean
        
        sql = "CREATE TABLE IF NOT EXISTS Tickets (\n"+
                " id integer PRIMARY KEY AUTOINCREMENT,\n"+
                " server text NOT NULL,\n"+
                " item1 text,\n"+
                " item2 text,\n"+
                " item3 text,\n"+
                " item4 text,\n"+
                " item5 text,\n"+
                " time integer,\n"+
                " tip real,\n"+
                " discount real,\n"+
                " tax real,\n"+
                " taxamount real,\n"+
                " total real,\n"+ 
                " open integer\n"+
                ");";
        try {
            
           
            
            Statement stmt = c.createStatement();
            stmt.execute(sql);
            System.out.println("Added Inventory Table");
            
        
        } catch (SQLException ex) {
            Logger.getLogger(KitchenCodersRMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Create Timeclock table
        
        sql = "CREATE TABLE IF NOT EXISTS TimeClock (\n"+
                " id integer PRIMARY KEY AUTOINCREMENT,\n"+
                " employee text NOT NULL,\n"+
                " clockin integer,\n"+
                " clockout integer\n"+
                        
                ");";
        try {
            
           
            
            Statement stmt = c.createStatement();
            stmt.execute(sql);
            System.out.println("Added Inventory Table");
            
        
        } catch (SQLException ex) {
            Logger.getLogger(KitchenCodersRMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Create Sales table
        // shif integer value 1 shift one, 2 shift 2
        
        sql = "CREATE TABLE IF NOT EXISTS Sales (\n"+
                " id integer PRIMARY KEY AUTOINCREMENT,\n"+
                " server text NOT NULL,\n"+
                " ticket integer,\n"+
                " item1 text,\n"+
                " item2 text,\n"+
                " item3 text,\n"+
                " item4 text,\n"+
                " item5 text,\n"+
                " time integer,\n"+
                " tip real,\n"+
                " discount real,\n"+
                " tax real,\n"+
                " taxamount real,\n"+
                " total real,\n"+ 
                " profit real,\n"+
                " day text,\n"+
                " shift integer\n"+
                ");";
        try {
            
           
            
            Statement stmt = c.createStatement();
            stmt.execute(sql);
            System.out.println("Added Inventory Table");
            
        
        } catch (SQLException ex) {
            Logger.getLogger(KitchenCodersRMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Display Login Screen
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Login s = new Login();
                s.setVisible(true);
            }
        });
        
        
       
    }
    
    static void callEmployeeScreen(){
       java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                EmployeeLogin s = new EmployeeLogin();
                s.setVisible(true);
            }
        }); 
    }
    static Connection callDatbase(){
        Connection c = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:RMS.db");
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
    return c;
        
    }
    
}

