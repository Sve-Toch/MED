/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Doctor.BL;

import java.util.Date;

/**
 *
 * @author user
 */
public class Visit {
    private   String recommendation;
    private  String galoba;
    private Date date;
    private String polis;
     public  void setPolis(String polis)
    {
        this.polis=polis;
    }
    public  void setRecomm(String rec)
    {
        recommendation=rec;
    }
    public  void setGaloba(String gal)
    {
        galoba=gal;
    }
    public void setDate(Date date)
    {
     this.date=date;    
    }
     public  String getPolis()
    {
        return polis;
    }
      public  String getRecomm()
    {
        return recommendation;
    }
    public  String getGaloba()
    {
        return galoba;
    }
    public Date getDate()
    {
     return date;    
    }
}
