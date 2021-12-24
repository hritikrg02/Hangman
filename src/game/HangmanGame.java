package game;

import ai.*;

/**
 * Provides the hangman game implementation.
 */
public class HangmanGame {

    //TODO create fields to hold values like average, total number of guesses, hardest word, etc.

    //TODO create functions for each implementation of guesser algorithm

    //TODO create function for executioner to select a word

    public static void main(String[] args) throws Exception {
        RandomAI randomAI = new RandomAI();
        char c = randomAI.guessLetter();
        System.out.println(c);
        System.out.println(randomAI.getRemainingLetters());
    }
}
