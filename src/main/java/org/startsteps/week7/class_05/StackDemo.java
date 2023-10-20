package org.startsteps.week7.class_05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        Stack<Integer> newStack = new Stack<>();

        stackPush(stack);
        System.out.println("Stack push: " + stack);

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        newStack.stream().forEach(e -> System.out.println("Element: " + e));

//        stack.stream().forEach(e -> System.out.println("Element: " + e));

        System.out.println("********");

        stackPeek(stack);

        System.out.println("Stack peek: " + stack);

        stackPop(stack);

        System.out.println("Stack Pop: " + stack);

        stackSearch(stack, 10);
    }

    static void stackPush(Deque<Integer> stack){
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stackPop(Deque<Integer> stack){
        Integer result = stack.pop();
        System.out.println("Result of pop: " + result);
    }

    static void stackPeek(Deque<Integer> stack){
        Integer element = stack.peek();
        System.out.println("Element on top of the stack is: " + element);
    }

    static void stackSearch(Deque<Integer> stack, Integer e){
//        int position = stack.search(e); // CMD + Click
//        System.out.println("The element " + e + " is in position: " + position);
    }

}
