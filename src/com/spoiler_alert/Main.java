package com.spoiler_alert;

import java.util.List;


public class Main {

    public static void main(String[] args) {

        List outcome = pickrandom.get_4_random();
        System.out.println("The outcome of the game is: " + outcome);
        String guess = Userguess.get_user_input();
        System.out.println(Userguess.input_to_array(guess));
    }
}