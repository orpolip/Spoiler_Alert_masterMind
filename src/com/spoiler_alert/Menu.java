package com.spoiler_alert;

import java.util.Scanner;

public class Menu {
    public static String opponent_chooser() {
        System.out.println("Choose your opponent (C - for computer, P - for another player):");
        String opponent = "";
        while (opponent == "") {
            Scanner scan = new Scanner(System.in);
            opponent = scan.nextLine();
            opponent = opponent.toUpperCase();
            if (!opponent.equals("C") && (!opponent.equals("P"))) {
                opponent = "";
                System.out.println("Type  \"C\" or \"P\" to choose a game mode!");
            } else if (opponent.equals("C") || opponent.equals("P")) {
                break;
            }
        }
        return opponent;
    }
}
