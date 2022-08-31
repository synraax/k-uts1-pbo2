
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
public class Majalah_205314159_Dito extends Media_205314159_Dito{
    
    protected String kategori;
    protected String volume;
    
    public Majalah_205314159_Dito(String noI, String nama, String alamat, String redac, LocalDate thn, String kat, String vol){
        super(noI, nama, alamat, redac, thn);
        this.kategori=kat;
        this.volume=vol;
    }
    
    public String toString(){
        return super.toString() +"\nKategori: " +getKategori()
                +"\nVolume: " +getVolume();
        
    }

    /**
     * @return the kategori
     */
    public String getKategori() {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    /**
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }
}
