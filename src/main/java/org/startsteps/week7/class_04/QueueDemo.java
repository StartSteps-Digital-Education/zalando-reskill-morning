package org.startsteps.week7.class_04;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);

        System.out.println("The contents of the queue: " + queue);

        System.out.println("*********************");

        queue.add(10);
        queue.add(9);
        queue.add(6);
        queue.add(2);

        System.out.println("The contents of the queue: " + queue);

        System.out.println("*********************");


        int removedItem = queue.remove();
        System.out.println("The value of the removed item is: " + removedItem);
        System.out.println("The contents of the queue: " + queue);

        System.out.println("*********************");

        int peekedItem = queue.peek();
        System.out.println("The peeked value is: " + peekedItem);
        System.out.println("The contents of the queue: " + queue);

        int polledValue = queue.poll();
        System.out.println("The polled value is: " + polledValue);
        System.out.println("The contents of the queue: " + queue);


    }
}
