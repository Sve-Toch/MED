/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin.BD;
import Admin.BL.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_med_kyrs.DataBase;
/**
 *
 * @author user
 */
public class PatientGetWay {

   
    
    public static  ResultSet findByPolis(String polis) throws SQLException
    {

        Connection conn=  DataBase.getInstance();
      
       //String query = "Select Name,Secondname,Surname,Polis,BirthDay,Address,Phone, Gender FROM med.Patient Where Polis = ?";
      // PreparedStatement st= conn.prepareStatement(query);
       //st.setString(1, polis);
       Statement st =conn.createStatement();
      String query = "Select Name,Secondname,Surname,Polis,BirthDay,Address,Phone, Gender FROM med.Patient Where Polis =\""+polis+"\"";

      ResultSet rs = st.executeQuery(query);
       
        return   rs;
    }
    public static int putPatient(Patient patient) throws SQLException
    {
         Connection conn=  DataBase.getInstance();
         Statement st =conn.createStatement();
         String statement = "Insert INTO med.Patient (Name,Secondname,Surname,Polis,BirthDay,Address,Phone, Gender)  VALUES ('"+patient.getName()+"','"+patient.getSecondName()+"','"+patient.getSurname()+"','"+patient.getPolis()+"','"+patient.getBirthDay()+"','"+patient.getAddress()+"','"+patient.getPhone()+"','"+patient.getGender()+"')";
        int rs=st.executeUpdate(statement);
        return rs;
    }
    
}
