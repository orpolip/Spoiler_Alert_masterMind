package com.spoiler_alert;

import java.util.Scanner;

public class Menu {
    public static int menu() {


        System.out.println("Make your choice: ");
        int choice = 0;
        while (choice == 0) {
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt()){choice = scan.nextInt();}
            if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                choice = 0;
                System.out.println("Type  the corresponding number from the above menu!");
            } else if (choice == 4){
                System.out.println("Exiting..");
                System.exit(0);
                            }
            else if(choice == 3){
                System.out.println("Instructions:");
                System.out.println("Try to find out a code containing 4 colors.");
                System.out.println("One color can occur multiple times in a code.");
                System.out.println("Pick 4 of the available colors : red, green, yellow, blue, purple, cyan.");
                System.out.println("You get a feedback after each guess.");
                System.out.println("'B' means you got a color in the right place in the code.");
                System.out.println("'W' means that a color is right, but it is in the wrong place.");
                System.out.println("Type only the first letter of a color.");
                break;
            }
            else if (choice == 1 || choice == 2) {
                break;
            }
        }
        return choice;
    }

    public static void showMenu(){
        System.out.format("+------------------------+%n");
        System.out.format("| Welcome to masterMind! |%n");
        System.out.format("|------------------------|%n");
        System.out.format("|        MENU            |%n");
        System.out.format("|1. Play against computer|%n");
        System.out.format("|2. Play against player  |%n");
        System.out.format("|3. Show how to play     |%n");
        System.out.format("|4. Exit                 |%n");
        System.out.format("+------------------------+%n");

    }
}
