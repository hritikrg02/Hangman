package game;

import ai.*;
import resources.Utils;

/**
 * Provides the hangman game implementation.
 */
public class HangmanGame {

    public static int CONST = 70;

    //TODO create fields to hold values like average, total number of guesses, hardest word, etc.

    //TODO create functions for each implementation of guesser algorithm

    //TODO create function for executioner to select a word

    public static void main(String[] args) throws Exception {
        Utils.generateFreqFile(Utils.PATH);
    }
}
