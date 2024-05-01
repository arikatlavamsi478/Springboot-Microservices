package Map;

import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put("vamsi", 4540); // autoboxing --> Integer.valueOf(454)
        hm.put("vamsi1", 4541);
        hm.put("vamsi2", 4542);
        hm.put("vamsi3", 4543);
        hm.put("vamsi4", 4544);
        hm.put("vamsi4", 4545);
        hm.put("vamsi5", 4544);
        hm.put("vamsi6", 4544);
        hm.put(null,"1222");
        hm.put(null,"1223");//null key value stores in zero index

        System.out.println(hm);
      //  System.out.println(hm.get("vamsi4"));
       // int i= (int) hm.get("vamsi5");
       // System.out.println(i);
     //   int r= (int) hm.remove("vamsi1");
     //   System.out.println(r);
       // Boolean b=hm.containsKey("vamsi1");
       // System.out.println(b);

       // Boolean b1=hm.containsKey("vamsi111");
       // System.out.println(b1);
    }
}
