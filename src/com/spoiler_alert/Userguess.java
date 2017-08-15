package com.spoiler_alert;

import java.util.ArrayList;
import java.util.Scanner;

public class Userguess {
    public static String get_user_input(){
        System.out.print("Enter your guess: ");
        Scanner scan = new Scanner(System.in);
        String guess = scan.nextLine();
        return guess;
    }

    public static ArrayList<String> input_to_array(String guess){
        ArrayList<String> guess_array = new ArrayList<String>();
        for (int i = 0; i < guess.length(); i++){
            char c = guess.charAt(i);
            String guesschar = String.valueOf(c);
            guess_array.add(guesschar);
        }
        return guess_array;
    }
}
