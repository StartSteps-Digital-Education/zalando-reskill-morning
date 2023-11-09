package org.startsteps.week10.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Berlin", "Hamburg", "Frankfurt");
        CopyOnWriteArrayList<String> cowArrayList = new CopyOnWriteArrayList<>(list);
        System.out.println("List = " + cowArrayList);
        Iterator<String> iterator1 = cowArrayList.iterator();

        // adding another element
        cowArrayList.add("Bremen");

        while (iterator1.hasNext()) {
            System.out.println("Element from iterator1 : " + iterator1.next());
        }
        System.out.println("-----");
        Iterator<String> iterator2 = cowArrayList.iterator();
        while (iterator2.hasNext()) {
            System.out.println("Element from iterator2 : " + iterator2.next());
        }
    }
}
