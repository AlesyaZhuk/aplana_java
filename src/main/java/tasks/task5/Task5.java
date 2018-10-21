/**
 * Есть входной файл с набором слов, написанных через пробел
 * Необходимо:
 * Прочитать слова из файла.
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле.
 * Вывести статистику на консоль
 * Найти слово с максимальным количеством повторений.
 * Вывести на консоль это слово и сколько раз оно встречается в
 * файле
 *
 * @see tasks.task5.WordComparator was created exclusively for this task in order to simplify it.
 */
package tasks.task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        String pathDef = "C:\\input.txt";
        Scanner scanner0 = new Scanner(System.in);
        System.out.println("enter file path\n0 - default path");
        String path = scanner0.next();
        if (path.equals("0"))
            path = pathDef;

        File file=new File(path);
        try {
            Scanner scanner = new Scanner(file);
            SortedSet<Word> words = new TreeSet<Word>(new WordComparator());
            while (scanner.hasNext()) {
                String word = scanner.useDelimiter("\\s+").next();
                words.add(new Word(word));
            }
            System.out.println(words);
            int maxCount = 0;
            String mawWord = "";
            for (Word w : words) {
                if (w.count > maxCount) {
                    mawWord = w.word;
                    maxCount = w.count;
                }
            }
            System.out.printf("the largest number of uses: %s\t%d", mawWord, maxCount);
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
