package com.spoiler_alert;

import java.util.ArrayList;
import java.util.Scanner;

public class Userguess {
    public static String get_user_input(String info){
        String guess = "";
        ArrayList<Character> colors = new ArrayList<Character>();
        ArrayList<Character> guessArray = new ArrayList<Character>();
        colors.add('R');
        colors.add('G');
        colors.add('B');
        colors.add('C');
        colors.add('P');
        colors.add('Y');

        while (guess == "") {
            System.out.print(info);;
            Scanner scan = new Scanner(System.in);
            guess = scan.nextLine();
            for (int i = 0; i < guess.length(); i++) {
                char c = guess.charAt(i);
                guessArray.add(Character.toUpperCase(c));
            }
            if (guess.length() != 4) {
                guess = "";
                System.out.println("The code contains 4 keys. Input exactly 4 keys!");
            } else if (guess.length() == 4) {
                    if (colors.containsAll(guessArray)) {
                        break;
                    } else {
                        System.out.println("Color not available. Choose from the above list.");
                        guess = get_user_input("Enter your guess: ");
                    }
                }
            }
        return guess;
    }

    public static ArrayList<Character> input_to_array(String guess){
        ArrayList<Character> guess_array = new ArrayList<>();
        for (int i = 0; i < guess.length(); i++){
            char c = guess.charAt(i);
            guess_array.add(Character.toUpperCase(c));
        }
        return guess_array;
    }
}
