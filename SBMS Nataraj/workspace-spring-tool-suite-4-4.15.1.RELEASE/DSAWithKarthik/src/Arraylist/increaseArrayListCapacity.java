package Arraylist;

import java.util.ArrayList;

public class increaseArrayListCapacity {
    public static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<String>();
      //  l1.add("vamsi");
      //  l1.add("dada");

        l1.ensureCapacity(25);
        System.out.println(l1.size());
       // System.out.println(findCapacity(l1));
      //  System.out.println(l1);
     //   System.out.println(l1.ensureCapacity(40));
    }
}
