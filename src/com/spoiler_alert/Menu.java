package com.spoiler_alert;

import java.awt.*;
import java.util.Scanner;

public class Menu {
    public static int menu() {


        System.out.println("Make your choice: ");
        int choice = -1;
        while (choice == -1) {
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt()){choice = scan.nextInt();}
            switch (choice){
                case 0:
                    System.out.println("Exiting..");
                    System.exit(0);
                    break;
                case 1 : break;
                case 2 : break;
                case 3 : break;
                case 4 : System.out.println("Pick four of the available colors : red, green, yellow, blue, purple, cyan");
                        System.out.println("You must type only the first letter of a color, don't worry they are not case sensitive ");
                        System.out.println("But don't even think to make some tricky typo like:");
                        System.out.println("GGG or bbbbb or xXxX or greenish red pink black, etc.\n");
                        break;
                default: choice = -1;
                        System.out.println("Type  the corresponding number from the above menu!");
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
        System.out.format("|3. Computer plays       |%n");
        System.out.format("|4. Show how to play     |%n");
        System.out.format("|0. Exit                 |%n");
        System.out.format("+------------------------+%n");

    }
}
