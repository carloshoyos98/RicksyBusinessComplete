package ricksy.business;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {
    public CreditCard tarjetaRick;
    @Test
    public void crearTarjetaTest() {
        //http://ensaimeitor.apsl.net/gen_mastercard/10/
        tarjetaRick = new CreditCard("Rick", "5238353317461180");
        assertEquals("Rick", tarjetaRick.owner);
        assertEquals("5238353317461180", tarjetaRick.number);
        assertEquals(3000.0, tarjetaRick.credit, 0d);
        assertEquals("owner: " + tarjetaRick.owner + '\n' +
                     "number: " + tarjetaRick.number + '\n' +
                     "credit: " + tarjetaRick.credit + tarjetaRick.SYMBOL, tarjetaRick.toString());

    }

    @Test
    public void payTest() {
     tarjetaRick = new CreditCard("Rick", "5238353317461180");
     tarjetaRick.pay(2500);
     assertEquals(500, tarjetaRick.credit, 0d);
    }
}
