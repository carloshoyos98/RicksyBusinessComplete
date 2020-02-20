package ricksy.business;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class UfosPark {
    public List<String> flota = new ArrayList<String>();
    public Map<String, String> fee = new HashMap<String, String>();

    public UfosPark() {}

    public void add(String ufo) {
        flota.add(ufo);
    }
}
