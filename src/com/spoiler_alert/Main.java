package com.spoiler_alert;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        ArrayList outcome = pickrandom.get_4_random();
        System.out.println("The outcome of the game is: " + outcome);
        String result;
        String victory = "BBBB";
        int Counter = 0;
            do {
               String guess = Userguess.get_user_input();
                ArrayList guessArray = Userguess.input_to_array(guess);
                result = Evaluator.evaluateGuess(guessArray, outcome);
                System.out.println(result);
                Counter += 1;
                if( Counter == 3) {
                    break;
                }
            }while (!result.equals(victory));
        if( Counter == 3) {
            System.out.println("U suck!");
        }
        else{
            System.out.println("Well done u lil shit, now go and fuck yourself");
        }
    }
}