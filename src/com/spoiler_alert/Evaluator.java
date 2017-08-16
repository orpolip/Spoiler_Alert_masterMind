package com.spoiler_alert;

import java.util.ArrayList;

public class Evaluator {

    public static String evaluateGuess(ArrayList<Character> guess, ArrayList<Character> solutionReference) {
        /*
        Compares a list of guesses to the solution and returns an evaluation.
        Black 'peg' for full hits (right color right place),
        White 'peg' for a partial hit (right color wrong place)
        '-' to fill up misses.
        guess & solutionReference: ArrayLists of color name initials as characters
        Returns a string with 4 characters as an evaluation.
        */
        ArrayList<Character> solutionClone = new ArrayList<>(solutionReference); // Clone it so the original stays intact
        String eval = "";

        for (int i = 0; i < guess.size(); i++) {
            if (guess.get(i) == solutionClone.get(i)) { // if items @ i index match, it's a black (full hit)
                eval += "B";
            }
            else {
                int indexInSolution = solutionClone.indexOf(guess.get(i));
                if (indexInSolution != -1) { // if it's not a black, but it's in the solution elsewhere, it's a white
                    eval += "W";
                    solutionClone.set(indexInSolution, null); // to get it out of the way on later iterations
                }
            }
        }

        while (eval.length() < 4) { eval += "-"; }
        return eval;
    }
}
