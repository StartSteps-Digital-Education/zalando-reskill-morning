package org.startsteps.week10.day03.exercises.executor;

import java.util.concurrent.Executor;

public class ExecutorExample1 {
    public static void main(String[] args) {
        Executor executor = new MyExecutor();
        executor.execute(() -> {
            System.out.println("Hello from Executor!");
        });
    }
}

class MyExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        command.run();
    }
}