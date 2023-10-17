package org.startsteps.week7.class_01;

public class Varargs {

    public static void main(String[] args){
        Varargs varargs = new Varargs();
//        varargs.printStrings("First text", "Second text");
        varargs.printStringVarargs("First Text");


    }

    public void printStrings(String string1, String string2){
        System.out.println(string1);
        System.out.println(string2);
    }

    public void printStringVarargs(String... strings){
        System.out.println(strings[0]);
        System.out.println(strings[1]);
    }

}
