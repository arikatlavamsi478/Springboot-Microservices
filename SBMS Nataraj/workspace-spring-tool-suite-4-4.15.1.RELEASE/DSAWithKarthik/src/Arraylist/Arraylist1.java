package Arraylist;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {

        ArrayList a = new ArrayList<>();

        a.add(1); // Integer.valueOf(1);
        a.add(12); // Integer.valueOf(12);
        a.add(13); // Integer.valueOf(13);
        a.add(14);
        a.add(15);
        a.add(16);

        System.out.println(a);

        a.remove(0);

        System.out.println(a);
        System.out.println(a.get(0));

    }
    }


