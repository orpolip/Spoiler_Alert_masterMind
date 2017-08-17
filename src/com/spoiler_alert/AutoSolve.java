package com.spoiler_alert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;

public class AutoSolve {

    public static void aiGuess(ArrayList<Character> solution) {

        HashSet<ArrayList<Character>> solutionsSet;
        solutionsSet = generateFullSet();

        ArrayList<ArrayList<Character>> listOfGuesses = new ArrayList<>();
        ArrayList<Character> firstGuess = new ArrayList<Character>() {{
            add('R');
            add('R');
            add('B');
            add('B');
        }};
        listOfGuesses.add(firstGuess);

        String answer = "";
        do {
            answer = Evaluator.evaluateGuess(listOfGuesses.get(listOfGuesses.size()-1), solution);
            Display.displayGuesses(listOfGuesses,solution);

            if (!answer.equals("BBBB")) {
                HashSet<ArrayList<Character>> wrongPatterns = new HashSet<>();

                for (ArrayList<Character> element: solutionsSet) {
                    if (!answer.equals(Evaluator.evaluateGuess(listOfGuesses.get(listOfGuesses.size()-1), element)) ) {
                        wrongPatterns.add(element);
                    }
                }
                solutionsSet.removeAll(wrongPatterns);
                listOfGuesses.add(nextGuess(solutionsSet));
            }
        } while (!answer.equals("BBBB"));
    }

    public static HashSet<ArrayList<Character>> generateFullSet() {
        /*
        It generates all possibele variatioons of peg patterns.
        Returns them in a HashSet<ArrayList<Characters>> format,
        where characters could be upper case 'R' 'G' 'B' 'Y' 'C' 'P'
         */
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

    public static ArrayList<Character> nextGuess(HashSet<ArrayList<Character>> solutionsList) {
        /*
        Picks a random element of all possible solutions, for the next guess.
        Input: HashSet<ArrayList<Character>> e.g. [[C, G, P, Y], [G, G, C, P], [C, G, P, G]]
        Return: ArrayList<Character> e.g.[C, G, P, Y]
         */
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(solutionsList.size());
        int i = 0;
        for (ArrayList<Character>element:solutionsList) {
            if (i==randomIndex) {
                return element;
            } else{
                i++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Character> tempSolution = new ArrayList<>();
        tempSolution.add('C');
        tempSolution.add('P');
        tempSolution.add('C');
        tempSolution.add('G');

        aiGuess(tempSolution);
    }
}
