package FlamyMap.com.pwflamy.tasks.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static FlamyMap.com.pwflamy.tasks.stream.StringJoinCollector.StringJoinNow;
import static java.util.Comparator.comparingInt;

public class StreamApiTask {

    /**
     * Задание 1: Фильтрация и сортировка чисел.
     *
     * Получить из списка только чётные числа, отсортировать по убыванию
     * и собрать в новый список.
     */
    public static List<Integer> task1_FilterAndSortEvenNumbers() {
        List<Integer> numbers = Arrays.asList(5, 12, 3, 8, 7, 14, 6);
        return numbers.stream()
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    /**
     * Задание 2: Преобразование строк.
     * <p>
     * Преобразовать список строк в верхний регистр и отсортировать по длине строки.
     */
    public static List<String> task2_UppercaseAndSortByLength() {
        List<String> words = Arrays.asList("java", "stream", "api", "lambda");
        return words.stream()
                .map(String::toUpperCase)
                .sorted(Comparator
                        .comparingInt(String::length).reversed()
                        .thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
//        return words.stream()
//                .map(String::toUpperCase)
//                .sorted(Comparator.comparingInt(String::length).reversed())
//                .collect(Collectors.toList());
    }

    /**
     * Задание 3: Подсчёт слов по длине.
     * <p>
     * Подсчитать, сколько слов каждой длины содержится в списке.
     */
    public static Map<Integer, Long> task3_CountWordsByLength() {
        List<String> words = Arrays.asList("cat", "dog", "elephant", "tiger", "rat", "bat");
        return words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.counting()
                ));
    }

    /**
     * Задание 4: Обработка списка списков.
     * <p>
     * Собрать из вложенных списков один список всех уникальных чисел.
     */
    public static List<Integer> task4_FlattenAndDistinct() {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 4, 5),
                Arrays.asList(5, 6, 7)
        );
        return listOfLists.stream()
                .flatMap(List::stream)
                .distinct()
                .collect((Collectors.toList()));
    }

    /**
     * Задание 5: Частота символов.
     * <p>
     * Подсчитать частоту каждой буквы во всех словах списка, игнорируя регистр.
     */
    public static Map<Character, Long> task5_CharacterFrequency() {
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado");
        return words.stream()
                .map(String::toLowerCase)
                .flatMapToInt(String::chars)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));
    }

    /**
     * Задание 6: Сумма с подробным логом.
     * <p>
     * Просуммировать список чисел, одновременно печатая каждый шаг сложения.
     */
    public static int task6_SumWithPeekLogging() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        return numbers.stream()
                .peek(num -> System.out.println("Текущее значение" + num))
                .reduce(0, Integer::sum);
    }

    /**
     * Задание 7: Пользовательский Collector.
     * <p>
     * Собрать строки в один String, разделённый запятыми, но без последней запятой.
     * Использовать собственный Collector.
     */
    public static String task7_CustomCollectorToString() {
        List<String> items = Arrays.asList("apple", "banana", "cherry");
        return items.stream()
                .collect(StringJoinNow());
    }

    /**
     * Задание 7.1: Не Пользовательский Collector.
     * <p>
     * Собрать строки в один String, разделённый запятыми, но без последней запятой.
     * Использовать один из существующих Collector.
     */
    public static String task7_1_CustomCollectorToString() {
        List<String> items = Arrays.asList("apple", "banana", "cherry");
        return String.join(",", items);
    }

    /**
     * Задание 8: Поиск самого длинного слова.
     * <p>
     * Найти самое длинное слово в списке, используя Optional.
     */
    public static Optional<String> task8_FindLongestWord() {
        List<String> words = Arrays.asList("stream", "lambda", "optional", "collector");
        return words.stream()
                .max(comparingInt(String::length));
    }

    /**
     * Задание 9: Комбинирование стримов.
     * <p>
     * Объединить два списка строк, удалить дубликаты, пропустить первые 2 элемента
     * и взять следующие 3.
     */
    public static List<String> task9_CombineAndLimitStrings() {
        List<String> list1 = Arrays.asList("one", "two", "three", "four");
        List<String> list2 = Arrays.asList("three", "four", "five", "six");
        return Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());
    }
}
