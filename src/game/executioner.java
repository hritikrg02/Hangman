package game;

/**
 * Provides the state of the executioner role.
 */
public class executioner {
    private final String guessWord;

    public executioner(String word) {
        guessWord = word;
    }

    public String getGuessWord() {
        return this.guessWord;
    }
}
