package org.startsteps.week10.day03;


import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> cMap = new ConcurrentHashMap<>();
        cMap.put(1, "Berlin");
        cMap.put(2, "Frankfurt");
        cMap.put(3, "Dresden");
        Iterator<Integer> it = cMap.keySet().iterator();
        while (it.hasNext()) {
            int key = it.next();
            if (key == 2)
                cMap.put(2, "Dortmund");
            System.out.println(key + " : " + cMap.get(key));
        }
    }
}
