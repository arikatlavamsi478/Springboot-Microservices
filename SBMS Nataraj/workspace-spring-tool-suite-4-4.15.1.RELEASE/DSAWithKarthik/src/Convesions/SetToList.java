package Convesions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class SetToList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(111);
        arrayList.add(112);
        arrayList.add(11112);

        HashSet<Integer> linkedList = new HashSet<Integer>(arrayList);

        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(111);
        linkedList.add(111);
        linkedList.add(111111);
        linkedList.add(1111111);

        System.out.println(linkedList);
    }
}

