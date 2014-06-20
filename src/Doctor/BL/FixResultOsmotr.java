/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Doctor.BL;

import Doctor.BD.PatientMaper;
import Doctor.BD.ResultMapper;
import Doctor.Doctor_fix;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sveta
 */
public class FixResultOsmotr {
    public static boolean fixation()
            { return true;
            }
     public static boolean putResult(String galoba, String recomm, Patient patient)
     {
        Visit visit = new Visit(); 
        visit.setPolis(patient.getPolis());
        visit.setGaloba(galoba);
        visit.setRecomm(recomm);
        Date date= new Date();
        visit.setDate(date);
        if(ResultMapper.putResult(visit))
        {
           return true;
        } else {return false;
        }
     }
}
