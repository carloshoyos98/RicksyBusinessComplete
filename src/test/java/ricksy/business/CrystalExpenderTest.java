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

}
