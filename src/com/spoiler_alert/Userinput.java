package com.spoiler_alert;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;

public class Userinput {
    public static String getUserInput(String info){
        String guess = "";
        ArrayList<Character> colors = new ArrayList<>();
        ArrayList<Character> guessArray = new ArrayList<>();

        colors.add('R');
        colors.add('G');
        colors.add('B');
        colors.add('C');
        colors.add('P');
        colors.add('Y');
        
        while (guess == "") {
            String wrongColor = "";
            System.out.println("Available colors: red, green, yellow, blue, purple, cyan");
            System.out.print(info);

            Scanner scan = new Scanner(System.in);
            guess = scan.nextLine();

            //comment in IDE
            /*if (info == "Enter your code: ") {
                Console cns = System.console();
                guess = new String(cns.readPassword());
            }
            else {
                Scanner scan = new Scanner(System.in);
                guess = scan.nextLine();
            }*/


            guessArray = inputToArray(guess);
            if (guess.length() != 4) {
                guessArray.clear();
                guess = "";
                System.out.println("The code contains 4 keys. Input exactly 4 keys!");
            } else if (guess.length() == 4) {
                wrongColor = "";
                if (colors.containsAll(guessArray)) {
                    break;
                } else {
                    for (int i = 0; i < guessArray.size(); i++) {
                        if (!colors.contains(guessArray.get(i))) {
                            wrongColor += guessArray.get(i).toString();
                            if (wrongColor.length() >= 1){
                                wrongColor += " ";
                            }
                        }
                    }
                    System.out.println("Invalid colors: " + wrongColor);
                    guess = getUserInput(info);
                }
            }
        }
        return guess;
    }

    public static ArrayList<Character> inputToArray(String guess){
        ArrayList<Character> guess_array = new ArrayList<>();
        for (int i = 0; i < guess.length(); i++){
            char c = guess.charAt(i);
            guess_array.add(Character.toUpperCase(c));
        }
        return guess_array;
    }
}
