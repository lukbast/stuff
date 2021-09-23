package com.company;

public class Main {

    public static void main(String[] args) {// write your code here

        displayHighScorePosition("Me", 1500);
        displayHighScorePosition("You", 800);
        displayHighScorePosition("He", 400);
        displayHighScorePosition("She", 50);


    }

    public static void displayHighScorePosition(String name, int score) {
        int position = calculatedHighScorePosition(score);
        System.out.println(name + " managed to get into position "
                + position + " on the high score table");


    }

    public static int calculatedHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;
        }
        if (score >= 500) {
            return 2;
        }
        if (score >= 100) {
            return 3;
        } else {
            return 4;
        }


    }


}









