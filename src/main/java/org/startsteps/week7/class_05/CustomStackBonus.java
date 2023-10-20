package org.startsteps.week7.class_05;

import java.util.Arrays;

public class CustomStackBonus<T extends Comparable<T>> {
    private int initialSize;
    private int maxSize;
    private T[] stackArray;
    private int top;

    @SuppressWarnings("unchecked")
    public CustomStackBonus(int s) {
        this.initialSize = s;
        this.maxSize = s;
        this.stackArray = (T[]) new Comparable[maxSize];
        this.top = -1;
    }

    @SuppressWarnings("unchecked")
    public void push(T item) {
        if (isFull()) {
            int newSize = 2 * maxSize;
            T[] newStackArray = (T[]) new Comparable[newSize];
            System.arraycopy(stackArray, 0, newStackArray, 0, maxSize);
            stackArray = newStackArray;
            maxSize = newSize;
        }
        stackArray[++top] = item;

        // Check for reducing size
        if (top < maxSize / 4 && maxSize > initialSize) {
            int newSize = maxSize / 2;
            T[] newStackArray = (T[]) new Comparable[newSize];
            System.arraycopy(stackArray, 0, newStackArray, 0, newSize);
            stackArray = newStackArray;
            maxSize = newSize;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return stackArray[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(stackArray[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public void sort() {
        Arrays.sort(stackArray, 0, top + 1);
    }

    public static class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person other) {
            return Integer.compare(this.age, other.age);
        }

        @Override
        public String toString() {
            return name + "(" + age + ")";
        }
    }

    public static void main(String[] args) {
        CustomStackBonus<Person> personStack = new CustomStackBonus<>(3);
        personStack.push(new Person("Charlie", 35));
        personStack.push(new Person("Alice", 25));
        personStack.push(new Person("Bob", 30));
        System.out.println(personStack);

        Person person = personStack.pop();
        System.out.println("The result of pop is: " + person);

        System.out.println("*****");

        System.out.println(personStack);

        personStack.sort();
        System.out.println(personStack);

    }
}