package roles;

import resources.Utils;

import java.util.ArrayList;

/**
 * Provides the state of the guesser role.
 */
public class Guesser {

    protected ArrayList<Character> remainingLetters;
    protected int numGuessed;

    public Guesser() {
        this.remainingLetters = new ArrayList<>(Utils.ALPHABET);
        this.numGuessed = 0;
    }

    public char guessLetter(char letter) {
        this.remainingLetters.remove(Character.valueOf(letter));
        this.numGuessed++;
        return letter;
    }

    public ArrayList<Character> getRemainingLetters() {
        return this.remainingLetters;
    }

    public int getNumGuessed() {
        return this.numGuessed;
    }
}
