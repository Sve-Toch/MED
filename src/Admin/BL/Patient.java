/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin.BL;
import Admin.BD.PatientGetWay;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author user
 */
public class Patient {
   
    private static String name;
    private static String secondname;
    private static String surname;
    private static String polis;
    private static String birthDay;
    private static String address;
    private static String phone;
    private static boolean gender;
    public static String getName()
    {return name;}
    public static String getSecondName()
    {return secondname;}
    public static String getSurname()
    {return surname;}
     public static String getPolis()
    {return polis;}
      public static String getBirthDay()
    {return birthDay;}
       public static String getAddress()
    {return address;}
        public static String getPhone()
    {return phone;}
         public static String getGender()
    {if (gender==true)
    {return "Male";}
    else {return "Famale";}
    }

    public Patient(String surname,String name,String secondname,boolean gender,String birthDay,String polis,String address,String phone) {
    this.name=name;
    this.surname=surname;
    this.secondname=secondname;
    this.gender=gender;
    this.birthDay=birthDay;
    this.polis=polis;
    this.address=address;
    this.phone=phone;
    }
    
    public static boolean search(String polisn)
    {
        if (polisn.length()==16)
        {
            try {
                ResultSet rs= PatientGetWay.findByPolis(polisn);
                if(rs.next()) 
       {
                name=rs.getString(1);
                secondname=rs.getString(2); 
                surname=rs.getString(3);
                polis=rs.getString(4);
                birthDay=rs.getString(5);
                address=rs.getString(6);
                phone=rs.getString(7);
                gender=rs.getBoolean(8); 
                if (rs.next()) {return false;}
                else return true;
       } else return false;
            } catch (SQLException ex) {
                return false;
            }
              
        }
        return false;
    }
}
