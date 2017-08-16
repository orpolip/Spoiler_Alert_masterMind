package com.spoiler_alert;

import java.util.ArrayList;
import java.util.HashMap;

public class Display {

    public static void displayGuesses(ArrayList<ArrayList<Character>> guesses, ArrayList<Character> solution){

        HashMap<Character, String> colorMap = new HashMap<>();
        colorMap.put('r', "\u001B[0m"); //reset
        colorMap.put('R', "\u001B[31m"); //red
        colorMap.put('G', "\u001B[32m"); //green
        colorMap.put('Y', "\u001B[33m"); //yellow
        colorMap.put('B', "\u001B[34m"); //blue
        colorMap.put('P', "\u001B[35m"); //purple
        colorMap.put('C', "\u001B[36m"); //cyan

        final String PEG = "\u25CF";

        System.out.print("\033[H\033[2J"); // clear screen + cursor home
        System.out.flush();

        System.out.println("Possible color options: red, green, yellow, blue, purple, cyan");
        System.out.println("For example: rrbc or RrBc or red red blue cyan");
        System.out.println("But don't even think to try these ones:");
        System.out.println("GGG or bbbbb or xXxX or greenish red pink black\n");

        int lineIndex = 1;
        for ( ArrayList<Character> guess: guesses) {
            System.out.print(lineIndex + ":   ");
            lineIndex++;
            for (Character color: guess) {
                 System.out.print(colorMap.get(color) + "  " + PEG);
            }
            System.out.println(colorMap.get('r') + "    "+ Evaluator.evaluateGuess(guess, solution) +"\n");
        }

    }


    /***********************
     * only for test cases *
     **********************/
    public static void main(String[] args) {

        ArrayList<ArrayList<Character>> guesses = new ArrayList<>();
        for (int i = 0; i < 4 ; i++) {
            guesses.add(pickrandom.get_4_random());
        }

        ArrayList<Character> solution = new ArrayList<Character>();
        solution = pickrandom.get_4_random();

        displayGuesses(guesses, solution);

    }
}

