package org.startsteps.week10.day04.exercises.openclosed;

public class Exercise4 {
    public static void main(String[] args) {
        Greeting formal = new FormalGreeting();
        Greeting casual = new CasualGreeting();
        Greeting friendly = new FriendlyGreeting();

        System.out.println(formal.sayHello());
        System.out.println(casual.sayHello());
        System.out.println(friendly.sayHello());
    }
}

abstract class Greeting {
    public abstract String sayHello();
}

class FormalGreeting extends Greeting {
    @Override
    public String sayHello() {
        return "Good day.";
    }
}

class CasualGreeting extends Greeting {
    @Override
    public String sayHello() {
        return "Hey, what's up?";
    }
}

class FriendlyGreeting extends Greeting {
    @Override
    public String sayHello() {
        return "Hello, my friend!";
    }
}
