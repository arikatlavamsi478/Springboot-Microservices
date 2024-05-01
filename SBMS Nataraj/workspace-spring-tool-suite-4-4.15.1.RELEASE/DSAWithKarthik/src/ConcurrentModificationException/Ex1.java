package ConcurrentModificationException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Ex1 {
    public static void main(String[] args) {
       //ArrayList l = new ArrayList();

       // CopyOnWriteArrayList l = new CopyOnWriteArrayList();

        List l = new CopyOnWriteArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(70);

        Iterator iterator = l.iterator();
        while(iterator.hasNext()) {
            int i= (int) iterator.next();
          //  l.remove(3);
            l.add(12);
        }
        System.out.println(l);



    }
}