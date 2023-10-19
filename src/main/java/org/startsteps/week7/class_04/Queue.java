package org.startsteps.week7.class_04;

// Queue implementation in Java
public class Queue {

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(10);
        queue.enQueue(20);

        queue.display();

        System.out.println("******");
        queue.deQueue();
        queue.display();

    }

    int queueLength = 3;
    int items[] = new int[queueLength];
    int front = -1;
    int back = -1;

    boolean isFull() {
        return back == queueLength - 1;
    }

    boolean isEmpty() {
        if (front == -1) {
            if (back != -1){
                throw new IllegalStateException("If the front is equal to -1, that should be the same for the back as well");
            }
            return true;
        } else {
            return false;
        }
    }

    void enQueue(int itemValue) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (front == -1 && back == -1) {
            front = back = 0;
            items[back] = itemValue;
        } else {
            back++;
            items[back] = itemValue;
        }
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else if (front == back) {
            front = back = -1;
        } else {
            front++;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= back; i++) {
                System.out.println(items[i]);
            }
        }
    }

    void peak() {
        System.out.println("Front value is: " + items[front]);
    }
}


