package ai;

import roles.Guesser;

import java.util.*;

/**
 * AI that will randomly guess
 */
public class RandomAI extends Guesser {

    public RandomAI() {
        super();
    }

    public char guessLetter(char letter) throws Exception {
        Random r = new Random(Calendar.getInstance().getTimeInMillis());
        OptionalInt o = r.ints(0, this.remainingLetters.size()).findFirst();

        if (o.isEmpty()) {
            throw new Exception("error: no more letters to guess");
        }

        int letterIndex = o.getAsInt();
        char guessedLetter = this.remainingLetters.get(letterIndex);
        return super.guessLetter(guessedLetter);
    }
}
