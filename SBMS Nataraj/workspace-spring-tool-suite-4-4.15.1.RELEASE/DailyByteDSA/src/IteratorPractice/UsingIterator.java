package IteratorPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UsingIterator {

    public static void main(String[] args) {


        // Create a HashSet Object.


        Set hashSet = new HashSet();

        // Add objects to the HashSet.

        hashSet.add("vamsi");
        hashSet.add("vamsi1");
        hashSet.add("vamsi2");
        hashSet.add("vamsi3");
        hashSet.add("vamsi4");

        // Print the HashSet Object.

        System.out.println(hashSet);

        // Print the HashSet elements using Iterator.

        Iterator iterator = hashSet.iterator();
        System.out.println("HashSet elements using iterator:");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
