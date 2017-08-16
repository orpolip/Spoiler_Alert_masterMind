package com.spoiler_alert;

import java.util.ArrayList;
import java.util.Scanner;

public class Userguess {
    public static String get_user_input(String info){
        System.out.print(info);
        Scanner scan = new Scanner(System.in);
        String guess = scan.nextLine();
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
