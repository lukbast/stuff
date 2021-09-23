package com.company;

public class Main {

    public static void main(String[] args) {

        double A = 20.00d;
        double B = 80.00d;
        double result1 = (A + B) * 100.00d;
        double reminder = result1 % 40.00d;

        boolean bool = reminder == 0;
        System.out.println("Reminder = 0 - "+bool);

        { if (bool = false)
            System.out.println("Got some reminder");
        else System.out.println("Didn't get reminder");
        }
    }

}