package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 10;
        short myShorValue = 100;
        int myIntValue = 1000;

        long myLongValue = (long)(50000 * (10 * ((int)(myByteValue) + (int)(myShorValue) + (myIntValue))));

        System.out.println("My Long value is " + myLongValue);
    }
}
