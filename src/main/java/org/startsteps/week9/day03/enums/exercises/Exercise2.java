package org.startsteps.week9.day03.enums.exercises;

import java.util.Random;

enum CardSuit {
    HEARTS, DIAMONDS, CLUBS, SPADES;

    public static CardSuit getRandomSuit() {
        Random random = new Random();
        int randomIndex = random.nextInt(values().length);
        return values()[randomIndex];
    }
}

public class Exercise2 {

    public static void main(String[] args) {
        // Generate and print a random card suit
        CardSuit randomSuit = CardSuit.getRandomSuit();
        System.out.println("Random card suit is: " + randomSuit);
    }

}
