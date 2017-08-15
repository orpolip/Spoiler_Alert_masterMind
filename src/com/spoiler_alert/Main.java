package com.spoiler_alert;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        ArrayList outcome = pickrandom.get_4_random();
        System.out.println("The outcome of the game is: " + outcome);
        String guess = Userguess.get_user_input();
        ArrayList guessArray = Userguess.input_to_array(guess);

        System.out.println(Evaluator.evaluateGuess(guessArray, outcome));
    }
}