package org.startsteps.week7.class_04;

import java.util.ArrayList;

public class QueueGeneric<T> {

    public static void main(String[] args) {
        QueueGeneric<String> myQueue = new QueueGeneric<>(5);
        myQueue.enQueue("First");

        System.out.println("*********");
        myQueue.display();

        System.out.println("*********");

        myQueue.enQueue("Second");

        myQueue.display();
        System.out.println("*********");

        myQueue.deQueue();
        myQueue.display();

        System.out.println("*********");

        myQueue.enQueue("Third");
        myQueue.display();

        System.out.println("*********");

        myQueue.enQueue("Fourth");
        myQueue.display();

        System.out.println("*********");

        myQueue.deQueue();
        myQueue.display();
    }

    int queueLength;
    private ArrayList<T> items;
    int front = -1;
    int back = -1;

    public QueueGeneric(int size) {
        this.queueLength = size;
        items = new ArrayList<T>();
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return back - front + 1 == queueLength;
    }

    void enQueue(T itemValue) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        back++;
        if (isEmpty()) {
            front++;
        }
        items.add(itemValue);
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
            return;
        }
        if (front == back) {
            front = back = -1;
        } else {
            front++;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= back; i++) {
            System.out.println(items.get(i));
        }
    }

    void peak() {
        if (!isEmpty()) {
            System.out.println("Front value is: " + items.get(front));
        } else {
            System.out.println("Queue is empty");
        }
    }
}
