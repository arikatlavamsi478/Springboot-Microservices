package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReadKeyandValue {
    public static void main(String[] args) {

        Map<String, Integer> Hmap1 = new HashMap<>();
        Hmap1.put("vamsi", 454);
        Hmap1.put("amsi", 45);
        Hmap1.put("msi", 44);
        Hmap1.put("i", 4);
        Hmap1.put("si", 453);

        // System.out.println(Hmap1.keySet().getClass());
       for(Map.Entry mapset : Hmap1.entrySet()){
          // System.out.println(mapset);
         //  System.out.println(mapset.getValue());
           System.out.println(mapset.getKey());

       }
       // iterator
        Iterator iterator = Hmap1.entrySet().iterator();
       while (iterator.hasNext()){
         Map.Entry  mapset2 = (Map.Entry) iterator.next();

       }
    }
}
