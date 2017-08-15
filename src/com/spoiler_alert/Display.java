package com.spoiler_alert;

import java.util.ArrayList;

public class Display {

    public static void main(String[] args) {

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String PEG = "\u25CF";

        ArrayList<ArrayList<Character>> guesses = new ArrayList<>();
        for (int i = 0; i < 4 ; i++) {
            guesses.add(pickrandom.get_4_random())
        }
        System.out.println(ANSI_RED + PEG);
        System.out.println(ANSI_GREEN + PEG + ANSI_RESET);
        System.out.println("Ja, mert kell a reset" + "Ugye");



    }
}
