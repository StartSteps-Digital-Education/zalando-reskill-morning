package org.startsteps.week10.day03.exercises.executor;

import java.util.concurrent.Executor;

public class ExecutorExample2 {
    public static void main(String[] args) {
        Executor executor = new MyExecutor2();
        executor.execute(() -> {
            for (int i = 1; i < 4; i++){
                System.out.println(i);
            }
        });
    }
}


class MyExecutor2 implements Executor {

    @Override
    public void execute(Runnable command) {
        command.run();
    }
}