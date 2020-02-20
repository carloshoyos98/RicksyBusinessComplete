package ricksy.business;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class UfosPark {
    public double fee = 500d;
    public Map<String, String> flota = new HashMap<String, String>();

    public UfosPark() {}

    public void add(String ufo) {
        flota.putIfAbsent(ufo, null);
    }
}
