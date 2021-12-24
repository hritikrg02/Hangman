package roles;

/**
 * Provides the state of the executioner role.
 */
public class Executioner {
    private final String guessWord;

    public Executioner(String word) {
        guessWord = word;
    }

    public String getGuessWord() {
        return this.guessWord;
    }
}
