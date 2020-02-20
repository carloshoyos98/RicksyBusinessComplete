package ricksy.business;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class UfosPark {
    public double fee = 500d;
    public Map<String, String> flota = new HashMap<String, String>();
    private int freeUfo = 0;


    public UfosPark() {}

    public void add(String ufo) {
        flota.putIfAbsent(ufo, null);
    }

    //Método que comprueba si hay ovnis libres
    /*private int freeUfos() {
        for(String cardNumber : this.flota.keySet()) {
            if(this.flota.get(freeUfo) == null) {
                freeUfo++;
            }
        }
        return freeUfo;
    }*/

    //Método que coge el primer ovni libre
    //private void firstFreeUfo() {

    //}

    /*public void dispatch(CreditCard tarjeta) {
        int freeUfos = freeUfos();
        if(freeUfos <= 0) {
            this.flota.replace(, tarjeta.number);

        }
    }*/
}
