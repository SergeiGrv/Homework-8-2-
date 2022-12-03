import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    String text;

    protected WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] arr = text.toLowerCase().split("\\P{IsAlphabetic}+");
        Set<String> words = new HashSet<>(Arrays.asList(arr));

        return words.contains(word);
    }
}
