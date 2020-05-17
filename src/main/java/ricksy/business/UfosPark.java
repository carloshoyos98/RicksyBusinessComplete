package ricksy.business;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase que representa el servicio de transportes de
 * ufos.
 */
public class UfosPark implements GuestDispatcher{
    /**
     * Precio inicial. Indica el valor de cada ufo.
     */
    public double fee = 500d;
    /**
     * Lista de ufos que hay en flota.
     */
    public Map<String, String> flota = new HashMap<String, String>();
    /**
     * Nombre del ufo disponible.
     */
    private String freeUfo = null;


    public UfosPark() {}

    /**
     * Método para añadir ufos. Con este método añadimos ufos a la flota.
     * @param ufo Este parámetro indica el nombre del ufo.
     */
    public void add(String ufo) {
        flota.putIfAbsent(ufo, null);
    }

    //Método que comprueba si hay ovnis libres

    /**
     * Método que comprueba si hay ufos libres.
     * @return Devuelve el string del nombre del primer ufo libre.
     */
    private String freeUfos() {
        for (Map.Entry<String, String> ufos : this.flota.entrySet()) {
            if (ufos.getValue() == null) {
                freeUfo = ufos.getKey();
            }
        }
        return freeUfo;

    }

    //Método que coge el primer ovni libre

    /**
     * Método que reserva un ufo
     * @param ufo String, nombre del ufo libre.
     * @param card Tarjeta de la que hacer la transacción.
     */
    private void reserveUfo(String ufo, CreditCard card) {
        if (this.flota.containsValue(card.number())) {
            //No hace nada

        } else {
            card.pay(this.fee);
            this.flota.replace(ufo, card.number());
        }


    }

    /**
     * Método que realiza el pago y asigna un ufo al cliente.
     * @param creditCard Tarjeta que hace el pago.
     */
    public void dispatch(CreditCard creditCard) {
        if(freeUfos() != null) {
            reserveUfo(freeUfo, creditCard);
            //freeUfo a null para repetir el proceso
            freeUfo = null;
        }
    }

    /**
     * Método para obtener que ufo tiene un cliente.
     * @param tarjeta Tarjeta del cliente.
     * @return Devuelve un string con el nombre del ufo.
     */
    public String getUfoOf(String tarjeta) {
        String ufo = null;
        for (Map.Entry<String, String> ufos : this.flota.entrySet()) {
            if (ufos.getValue() == tarjeta) {
                ufo = ufos.getKey();
            }
        }
        return ufo;
    }
}
