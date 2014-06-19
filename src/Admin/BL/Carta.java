/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin.BL;

import Admin.BD.CartaGetWay;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Carta {
    private String privivka;
    private String unrecommended;
    private String polis;
    private  String idCart;
    public String getPrivivka()
    {
        return privivka;    }
    public  String getPolis()
    {return polis;}
      public  String getId()
    {return idCart;}
     public  String getUnn()
     {return  unrecommended;}

   public void serch (String polis) throws SQLException
   {
       ResultSet rs= CartaGetWay.findByPolis(polis);
         if(rs.next()) 
       {
       privivka=rs.getString(3);
       unrecommended=rs.getString(4); 
       polis=rs.getString(2);
       idCart=rs.getString(1);}
   }
}
