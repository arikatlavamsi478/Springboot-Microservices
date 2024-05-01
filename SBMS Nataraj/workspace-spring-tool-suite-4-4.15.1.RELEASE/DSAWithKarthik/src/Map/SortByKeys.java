package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeys {
    public static void main(String[] args) {
        Map<String, Integer> Hmap = new TreeMap<>();
        Hmap.put("vamsi", 454);
        Hmap.put("amsi", 45);
        Hmap.put("msi", 44);
        Hmap.put("i", 4);
        Hmap.put("si", 453);
        Hmap.put("si", 4534);
       // System.out.println(Hmap);

        Map<String, Integer> Tmap = new TreeMap<>();
        Tmap.putAll(Hmap);
        System.out.println(Tmap);
    }
}
