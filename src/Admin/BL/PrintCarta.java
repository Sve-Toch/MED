/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin.BL;
import  Admin.BL.Patient;
import  Admin.BD.CartaGetWay;
import Admin.PrintForm;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class PrintCarta {
   public static Admin.Admin_panel ap;
   public static Admin.Admin_panel  getApp()
   {
   return ap;}
   public static void print(Admin.Admin_panel app) throws SQLException
   { ap=app;
      Carta carta= new Carta();
      carta.serch(Patient.getPolis());
       String text ="Медицинская карта амбулаторного больного\n"+
               "Номер:"+ carta.getId()+"\n"+
               Patient.getSurname() +" "+Patient.getName()+" "+Patient.getSecondName()+"\n"+
               "Номер полиса: "+Patient.getPolis()+"\n"+
               "Пол:"+Patient.getGender()+"\n"+
               "Дата рождения: "+Patient.getBirthDay()+"\n"+
               "Адресс: "+Patient.getAddress()+"\n"+
               "Телефон: "+Patient.getPhone()+"\n"+
               "Пациенту были сделаны следующие прививки: "+"\n"+
               carta.getPrivivka()+"\n"+
               "Противопоказания:"+"\n"+
               carta.getUnn();
       PrintForm pr = new PrintForm();
       pr.putPrint(text);
       pr.setVisible(true);
       
               
               
               
     }
}
