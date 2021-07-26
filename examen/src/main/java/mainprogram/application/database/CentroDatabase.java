package mainprogram.application.database;


import mainprogram.application.Centro;

import java.util.ArrayList;
import java.util.List;

public class CentroDatabase {
    static CentroDatabase instance;
    public final List<Centro> centros = new ArrayList<>();


    private CentroDatabase(){

    }

    public static synchronized CentroDatabase getInstance() {
        if (instance == null) {
            instance = new CentroDatabase();
        }
        return instance;
    }

    public void add(Centro centro){
        centros.add(centro);
    }
}
