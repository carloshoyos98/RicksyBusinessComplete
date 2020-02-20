package ricksy.business;
import org.junit.Test;
import static org.junit.Assert.*;

public class UfosParkTest {

    UfosPark ufos = null;
    String[] ovnis = { "unx", "dox", "trex" };

    @Test
    public void addUfoTest() {
    ufos = new UfosPark();
    for (String ovni : ovnis) {
        ufos.add(ovni);
    }
    assert(ufos.flota.size()== 3);
    }
}
