package org.startsteps.week7.class_02;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(11);
        queue.add(1);
        queue.add(20);
        queue.add(30);
        queue.add(1);

        System.out.println(queue);

        System.out.println("****");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }



    }
}
