

public class Solution {
    public static final String PATH = "c:\\tasks\\Task3\\data.txt"; //Сделано исключительно для удобства проверки!

    public static void main(String[] args) {

        //Всего в коде 4 метода. 2 у FileInfo и 2 у Readfile

        ReadFile.showArray(); // Вывод слов из файла в консоль. Сортировка выполнена
        FileInfo.showRepeats(); // Вывод количества повторений в консоль
        FileInfo.mostRepeated(); // Вывод слова с максимальным числом повторов

    }
}
