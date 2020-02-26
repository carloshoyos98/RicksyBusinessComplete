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
}
