package com.spoiler_alert;

import java.util.ArrayList;
import java.util.Scanner;

public class Userguess {
    public static String get_user_input(){
        String guess = "";
        while (guess == "") {
            System.out.print("Enter your guess: ");
            Scanner scan = new Scanner(System.in);
            guess = scan.nextLine();
            if (guess.length() != 4) {
                guess = "";
                System.out.println("The code contains 4 keys. Input exactly 4 keys!");
            } else if (guess.length() == 4) {
                break;
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
