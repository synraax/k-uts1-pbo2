
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dtMedia_205314159_Dito {

    public dtMedia_205314159_Dito() {

    }

    public static void isi(ArrayList<Media_205314159_Dito> data) {  
        dlMedia_205314159_Dito dialog = new dlMedia_205314159_Dito(null, true, "Isi Data", data);
        dialog.setVisible(true);
    }

    public static void hapus(ArrayList<Media_205314159_Dito> data, int select) {
        data.remove(select);
    }

    public static void cari(ArrayList<Media_205314159_Dito> data) {
        dlMedia_205314159_Dito dialog = new dlMedia_205314159_Dito(null, true, "Cari Data", data);
        dialog.setVisible(true);
    }
}
