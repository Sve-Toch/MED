/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Doctor.BL;
import Doctor.*;
import Doctor.BD.PatientMaper;
import Doctor.BD.ResultMapper;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */

public class ServiceLayer {
    private static Patient patient;
    private static Doctor_FixForm dff;
    private static  Doctor_fix df;  
    public static boolean search(String polis)
    {
       
       patient = PatientMaper.findByPolis(polis);
       if (patient==null)
       {
           JOptionPane.showMessageDialog(new JFrame(), "Такого пациента нет", "Ошибка",JOptionPane.ERROR_MESSAGE);
       return false;
       }else{
       df= new Doctor_fix();
       df.setVisible(true);
       df.putLable(patient.getName()+"  "+patient.getSecondName()+"  "+patient.getSurname());
       return true;
       }
    }
    public static void fix (){
       dff= new Doctor_FixForm();
       dff.setVisible(true);
    }
    public static void putResult(String galoba, String recomm)
    {
        if (!galoba.isEmpty()&&!recomm.isEmpty()){
        Visit visit = new Visit(); 
        visit.setPolis(patient.getPolis());
        visit.setGaloba(galoba);
        visit.setRecomm(recomm);
        Date date= new Date();
        visit.setDate(date);
        if(ResultMapper.putResult(visit))
        {
            dff.setVisible(false);           
            df.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Ошибка","Ошибка", JOptionPane.ERROR_MESSAGE);
        }
        }
    else {
            JOptionPane.showMessageDialog(new JFrame(), "Вы не заполнили все поля","Ошибка.", JOptionPane.ERROR_MESSAGE);
        }}
        
    
}
