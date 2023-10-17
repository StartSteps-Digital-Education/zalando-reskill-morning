package org.startsteps.week7.class_02;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {

    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3, 4};

        for (int element: arr) {
            System.out.println(element);
        }
        System.out.println("*******");

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println(vector.get(1));

        System.out.println("********");

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "startsteps");
        hashtable.put(2, "zalando");

        System.out.println(hashtable.get(1));

        System.out.println("********");

        Hashtable<String, String> emailNameHashTable = new Hashtable<>();
        emailNameHashTable.put("faruk@email.com", "Faruk");
        emailNameHashTable.put("hannah@email.com", "Hannah");
        emailNameHashTable.put("john@email.com", "John");
        emailNameHashTable.put("doe@email.com", "Doe");

        System.out.println("The name is: " + emailNameHashTable.get("faruk@email.com"));


    }

}
