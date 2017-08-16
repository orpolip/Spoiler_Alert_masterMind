package com.spoiler_alert;

import java.util.ArrayList;

public class Evaluator {

    public static String evaluateGuess(ArrayList<Character> guessReference, ArrayList<Character> solutionReference) {
        /*
        Compares a list of guesses to the solution and returns an evaluation.
        Black 'peg' for full hits (right color right place),
        White 'peg' for a partial hit (right color wrong place)
        '-' to fill up misses.
        guess & solutionReference: ArrayLists of color name initials as characters
        Returns a string with 4 characters as an evaluation.
        */
        ArrayList<Character> guessClone = new ArrayList<>(guessReference);
        ArrayList<Character> solutionClone = new ArrayList<>(solutionReference); // Clone them so the originals stay intact
        String eval = "";

        for (int i = 0; i < guessReference.size(); i++) {  // Find all the full hits first
            if (guessClone.get(i) == solutionClone.get(i)) {
                eval += "B";
                guessClone.set(i, null);
                solutionClone.set(i, null); // to get them out of the way on later iterations
            }
        }

        for (int i = 0; i < guessReference.size(); i++) { // Then the partial hits

            Character currentGuess = guessClone.get(i);

            if (currentGuess != null) {  // Only check the ones that haven't been evaluated yet
                int indexInSolution = solutionClone.indexOf(currentGuess);

                if (indexInSolution != -1) {  // If it's contained in the solution elsewhere, it's a partial hit
                    eval += "W";
                    solutionClone.set(indexInSolution, null);
                }
            }
        }

        while (eval.length() < 4) { eval += "-"; } // Fill up the rest with -'s
        return eval;
    }
}
