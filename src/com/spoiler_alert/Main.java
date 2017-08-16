package com.spoiler_alert;

import java.util.ArrayList;


public class Main {

    static final String VICTORY = "BBBB";
    static final int MAX_TURNS = 10;

    public static void main(String[] args) {

        ArrayList<Character> outcome = new ArrayList<>();
        ArrayList<ArrayList<Character>> guesses = new ArrayList<>();

        int menuChoice = Menu.menu();
        if (menuChoice == 1) { // 1. : play with computer
            outcome = pickrandom.get_4_random();
        }
        else if (menuChoice == 2) { // 2. : play with human
            outcome = pickrandom.get_4_random();  // TODO: get user input for the outcome
        }
        System.out.println("The outcome of the game is: " + outcome);

        String result;
        int turnCount = 0;
        do {
            String guess = Userguess.get_user_input();
            ArrayList guessArray = Userguess.input_to_array(guess);
            guesses.add(guessArray);
            result = Evaluator.evaluateGuess(guessArray, outcome);
            Display.displayGuesses(guesses, outcome);
        } while (!result.equals(VICTORY) && ++turnCount != MAX_TURNS);

        if (turnCount == MAX_TURNS) {  // Lost the game
            System.out.println("U suck!");
        }
        else {  // Won the game
            System.out.println("Well done u lil shit, now go and fuck yourself");
        }
    }
}