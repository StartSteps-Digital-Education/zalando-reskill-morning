package org.startsteps.week7.class_04;

import java.util.ArrayList;

class Queue1<T> {
    private int queueLength;
    private ArrayList<T> items;

    private void init() {
        front = -1;
        back = -1;
        this.items = new ArrayList<>(queueLength);
    }

    private int front;
    private int back;

    public Queue1(int queueLength) {
        this.queueLength = queueLength;
        init();
    }

    public boolean isEmpty() {
        if (front == back) {
            init();
        }
        return (front == back);
    }

    public boolean isFull() {
        return items.size() >= queueLength;
    }

    public void enQueue(T item) {
        if (isFull()) System.out.println("Queue is full");
        else {
            items.add(++back, item);
        }
    }

    public T deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
            return null;
        } else {
            T item = items.get(++front);
            items.set(front, null);
            return item;
        }
    }

    public void display() {
        items.forEach(System.out::println);
    }

    public T peek() {
        if (isEmpty()) return null;
        else {
            return items.get(front + 1);
        }
    }

}