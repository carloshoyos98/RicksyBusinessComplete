package ricksy.business;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReceptivoTest {

    @Test
    public void ReceptivoTest() {

        Receptivo receptivo = new Receptivo();
        CrystalExpender packExpender = new CrystalExpender(10, 50);
        UfosPark ufosPark = new UfosPark();
        receptivo.registra(packExpender);
        receptivo.registra(ufosPark);
        assertEquals(2, receptivo.guests.size());
    }
    @Test
    public void dispatchTest() {
        Receptivo receptivo = new Receptivo();
        CrystalExpender packExpender = new CrystalExpender(10, 50);
        UfosPark ufosPark = new UfosPark();
        receptivo.registra(packExpender);
        receptivo.registra(ufosPark);
        CreditCard tarjetaMorty = new CreditCard("Rick", "5238353317461180");
        CreditCard tarjetaAbradolph = new CreditCard("Rick", "52383533175661180");
        CreditCard tarjetaRick = new CreditCard("Rick", "5238353317461189");
        receptivo.dispatch(tarjetaAbradolph);
        receptivo.dispatch(tarjetaMorty);
        receptivo.dispatch(tarjetaRick);
        assertEquals(2450, tarjetaAbradolph.credit(),0d);
        assertEquals(2450, tarjetaMorty.credit(),0d);
        assertEquals(2450, tarjetaRick.credit(),0d);

    }


}
