package org.startsteps.week10.day03;

import java.util.concurrent.Executor;

class ExecutorDemo {

    public static void main(String[] args) {
        Executor executor = new Invoker();
        executor.execute(() -> {
            // task to be performed
            System.out.println(Thread.currentThread().getName());
        });
    }
}

class Invoker implements Executor {
    @Override
    public void execute(Runnable r) {
        r.run();
    }
}

