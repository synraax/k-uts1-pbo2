
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
public class Media_205314159_Dito {
    
    protected String noIjin;
    protected String nama;
    protected String alamat;
    protected String redactur;
    protected LocalDate tahun;
    
    public Media_205314159_Dito(String noI, String nama, String alamat, String redac, LocalDate thn){
        this.noIjin=noI;
        this.nama=nama;
        this.alamat=alamat;
        this.redactur=redac;
        this.tahun=thn;
    }
    
    public String toString(){
        return "No Ijin:" +getNoIjin() 
                +"\nNama: " +getNama() 
                +"\nAlamat: " +getAlamat() 
                +"\nRedactur: " +getRedactur() 
                +"\nTahun: " +getTahun();
    }

    /**
     * @return the noIjin
     */
    public String getNoIjin() {
        return noIjin;
    }

    /**
     * @param noIjin the noIjin to set
     */
    public void setNoIjin(String noIjin) {
        this.noIjin = noIjin;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the redactur
     */
    public String getRedactur() {
        return redactur;
    }

    /**
     * @param redactur the redactur to set
     */
    public void setRedactur(String redactur) {
        this.redactur = redactur;
    }

    /**
     * @return the tahun
     */
    public LocalDate getTahun() {
        return tahun;
    }

    public int getIntTahun(){
        return tahun.getYear();
    }
    
    /**
     * @param tahun the tahun to set
     */
    public void setTahun(LocalDate tahun) {
        this.tahun = tahun;
    }
    
}
