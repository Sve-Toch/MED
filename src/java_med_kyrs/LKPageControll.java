/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java_med_kyrs;

/**
 *
 * @author Надежда
 */
public class LKPageControll {
    public static void AdminOpen()
    {        
        Admin.GOF.Admin_search as=new Admin.GOF.Admin_search();
        as.setVisible(true);
    }
    public static void DoctorOpen()
    {
        Admin.GOF.Doctor_search ds = new  Admin.GOF.Doctor_search();
        ds.setVisible(true);
    }
}
