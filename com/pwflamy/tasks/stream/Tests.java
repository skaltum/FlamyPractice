package FlamyMap.com.pwflamy.tasks.stream;

import java.util.*;

public class Tests {

    public static void main(String[] args) {
        testTask1();
        testTask2();
        testTask3();
        testTask4();
        testTask5();
        testTask6();
        testTask7();
        testTask7_1();
        testTask8();
        testTask9();
    }

    private static void assertEqual(Object expected, Object actual, String testName) {
        if (Objects.equals(expected, actual)) {
            System.out.println("✅ " + testName + " passed");
        } else {
            System.out.println("❌ " + testName + " failed");
            System.out.println("Expected: " + expected);
            System.out.println("Actual:   " + actual);
        }
    }

    private static void testTask1() {
        List<Integer> expected = Arrays.asList(14, 12, 8, 6);
        List<Integer> actual = StreamApiTask.task1_FilterAndSortEvenNumbers();
        assertEqual(expected, actual, "task1_FilterAndSortEvenNumbers");
    }

    private static void testTask2() {
        List<String> expected = Arrays.asList("LAMBDA", "STREAM", "JAVA", "API");
        List<String> actual = StreamApiTask.task2_UppercaseAndSortByLength();
        assertEqual(expected, actual, "task2_UppercaseAndSortByLength");
    }

    private static void testTask3() {
        Map<Integer, Long> expected = Map.of(3, 4L, 8, 1L, 5, 1L); // 3 → 4 слова, 5 → 1, 8 → 1
        Map<Integer, Long> actual = StreamApiTask.task3_CountWordsByLength();
        assertEqual(expected, actual, "task3_CountWordsByLength");
    }

    private static void testTask4() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> actual = StreamApiTask.task4_FlattenAndDistinct();
        assertEqual(expected, actual, "task4_FlattenAndDistinct");
    }

    private static void testTask5() {
        Map<Character, Long> expected = Map.of(
                'a', 6L, 'b', 1L, 'n', 2L, 'p', 2L, 'l', 1L, 'e', 1L, 'v', 1L, 'o', 2L, 'c', 1L, 'd', 1L
        );
        Map<Character, Long> actual = StreamApiTask.task5_CharacterFrequency();
        assertEqual(expected, actual, "task5_CharacterFrequency");
    }

    private static void testTask6() {
        int expected = 15;
        int actual = StreamApiTask.task6_SumWithPeekLogging();
        assertEqual(expected, actual, "task6_SumWithPeekLogging");
    }

    private static void testTask7() {
        String expected = "apple,banana,cherry";
        String actual = StreamApiTask.task7_CustomCollectorToString();
        assertEqual(expected, actual, "task7_CustomCollectorToString");
    }

    private static void testTask7_1() {
        String expected = "apple,banana,cherry";
        String actual = StreamApiTask.task7_1_CustomCollectorToString();
        assertEqual(expected, actual, "task7_CustomCollectorToString");
    }

    private static void testTask8() {
        Optional<String> expected = Optional.of("collector");
        Optional<String> actual = StreamApiTask.task8_FindLongestWord();
        assertEqual(expected, actual, "task9_FindLongestWord");
    }

    private static void testTask9() {
        List<String> expected = Arrays.asList("three", "four", "five");
        List<String> actual = StreamApiTask.task9_CombineAndLimitStrings();
        assertEqual(expected, actual, "task10_CombineAndLimitStrings");
    }
}
