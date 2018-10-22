import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFile {

    //Читает массив слов из файла для дальнейшей работы с ним. Сортирует массив в алфавитном порядке
    public static List<String> getArray() {
        List<String> words = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File(Solution.PATH), "windows-1251");
            while (scanner.hasNext()) {
                String word = scanner.useDelimiter("\\s+").next();
                words.add(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
        Collections.sort(words);
        return words;

    }

    // Выводит на экран полученный массив
    public static void showArray() {
        for (String f : ReadFile.getArray()) {
            System.out.println(f);
        }
    }
}
