/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Doctor.BD;
import Doctor.BL.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java_med_kyrs.DataBase;
/**
 *
 * @author user
 */
public class PatientMaper {
  
public static synchronized Patient findByPolis(String polis)   {
		try {
			Connection db =	DataBase.getInstance();	
			String statement = "Select Name,Secondname,Surname,Polis,BirthDay,Address,Phone, Gender FROM med.Patient Where Polis =?";
			PreparedStatement dbStatement = db.prepareStatement(statement);
			dbStatement.setString(1, polis);
			ResultSet rs = dbStatement.executeQuery();
			
			while(rs.next()) {
                             String name=rs.getString(1);
                             String secondname=rs.getString(2);
                             String surname=rs.getString(3);
                             polis=rs.getString(4);
                             String birthDay=rs.getString(5);
                             String address=rs.getString(6);
                             String phone=rs.getString(7);
                             Boolean gender=rs.getBoolean(8); 
                             Patient patient = new Patient(name,secondname,surname,polis,birthDay,address,phone,gender);				
                             return patient;
			}
			return null;
			
		} catch (SQLException e) {
			
			return null;
		}
	}
	

}

