package ricksy.business;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UfosParkTest {

    UfosPark ufos = null;
    String[] ovnis = { "unx", "dox", "trex" };
    CreditCard tarjetaRick = null;

    @Before
    public void set_up_ufos() {
        ufos = new UfosPark();
        for (String ovni: ovnis) {
            ufos.add(ovni);
        }
        tarjetaRick = new CreditCard("Rick", "5238353317461180");
    }

    @Test
    public void addUfoTest() {

    assert(ufos.flota.size()== 3);
    }

    @Test
    public void dispatchTest() {
        ufos.dispatch(tarjetaRick);
        assertEquals("5238353317461180", ufos.flota.get(ovnis[0]));
    }

    /**
     * Testea que no se pueda reservar un ovni
     * si no hay crédito suficiente en la tarjeta.
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchNoCreditTest() {
        tarjetaRick.pay(2350);
        //Ahora que Rick tiene 150, no debería reservarse ovni para él
        ufos.dispatch(tarjetaRick);
        assertEquals(150, tarjetaRick.credit(), 0d);
    }

    /**
     * Testea que no se pueda reservar un ovni
     * si ya existe un ovni reservado para esa tarjeta.
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchUfoAlreadyReservedTest() {
        ufos.dispatch(tarjetaRick);
        //Ahora si Rick vuelve a pedir un ufo no se le debe dar aunque tenga dinero suficiente
        ufos.dispatch(tarjetaRick);
        assertNotNull(ufos.flota.get(ovnis[0]));
        assertNull(ufos.flota.get(ovnis[1]));
        assertNull(ufos.flota.get(ovnis[2]));
        assertEquals(2500, tarjetaRick.credit(), 0d);
    }

    /**
     * Testea que no se pueda reservar un ovni
     * si no existe ninguno disponible (sin reservar).
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchNoUfoAvaliableTest() {
        CreditCard tarjetaMorty = new CreditCard("Rick", "5238353317461180");
        CreditCard tarjetaAbradolph = new CreditCard("Rick", "52383533175661180");
        tarjetaRick = new CreditCard("Rick", "5238353317461189");
        ufos.dispatch(tarjetaAbradolph);
        ufos.dispatch(tarjetaMorty);
        ufos.dispatch(tarjetaRick);
        CreditCard tarjetaSquanchy = new CreditCard("Rick", "52383533343180");
        //Squanchy no podrá reservar ningun ufo
        ufos.dispatch(tarjetaSquanchy);
        assertFalse(ufos.flota.containsValue(tarjetaSquanchy.number()));
        System.out.println(ufos.flota);

    }
}
