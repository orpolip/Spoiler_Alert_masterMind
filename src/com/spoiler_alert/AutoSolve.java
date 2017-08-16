package com.spoiler_alert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class AutoSolve {

    public static void aiGuess(ArrayList<Character> solution) {
        HashSet<ArrayList<Character>> solutionsSet = new HashSet<>();
        solutionsSet = generateFullSet();
        System.out.println(solutionsSet);
    }

    public static HashSet<ArrayList<Character>> generateFullSet() {
        HashMap<Integer,Character> charMap = new HashMap<>();
        charMap.put(0, 'R');
        charMap.put(1, 'G');
        charMap.put(2, 'B');
        charMap.put(3, 'Y');
        charMap.put(4, 'C');
        charMap.put(5, 'P');
        
        HashSet<ArrayList<Character>>fullSet = new HashSet<>();

        for (int i = 0; i < 1296 ; i++) {
            ArrayList<Character> tempPegsList = new ArrayList<>();
            int temp = i;
            for (int j=0; j<3; j++) {
                tempPegsList.add(charMap.get(temp % 6));
                temp = (temp - temp % 6) / 6;
            }
            tempPegsList.add(charMap.get(temp%6));
            fullSet.add(tempPegsList);
        }

        return fullSet;
    }

    public static void main(String[] args) {
        ArrayList<Character> tempSolution = new ArrayList<>();
        tempSolution.add('R');
        tempSolution.add('R');
        tempSolution.add('B');
        tempSolution.add('B');

        aiGuess(tempSolution);
    }
}
