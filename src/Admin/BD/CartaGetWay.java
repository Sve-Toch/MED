/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin.BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_med_kyrs.DataBase;

/**
 *
 * @author user
 */
public class CartaGetWay {
      public static  ResultSet findByPolis(String polis) throws SQLException
    {

        Connection conn=  DataBase.getInstance();
      
      
       Statement st =conn.createStatement();
      String query = "Select idCarta,Polis,Privivki,Unrecomend FROM med.carta Where Polis =\""+polis+"\"";

      ResultSet rs = st.executeQuery(query);
       
        return   rs;
    }
}
