/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java_med_kyrs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DataBase {
    private static  DataBase dataBase;  
    private static Connection conn; 
    private DataBase ()
    {      
        String driver ="com.mysql.jdbc.Driver";
        try {
            Class.forName(driver).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.err.println("Error of DB Driver" );
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/med", "root", "");
        }catch (SQLException e) {
            System.err.println("Error DB connect" );
        } 
    }
    public static synchronized Connection getInstance() {
        if (dataBase == null) {
            dataBase = new DataBase();
        }
        return conn;
    }

}
