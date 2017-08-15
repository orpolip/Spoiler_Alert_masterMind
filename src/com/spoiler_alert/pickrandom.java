package com.spoiler_alert;

import java.util.List;

import java.util.Random;
import java.util.ArrayList;

public class pickrandom {

    public static List get_4_random() {
        Random rand = new Random();
        ArrayList<String> givenList = new ArrayList<String>();
        ArrayList<String> hideList = new ArrayList<String>();

        givenList.add("A");
        givenList.add("C");
        givenList.add("B");
        givenList.add("K");
        givenList.add("G");
        givenList.add("F");

        int numberOfElements = 4;

        for (int i = 0; i < numberOfElements; i++) {
            int randomIndex = rand.nextInt(givenList.size());
            String randomElement = givenList.get(randomIndex);
            hideList.add(randomElement);
        }
        return hideList;
    }
}
