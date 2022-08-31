
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dito
 */
public class Koran_205314159_Dito extends Media_205314159_Dito{
    
    protected String bahasa;
    protected LocalDate iklan;
    
    public Koran_205314159_Dito(String noI, String nama, String alamat, String redac, LocalDate thn, String bhs, LocalDate ikln){
        super(noI, nama, alamat, redac, thn);
        this.bahasa=bhs;
        this.iklan=ikln;
    }
    
    public String toString(){
        return super.toString() +"Bahasa: " +getBahasa() 
                +"\nIklan: " +getIklan();
    }

    /**
     * @return the bahasa
     */
    public String getBahasa() {
        return bahasa;
    }

    /**
     * @param bahasa the bahasa to set
     */
    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    /**
     * @return the iklan
     */
    public LocalDate getIklan() {
        return iklan;
    }
    
    public int getYearIklan(){
        return iklan.getYear();
    }
    
    /**
     * @param iklan the iklan to set
     */
    public void setIklan(LocalDate iklan) {
        this.iklan = iklan;
    }
}
