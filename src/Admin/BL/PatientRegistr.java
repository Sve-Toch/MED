/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin.BL;

import Admin.Admin_RegForm;
import Admin.Admin_panel;
import Admin.BD.PatientGetWay;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PatientRegistr {
    public static void setRegistr(Admin_RegForm regForm,String surname,String name,String secondname,boolean gender,String birthDay,String polis,String adress,String phone)
    {
      
        Patient patient = new Patient(surname,name, secondname, gender, birthDay, polis,adress,phone);

        try {
            int res =PatientGetWay.putPatient(patient);
            if (res <=0)
        {JOptionPane.showMessageDialog(new JFrame(), "Вы ввели неверные данные", "Ошибка",JOptionPane.ERROR_MESSAGE);}
            else {regForm.dispose();
            Admin_panel ar=new Admin_panel(); ar.setVisible(true);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(new JFrame(), "Вы ввели неверные данные", "Ошибка",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
