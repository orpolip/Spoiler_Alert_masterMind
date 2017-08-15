package com.spoiler_alert;

import java.util.List;

import java.util.Random;
import java.util.ArrayList;

public class pickrandom {

    public static ArrayList get_4_random() {
        Random rand = new Random();
        ArrayList<Character> givenList = new ArrayList<>();
        ArrayList<Character> hideList = new ArrayList<>();

        givenList.add('R');
        givenList.add('G');
        givenList.add('B');
        givenList.add('C');
        givenList.add('P');
        givenList.add('Y');

        int numberOfElements = 4;


        for (int i = 0; i < numberOfElements; i++) {
            int randomIndex = rand.nextInt(givenList.size());
            char randomElement = givenList.get(randomIndex);
            hideList.add(randomElement);
        }
        return hideList;
    }
}

