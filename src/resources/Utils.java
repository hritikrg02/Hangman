package resources;

import java.io.*;
import java.util.*;

/**
 * Defines utility variables, functions, and classes
 */
public class Utils {
    public final static String PATH = "src/resources/words_alpha.txt";
    public final static ArrayList<Character> ALPHABET = new ArrayList<>(Arrays.asList(
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z'
    ));

    private static class Letter implements Comparable<Letter> {
        private final char value;
        private int freq;

        public Letter(char value) {
            this.value = value;
            this.freq = 0;
        }

        @Override
        public String toString() {
            return value + " : " + freq;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }

        @Override
        public int compareTo(Letter other) {
            int result = other.freq - this.freq;
            if (result == 0) {
                result = other.value - this.value;
            }
            return result;
        }
    }

    private static class LetterComparator implements Comparator<Letter> {
        @Override
        public int compare(Letter l1, Letter l2) {
            return l1.compareTo(l2);
        }
    }

    private static ArrayList<Letter> makeEmptyLetterList() {
        ArrayList<Letter> letters = new ArrayList<>();
        for (char c : ALPHABET) {
            Letter letter = new Letter(c);
            letters.add(letter);
        }
        return letters;
    }

    private static ArrayList<Letter> generateFreqList(String wordsFile) throws IOException {
        ArrayList<Letter> freqList = makeEmptyLetterList();
        Scanner in = new Scanner(new File(wordsFile));

        while (in.hasNext()) {
            String current = in.next().toUpperCase();
            char[] foundChars = current.toCharArray();
            for (char c : foundChars) {
                int charIndex = ALPHABET.indexOf(c);
                freqList.get(charIndex).freq++;
            }
        }

        freqList.sort(new LetterComparator());
        return freqList;
    }

    public static void generateFreqFile(String wordsFile) throws IOException {
        File freqFile = new File("src/resources/freq.txt");
        if (freqFile.createNewFile()) {
            System.out.println("New frequency file created");
        } else {
            freqFile.delete();
            freqFile.createNewFile();
            System.out.println("Old frequency file overwritten");
        }

        FileWriter fw = new FileWriter(freqFile);
        ArrayList<Letter> freqList = generateFreqList(wordsFile);
        System.out.println(freqList);

        for (Letter l : freqList) {
            fw.write(l.value);
            fw.write(" ");
        }

        fw.close();
    }
}
