package ricksy.business;

import org.junit.Test;
import static org.junit.Assert.*;

public class CrystalExpenderTest {
    public CrystalExpender packExtender = null;

    @Test
    public void CrystalExpenderTest() {
        packExtender = new CrystalExpender(20, 50.0);
        assertEquals("stock: " + packExtender.stock() + '\n' +
                      "cost: " + packExtender.itemCost, packExtender.toString());
    }

    @Test
    public void dispatchTest() {
        packExtender = new CrystalExpender(20, 50.0);
        CreditCard Abradolph = new CreditCard("Abradolph", "5369666345223491");
        packExtender.dispatch(Abradolph);
        assertEquals(19, packExtender.stock());
        assertEquals(2950, Abradolph.credit(), 0);
    }

    @Test
    public void dispatchNoCreditTest() {
        packExtender = new CrystalExpender(20, 50.0);
        CreditCard GearHead = new CreditCard("GearHead", "5128453022690520");
        GearHead.pay(3000.0);

        packExtender.dispatch(GearHead);
        assertEquals(20, packExtender.stock());
    }
}
