package ricksy.business;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class UfosPark {
    public double fee = 500d;
    public Map<String, String> flota = new HashMap<String, String>();
    private String freeUfo = null;


    public UfosPark() {}

    public void add(String ufo) {
        flota.putIfAbsent(ufo, null);
    }

    //Método que comprueba si hay ovnis libres
    private String freeUfos() {
        for (Map.Entry<String, String> ufos : this.flota.entrySet()) {
            if (ufos.getValue() == null) {
                freeUfo = ufos.getKey();
            }
        }
        return freeUfo;

    }

    //Método que coge el primer ovni libre
    private void reserveUfo(String ufo, String owner) {
        this.flota.replace(ufo, owner);

    }

    public void dispatch(CreditCard tarjeta) {
        if(freeUfos() != null & tarjeta.pay(this.fee)) {


        } else {

        }
    }
}
