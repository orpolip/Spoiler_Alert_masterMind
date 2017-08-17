package com.spoiler_alert;

import java.awt.*;
import java.util.Scanner;

public class Menu {
    public static int menu() {


        System.out.println("Make your choice: ");
        int choice = 0;
        while (choice == 0) {
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt()){choice = scan.nextInt();}
            if (choice != 1 && choice != 2 && choice != 3) {
                choice = 0;
                System.out.println("Type  the corresponding number from the above menu!");
            } else if (choice == 4){
                System.out.println("Exiting..");
                System.exit(0);
                            }
            else if(choice == 3){
                System.out.println("Pick four of the available colors : red, green, yellow, blue, purple, cyan");
                System.out.println("You must type only the first letter of a color, don't worry they are not case sensitive ");
                System.out.println("But don't even think to make some tricky typo like:");
                System.out.println("GGG or bbbbb or xXxX or greenish red pink black, etc.\n");
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
