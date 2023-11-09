package org.startsteps.week10.day04.exercises.single;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();

        Map<String, Double> itemsOrdered = new HashMap<>();
        itemsOrdered.put("Sandwich", 3.0);
        itemsOrdered.put("Coffee", 0.75);

        cafeteria.handleOrder("Sandwich", itemsOrdered);
    }
}

class FoodPreparation {
    public void prepareDish(String dish) {
        // Logic to prepare the dish
        System.out.println(dish + " has been prepared.");
    }
}

class Billing {
    public double calculateBill(Map<String, Double> itemsOrdered) {
        double total = 0;
        for (double price : itemsOrdered.values()) {
            total += price;
        }
        return total;
    }

    public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed.");
    }
}

class Cafeteria {
    private FoodPreparation foodPreparation;
    private Billing billing;

    public Cafeteria() {
        foodPreparation = new FoodPreparation();
        billing = new Billing();
    }

    public void handleOrder(String dish, Map<String, Double> itemsOrdered) {
        foodPreparation.prepareDish(dish);
        double totalBill = billing.calculateBill(itemsOrdered);
        billing.processPayment(totalBill);
    }
}
