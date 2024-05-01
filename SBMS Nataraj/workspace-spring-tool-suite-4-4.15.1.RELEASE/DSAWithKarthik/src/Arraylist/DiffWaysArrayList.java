package Arraylist;

import java.util.ArrayList;

public class DiffWaysArrayList {
    public static void main(String[] args) {

        // ArrayList() --> ArrayList with initial capacity - 10
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        // ArrayList(int initialCapacity) --> ArrayList with supp;lied initial capacity
        ArrayList<Integer> list2 = new ArrayList<Integer>(20);

        // ArrayList(Collection c) --> ArrayList containing the elements of the supplied collection
        ArrayList<Integer> list3 = new ArrayList<Integer>(list1);


    }

}
