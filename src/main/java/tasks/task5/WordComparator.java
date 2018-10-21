package tasks.task5;

import java.lang.ref.Reference;
import java.util.Comparator;

public class WordComparator implements Comparator<Word> {
    public int compare(Word a, Word b) {
        if (a.word.equals(b.word))
            ++b.count;
        return a.word.compareTo(b.word);
    }
}