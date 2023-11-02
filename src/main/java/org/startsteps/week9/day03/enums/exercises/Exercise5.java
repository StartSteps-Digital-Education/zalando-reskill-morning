package org.startsteps.week9.day03.enums.exercises;

enum TrafficLight {
    RED, YELLOW, GREEN;

    public TrafficLight getNextColor() {
        return switch (this) {
            case RED -> YELLOW;
            case YELLOW -> GREEN;
            case GREEN -> RED;
        };
    }
}

public class Exercise5 {

    public static void main(String[] args) {
        // Starting from a given color and simulating the traffic light sequence
        TrafficLight currentLight = TrafficLight.RED;

        for (int i = 0; i < 6; i++) {  // Simulate 6 transitions
            System.out.println("Traffic light is now: " + currentLight);
            currentLight = currentLight.getNextColor();
        }
    }

}
