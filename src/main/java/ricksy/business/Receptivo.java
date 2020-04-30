package ricksy.business;

import java.util.List;
import java.util.ArrayList;

public class Receptivo {

    List<GuestDispatcher> guests = new ArrayList<GuestDispatcher>();


    public Receptivo() {}

    public void registra(GuestDispatcher guest) {
        guests.add(guest);
    }

    public void dispatch(CreditCard tarjeta) {
        for (GuestDispatcher guest : guests) {
            guest.dispatch(tarjeta);
        }
    }


}
