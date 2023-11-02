package org.startsteps.week9.day03.enums.exercises;

enum Direction {
    NORTH(0, 1),
    SOUTH(0, -1),
    EAST(1, 0),
    WEST(-1, 0);

    private final int deltaX;
    private final int deltaY;

    Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public int calculateNewX(int currentX) {
        return currentX + deltaX;
    }

    public int calculateNewY(int currentY) {
        return currentY + deltaY;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        int startX = 10;
        int startY = 10;

        // Simulating movement in different directions from the starting position
        Direction direction = Direction.NORTH;
        int newX = direction.calculateNewX(startX);
        int newY = direction.calculateNewY(startY);
        System.out.println("Moving NORTH from (" + startX + ", " + startY + ") to (" + newX + ", " + newY + ")");

        direction = Direction.EAST;
        newX = direction.calculateNewX(startX);
        newY = direction.calculateNewY(startY);
        System.out.println("Moving EAST from (" + startX + ", " + startY + ") to (" + newX + ", " + newY + ")");
    }
}
