package org.startsteps.week9.day03.enums.exercises;

import java.util.Calendar;
import java.util.Date;

enum DayOfWeek {
    SUNDAY{
        @Override
        DayOfWeek getNextDay() {
            return DayOfWeek.MONDAY;
        }
    }, MONDAY {
        @Override
        DayOfWeek getNextDay() {
            return DayOfWeek.TUESDAY;
        }
    }, TUESDAY {
        @Override
        DayOfWeek getNextDay() {
            return DayOfWeek.WEDNESDAY;
        }
    }, WEDNESDAY {
        @Override
        DayOfWeek getNextDay() {
            return DayOfWeek.THURSDAY;
        }
    }, THURSDAY {
        @Override
        DayOfWeek getNextDay() {
            return DayOfWeek.FRIDAY;
        }
    }, FRIDAY {
        @Override
        DayOfWeek getNextDay() {
            return DayOfWeek.SATURDAY;
        }
    }, SATURDAY {
        @Override
        DayOfWeek getNextDay() {
            return DayOfWeek.SUNDAY;
        }
    };


    public static DayOfWeek getDayOfWeek(){
        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek){
            case 1 -> {
                return DayOfWeek.SUNDAY;
            }
            case 2 -> {
                return DayOfWeek.MONDAY;
            }
            case 3 -> {
                return DayOfWeek.TUESDAY;
            }
            case 4 -> {
                return DayOfWeek.WEDNESDAY;
            }
            case 5 -> {
                return DayOfWeek.THURSDAY;
            }
            case 6 -> {
                return DayOfWeek.FRIDAY;
            }
            case 7 -> {
                return DayOfWeek.SATURDAY;
            }
        }
        return DayOfWeek.MONDAY;
    }


    abstract DayOfWeek getNextDay();
}


public class Exercise1 {

    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.getDayOfWeek();

        DayOfWeek nextDay = today.getNextDay();

        System.out.println("Today is: " + today);
        System.out.println("Next day is: " + nextDay);
    }

}
