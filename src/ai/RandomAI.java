package ai;

import resources.Utils;
import roles.Guesser;

import java.util.*;

/**
 * AI that will randomly guess letters
 */
public class RandomAI extends Guesser {

    public RandomAI() {
        super();
    }

    public char guessLetter() throws Exception {
        Random r = new Random();
        OptionalInt o = r.ints(0, this.remainingLetters.size()).findFirst();

        if (o.isEmpty()) {
            throw new Exception("error: no more letters to guess");
        }

        int letterIndex = o.getAsInt();
        char guessedLetter = this.remainingLetters.get(letterIndex);
        return super.guessLetter(guessedLetter);
    }
}
