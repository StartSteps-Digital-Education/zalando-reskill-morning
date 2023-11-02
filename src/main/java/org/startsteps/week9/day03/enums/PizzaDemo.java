package org.startsteps.week9.day03.enums;

public class PizzaDemo {

    public static void main(String[] args) {
        Pizza pizza = new Pizza(PizzaStatus.READY);
        pizza.printTimeToDeliver();
    }
}

class Pizza {

    private PizzaStatus status;

    Pizza(PizzaStatus status){
        this.status = status;
    }

    public boolean isDeliverable() {
        return this.status.isReady();
    }

    public void printTimeToDeliver() {
        System.out.println("Time to delivery is " + status.getTimeToDelivery());
    }

}

enum PizzaStatus {
    ORDERED(5) {
        @Override
        public boolean isOrdered() {
            return true;
        }
    },
    READY(2) {
        @Override
        public boolean isReady() {
            return true;
        }
    },
    DELIVERED(0) {
        @Override
        public boolean isDelivered() {
            return true;
        }
    };
    private int timeToDelivery;

    public boolean isOrdered() {
        return false;
    }

    public boolean isReady() {
        return false;
    }

    public boolean isDelivered() {
        return false;
    }

    public int getTimeToDelivery() {
        return timeToDelivery;
    }

    PizzaStatus(int timeToDelivery) {
        this.timeToDelivery = timeToDelivery;
    }
}