/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Doctor.BL;
/**
 *
 * @author user
 */
public class Patient {
     private  String name;
    private  String secondname;
    private  String surname;
    private  String polis;
    private  String birthDay;
    private  String address;
    private  String phone;
    private  boolean gender;
    public Patient (String name, String secondname,String surname, String polis,String birthDay, String address,String phone, boolean gender )
    {
        this.name=name;
        this.secondname=secondname;
        this.surname=surname;
        this.polis=polis;
        this.birthDay=birthDay;
        this.address=address;
        this.phone=phone;
        this.gender=gender;
    }
    public  String getName()
    {return name;}
    public  String getSecondName()
    {return secondname;}
    public  String getSurname()
    {return surname;}
    public  String getPolis()
    {return polis;}
    public  String getBirthDay()
    {return birthDay;}
    public  String getAddress()
    {return address;}
    public  String getPhone()
    {return phone;}
    public  String getGender()
    {if (gender==true)
    {return "Male";}
    else {return "Famale";}
    }  
}
