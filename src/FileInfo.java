import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FileInfo {

    // Показывает количество повторений слов в файле
    public static void showRepeats() {
        Map<String, Integer> treeMap = new TreeMap<>();
        List<String> arr = ReadFile.getArray();
        if (arr.size() > 0) {
            for (String a : arr) {
                Integer count = treeMap.get(a);
                if (count == null) {
                    count = 0;
                }
                treeMap.put(a, ++count);
            }
        } else {
            System.out.println("В метод showRepeats() передан пустой массив");
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + " Количество повторений: "
                    + entry.getValue());
        }
    }

    // Находит слово с наибольшим количеством повторений
    public static void mostRepeated() {
        Map<String, Integer> treeMap = new TreeMap<>();
        List<String> arr = ReadFile.getArray();
        if (arr.size() > 0) {
            for (String a : arr) {
                Integer count = treeMap.get(a);
                if (count == null) {
                    count = 0;
                }
                treeMap.put(a, ++count);
            }
        } else {
            System.out.println("В метод mostRepeated передан пустой массив");
        }

        int count = 0;
        String mostRepeated = "";
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (count < entry.getValue()) {
                count = entry.getValue();
                mostRepeated = entry.getKey();
            }
        }
        if (count == 0 && mostRepeated.equals("")) {
            System.out.println("Массив слов пуст, невозможно найти наиболее повторяющееся");
        } else {
            System.out.println("Слово с максимальным количеством повторений: " +
                    mostRepeated + " Количество повторений: " + count);
        }

    }

}
