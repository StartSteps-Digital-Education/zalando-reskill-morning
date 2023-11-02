package org.startsteps.week9.day03.enums;

import java.util.*;

enum PizzaStatuss{

    ORDERED(5){
        @Override
        boolean isDeliverable() {
            return false;
        }
    },
    READY(2){
        @Override
        boolean isDeliverable() {
            return true;
        }
    },
    DELIVERED(0){
        @Override
        boolean isDeliverable() {
            return false;
        }
    };

    private final int timeToDelivery;

    abstract boolean isDeliverable();

    PizzaStatuss(int timeToDelivery){
        this.timeToDelivery = timeToDelivery;
    }

    public int getTimeToDelivery() {
        return timeToDelivery;
    }
}

class Pizzaa {

    public static final Set<PizzaStatuss> undeliveredPizzaStatuses = EnumSet.of(
            PizzaStatuss.ORDERED,
            PizzaStatuss.DELIVERED
    );


    private PizzaStatuss pizzaStatuss = PizzaStatuss.ORDERED;

    public Pizzaa() {
    }

    public static List<Pizzaa> getAllUndeliveredPizzas(List<Pizzaa> pizzaas){
        return pizzaas.stream()
                .filter(pizzaa -> undeliveredPizzaStatuses.contains(pizzaa.getPizzaStatuss()))
                .toList();
    }

    public static EnumMap<PizzaStatuss, List<Pizzaa>> groupPizzaByStatus(List<Pizzaa> pizzaas){
        EnumMap<PizzaStatuss, List<Pizzaa>> pizzasByStatus = new EnumMap<>(PizzaStatuss.class);

        for(Pizzaa pizzaa: pizzaas) {

            if (pizzasByStatus.containsKey(pizzaa.pizzaStatuss)) {
                pizzasByStatus.get(pizzaa.pizzaStatuss).add(pizzaa);
            } else {
                ArrayList<Pizzaa> pizzaaArrayList = new ArrayList<>();
                pizzaaArrayList.add(pizzaa);
                pizzasByStatus.put(pizzaa.pizzaStatuss, pizzaaArrayList);
            }

        }

        return pizzasByStatus;
    }

    public PizzaStatuss getPizzaStatuss() {
        return pizzaStatuss;
    }

    public void setPizzaStatuss(PizzaStatuss pizzaStatuss) {
        this.pizzaStatuss = pizzaStatuss;
    }

    public void printStatus(){
        System.out.println("Pizza status: " + pizzaStatuss);
    }

}

public class EnumDemo {

    public static void main(String[] args) {
        Pizzaa pizzaa1 = new Pizzaa();
        Pizzaa pizzaa2 = new Pizzaa();
        pizzaa2.setPizzaStatuss(PizzaStatuss.DELIVERED);
        Pizzaa pizzaa3 = new Pizzaa();
        pizzaa3.setPizzaStatuss(PizzaStatuss.READY);
        Pizzaa pizzaa4 = new Pizzaa();
        pizzaa4.setPizzaStatuss(PizzaStatuss.READY);

        List<Pizzaa> pizzaaList = List.of(pizzaa1, pizzaa2, pizzaa3, pizzaa4);

        List<Pizzaa> undeliveredPizzas = Pizzaa.getAllUndeliveredPizzas(pizzaaList);
        for (Pizzaa pizza: undeliveredPizzas) {
            System.out.println("The status of the pizza is: " + pizza.getPizzaStatuss());
        }

        System.out.println("Grouped pizaa: " + Pizzaa.groupPizzaByStatus(pizzaaList));
    }
}


// EXERCISES UNTIL 11:20