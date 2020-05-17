package ricksy.business;

import java.util.List;
import java.util.ArrayList;

/**
 * Receptivo que se le da a los clientes, para hacer todas las compras en una sola acción.
 */
public class Receptivo {
    /**
     * Lista de clientes.
     */
    List<GuestDispatcher> guests = new ArrayList<GuestDispatcher>();


    public Receptivo() {}

    /**
     * Registra clientes
     * @param guest Clientes.
     */
    public void registra(GuestDispatcher guest) {
        guests.add(guest);
    }

    /**
     * Hace las compras de los clientes.
     * @param tarjeta Tarjeta del cliente.
     */
    public void dispatch(CreditCard tarjeta) {
        for (GuestDispatcher guest : guests) {
            guest.dispatch(tarjeta);
        }
    }


}
