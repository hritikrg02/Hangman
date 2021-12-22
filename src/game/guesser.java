package game;

import java.util.ArrayList;

/**
 * Provides the state of the guesser role.
 */
public class guesser {
    private ArrayList<Character> guessedLetters;
    private int numGuessed;

    public guesser() {
        this.guessedLetters = new ArrayList<>();
        this.numGuessed = 0;
    }

    public void guessLetter(char letter) {
        this.guessedLetters.add(letter);
        this.numGuessed++;
    }

    public ArrayList<Character> getGuessedLetters() {
        return this.guessedLetters;
    }

    public int getNumGuessed() {
        return this.numGuessed;
    }
}
