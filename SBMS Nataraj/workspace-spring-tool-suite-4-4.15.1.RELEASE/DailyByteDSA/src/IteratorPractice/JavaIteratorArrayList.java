package IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIteratorArrayList {
    public static void main(String[] args) {

        ArrayList<String> cityNames = new ArrayList<String>();

        cityNames.add("Ongole");
        cityNames.add("Guntur");
        cityNames.add("bangalore");
        cityNames.add("Kerala");
        cityNames.add("Chennai");
        cityNames.add("Delhi");

      System.out.println(cityNames);

        // Iterator

        Iterator<String> it = cityNames.iterator();

        //  Iterator it = cityNames.listIterator();
        //  Iterator it = cityNames.listIterator(5);
        while (it.hasNext()) {

            // illegal state exception

            // it.remove();
            String str = it.next();
            // System.out.println(it.next());

            //     System.out.println(str);

            // Concurrent modification Exception
            if (str.equals("Delhi")) {
                //  System.out.println(cityNames.remove(str));
                //  System.out.println(cityNames.remove(5));
                // System.out.println(cityNames.remove());
              //  cityNames.remove(5);

               it.remove();

            }
        }
            // avoid concurrent modification exception by using iterator's remove() function.
         //   it.remove();
          //  System.out.println("avoid exception");
            System.out.println(cityNames);




    }
}
