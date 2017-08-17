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
}

