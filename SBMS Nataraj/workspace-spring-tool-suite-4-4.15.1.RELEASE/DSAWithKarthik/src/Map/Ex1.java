package Map;

import java.util.HashMap;

public class Ex1 {

    public static void main(String[] args) {
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        hm1.put("vamsi", 4540); // autoboxing --> Integer.valueOf(454)
        hm1.put("vamsi1", 4541);
        hm1.put("vamsi2", 4542);
        hm1.put("vamsi3", 4543);
        hm1.put("vamsi4", 4544);
        hm1.put("vamsi4", 4545);
        hm1.put("vamsi5", 4544);
        hm1.put("vamsi6", 4544);
        hm1.put(null, 1222);
        hm1.put(null, 11111);//null key value stores in zero index

        System.out.println(hm1);

    }
}