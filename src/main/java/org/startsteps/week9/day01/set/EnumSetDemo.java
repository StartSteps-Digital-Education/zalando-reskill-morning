package org.startsteps.week9.day01.set;

import java.util.EnumSet;
import java.util.Set;

enum StartSteps{ CODE, LEARN, CONTRIBUTE, QUIZ, MCQ }

public class EnumSetDemo {
    public static void main(String[] args)
    {
        // Creating a set
        Set<StartSteps> set1;

        // Adding the elements
        set1 = EnumSet.of(StartSteps.QUIZ, StartSteps.CONTRIBUTE, StartSteps.LEARN,StartSteps.CODE);

        System.out.println("Set 1: " + set1);
    }

}
