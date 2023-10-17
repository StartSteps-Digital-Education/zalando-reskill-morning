package org.startsteps.week7.class_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings({"unchecked"})
public class SuppressWarningsDemo {

    public static void main(String[] args) {
        SuppressWarningsDemo swDemo = new SuppressWarningsDemo();
        swDemo.testSuppressWarning();

        swDemo.addToList();
    }

    public void testSuppressWarning(){
        Map testMap = new HashMap();
        testMap.put(1, "Item_1");
        testMap.put(2, "Item_2");
        testMap.put(3, "Item_3");
    }

    public void addToList() {
        List<String> strings = new ArrayList<>();
        List rawList = strings;
        rawList.add(123);
    }

}
