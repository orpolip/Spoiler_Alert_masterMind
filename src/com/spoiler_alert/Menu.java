package com.spoiler_alert;

import java.util.Scanner;

public class Menu {
    public static int opponent_chooser() {
        System.out.println("Welcome to Mastermind! \n");
        System.out.println("MENU");
        System.out.println("1. Play against computer");
        System.out.println("2. Play against another player");
        System.out.println("3. Exit");
        System.out.println("Make your choice: ");
        int choice = 0;
        while (choice == 0) {
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            if (choice != 1 && choice != 2 && choice != 3) {
                choice = 0;
                System.out.println("Type  the corresponding number from the above menu!");
            } else if (choice == 3){
                System.out.println("Exiting..");
                System.exit(0);
            }
            else if (choice == 1 || choice == 2) {
                break;
            }
        }
        return choice;
    }
}
