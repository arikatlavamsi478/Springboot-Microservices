package Convesions;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1112);
        arrayList.add(112);
        arrayList.add(11112);

        LinkedList<Integer> linkedList = new LinkedList<Integer>(arrayList);

        linkedList.add(1);
        linkedList.add(11);
        linkedList.add(111);
        linkedList.add(1111);
        linkedList.add(11111);
        linkedList.add(111111);
        linkedList.add(1111111);

        System.out.println(linkedList);
    }
}
