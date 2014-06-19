/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Doctor.BD;


import Doctor.BL.Visit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java_med_kyrs.DataBase;

/**
 *
 * @author user
 */
public class ResultMapper {
public static  synchronized boolean putResult(Visit visit){
       try {
			Connection db =	DataBase.getInstance();	
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String sqlDate=dateFormat.format(visit.getDate());                        
                        String statement = "Insert INTO med.resultatosmotra (Polis,DataOsmopra,Galoba,Recomendation)  VALUES ('"+visit.getPolis()+"','"+sqlDate+"','"+visit.getGaloba()+"','"+visit.getRecomm()+"')";
                        Statement dbstatement = db.createStatement();
                      int rs =  dbstatement.executeUpdate(statement);               
			if (rs>0)
                        {
                         return true;   
                        } else return false;
		
			
		} catch (SQLException e) {
			       
		return false;	
		}}
}
