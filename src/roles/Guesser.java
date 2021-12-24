package roles;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Provides the state of the guesser role.
 */
public class Guesser {

    protected final static ArrayList<Character> ALPHABET = new ArrayList<>(Arrays.asList(
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z'
    ));

    protected ArrayList<Character> remainingLetters;
    protected int numGuessed;

    public Guesser() {
        this.remainingLetters = new ArrayList<>(ALPHABET);
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
