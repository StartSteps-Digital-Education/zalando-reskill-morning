package org.startsteps.week10.day04;

public class DependencyInversionDemo {
}

interface Keyboard { }

interface Monitor { }

class Windows98Machine{

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}

class StandardKeyboard implements Keyboard { }

class HDMonitor implements Keyboard { }

