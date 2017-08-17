package com.spoiler_alert;

import java.util.ArrayList;


public class Main {

    static final String VICTORY = "BBBB";
    static final int MAX_TURNS = 10;

    public static void main(String[] args) {

        ArrayList<Character> outcome;
        ArrayList<ArrayList<Character>> guesses = new ArrayList<>();

        String userGuess = "Enter your guess: ";
        String userCode = "Enter your color pattern: ";
        String result;
        Menu.showMenu();
        while (true) {
            int menuChoice = Menu.menu();
            if (menuChoice == 1) { // 1. : play with computer
                outcome = Pickrandom.getFourRandom();
                break;
            } else if (menuChoice == 2) { // 2. : play with human
                String code = Userinput.getUserInput(userCode);
                ArrayList codeArray = Userinput.inputToArray(code);
                outcome = codeArray;
                break;
            } else if (menuChoice == 3) { //3. computer plays
                String code = Userinput.getUserInput(userCode);
                ArrayList codeArray = Userinput.inputToArray(code);
                AutoSolve.aiGuess(codeArray);
                Menu.showMenu();
            }else if (menuChoice == 4) {
                continue;
            }
        }
        int turnCount = 0;
        do {
            String guess = Userinput.getUserInput(userGuess);
            ArrayList guessArray = Userinput.inputToArray(guess);
            guesses.add(guessArray);
            result = Evaluator.evaluateGuess(guessArray, outcome);
            Display.displayGuesses(guesses, outcome);
        } while (!result.equals(VICTORY) && ++turnCount != MAX_TURNS);

        if (turnCount == MAX_TURNS) {  // Lost the game
            System.out.println("Use your brain next time! " + outcome);
        }
        else {  // Won the game
            System.out.println("Congratulations, you are a true MasterMind!");
        }
    }
}
