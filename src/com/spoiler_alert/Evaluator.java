package com.spoiler_alert;

import java.util.ArrayList;

public class Evaluator {

    public static String evaluateGuess(ArrayList<Character> guess, ArrayList<Character> solution) {
        String eval = "";
        for (int i = 0; i < guess.size(); i++) {
            if (solution.get(i) == guess.get(i)) {
                eval += "B";
            } else {
                int indexInSolution = solution.indexOf(guess.get(i));
                if (indexInSolution != -1) {
                    eval += "W";
                    solution.set(indexInSolution, null);
                }
            }
        }

        while (eval.length() < 4) { eval += "-"; }
        return eval;
    }
}
