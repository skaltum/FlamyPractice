package FlamyMap.com.pwflamy.tasks.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StreamApiTask {

    /**
     * Задание 1: Фильтрация и сортировка чисел.
     *
     * Получить из списка только чётные числа, отсортировать по убыванию
     * и собрать в новый список.
     */
    public static List<Integer> task1_FilterAndSortEvenNumbers() {
        List<Integer> numbers = Arrays.asList(5, 12, 3, 8, 7, 14, 6);
        return null;
    }

    /**
     * Задание 2: Преобразование строк.
     *
     * Преобразовать список строк в верхний регистр и отсортировать по длине строки.
     */
    public static List<String> task2_UppercaseAndSortByLength() {
        List<String> words = Arrays.asList("java", "stream", "api", "lambda");
        return null;
    }

    /**
     * Задание 3: Подсчёт слов по длине.
     *
     * Подсчитать, сколько слов каждой длины содержится в списке.
     */
    public static Map<Integer, Long> task3_CountWordsByLength() {
        List<String> words = Arrays.asList("cat", "dog", "elephant", "tiger", "rat", "bat");
        return null;
    }

    /**
     * Задание 4: Обработка списка списков.
     *
     * Собрать из вложенных списков один список всех уникальных чисел.
     */
    public static List<Integer> task4_FlattenAndDistinct() {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 4, 5),
                Arrays.asList(5, 6, 7)
        );
        return null;
    }

    /**
     * Задание 5: Частота символов.
     *
     * Подсчитать частоту каждой буквы во всех словах списка, игнорируя регистр.
     */
    public static Map<Character, Long> task5_CharacterFrequency() {
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado");
        return null;
    }

    /**
     * Задание 6: Сумма с подробным логом.
     *
     * Просуммировать список чисел, одновременно печатая каждый шаг сложения.
     */
    public static int task6_SumWithPeekLogging() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        return 0;
    }

    /**
     * Задание 7: Пользовательский Collector.
     *
     * Собрать строки в один String, разделённый запятыми, но без последней запятой.
     * Использовать собственный Collector.
     */
    public static String task7_CustomCollectorToString() {
        List<String> items = Arrays.asList("apple", "banana", "cherry");
        return null;
    }

    /**
     * Задание 7.1: Не Пользовательский Collector.
     *
     * Собрать строки в один String, разделённый запятыми, но без последней запятой.
     * Использовать один из существующих Collector.
     */
    public static String task7_1_CustomCollectorToString() {
        List<String> items = Arrays.asList("apple", "banana", "cherry");
        return null;
    }

    /**
     * Задание 8: Поиск самого длинного слова.
     *
     * Найти самое длинное слово в списке, используя Optional.
     */
    public static Optional<String> task8_FindLongestWord() {
        List<String> words = Arrays.asList("stream", "lambda", "optional", "collector");
        return Optional.empty();
    }

    /**
     * Задание 9: Комбинирование стримов.
     *
     * Объединить два списка строк, удалить дубликаты, пропустить первые 2 элемента
     * и взять следующие 3.
     */
    public static List<String> task9_CombineAndLimitStrings() {
        List<String> list1 = Arrays.asList("one", "two", "three", "four");
        List<String> list2 = Arrays.asList("three", "four", "five", "six");
        return null;
    }
}
