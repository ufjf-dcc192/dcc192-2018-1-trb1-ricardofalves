package dcc192_2018_1_trb1;

import java.util.ArrayList;
import java.util.List;

public class ListaDeMesas {
    private static List<Mesa> mesas;
    
    public static List<Mesa> getInstance(){
        if (mesas == null) {
            mesas = new ArrayList<>();
            mesas.add(new Mesa(1));
            mesas.add(new Mesa(2));
            mesas.add(new Mesa(3));
        }
        return mesas;
    }
    
}
