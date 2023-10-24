package org.startsteps.week7.class_05;



public class CodeReview {

    public static final int CONSTANT_NAME = 3;

    private final int INITIAL_MAX_SIZE; // 2. We use the ALL_UPPERCASE naming style for constants
    public CodeReview(int size) {
        INITIAL_MAX_SIZE = size;
    }


    int top = 0;
    public int size(long[] stackArr){ // 3. Argument not used
        return top + 1;
    }

}
