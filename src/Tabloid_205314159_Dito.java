
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
public class Tabloid_205314159_Dito extends Media_205314159_Dito{
    
    protected String topik;
    protected String halaman;
    
    public Tabloid_205314159_Dito(String noI, String nama, String alamat, String redac, LocalDate thn, String topik, String hal){
        super(noI, nama, alamat, redac, thn);
        this.topik=topik;
        this.halaman=hal;
    }
    
    public String toString(){
        return super.toString() +"\nTopik: " +getTopik()
                +"\nHalaman: " +getHalaman();
    }

    /**
     * @return the topik
     */
    public String getTopik() {
        return topik;
    }

    /**
     * @param topik the topik to set
     */
    public void setTopik(String topik) {
        this.topik = topik;
    }

    /**
     * @return the halaman
     */
    public String getHalaman() {
        return halaman;
    }

    /**
     * @param halaman the halaman to set
     */
    public void setHalaman(String halaman) {
        this.halaman = halaman;
    }
}
