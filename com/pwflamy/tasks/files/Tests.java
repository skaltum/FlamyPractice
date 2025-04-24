package FlamyMap.com.pwflamy.tasks.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

/**
 * При правильной реализации ByteFileManager и TextFileManager main должен выполнится без ошибок и выводом корректного
 * сообщения в консоль.
 */
public class Tests {

    public static void main(String[] args) {
        testTextFileManager();
        testCombineByteArrays();
        testByteFileManager();
    }

    private static void testCombineByteArrays() {
        testMerge(new byte[]{1, 3, 5}, new byte[]{2, 4, 6}, "1 2 3 4 5 6");
        testMerge(new byte[]{1, 3}, new byte[]{2, 4, 6, 8}, "1 2 3 4 6 8");
        testMerge(new byte[]{1, 3, 5, 7}, new byte[]{2}, "1 2 3 5 7");
        testMerge(new byte[]{}, new byte[]{9, 10}, "9 10");
        testMerge(new byte[]{7, 8}, new byte[]{}, "7 8");
        testMerge(new byte[]{}, new byte[]{}, "");
    }

    private static void testTextFileManager() {
        TextFileManager textFileManager = new TextFileManager();
        List<String> strings = textFileManager.readTextFromFile("input.txt");
        strings = strings.stream()
                .map(String::toUpperCase)
                .toList();
        textFileManager.writeTextToFile("output.txt", strings);

        List<String> result;
        try {
            result = Files.readAllLines(Path.of("output.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> expected = List.of("WOW, SUCH JAVA, SUCH CODE, WOW WOW", "BIG BLACK JAVA", "JAVA OLD");
        if (!expected.equals(result)) {
            throw new RuntimeException("Ошибка при проверке файла output.txt - TextFileManager реализован неверно!");
        }
    }

    private static void testByteFileManager() {
        byte[] magicBytes = new byte[]{83, 78, 83, 83, 76};
        ByteFileManager byteFileManager = new ByteFileManager();
        byte[] bytes = byteFileManager.readAllBytesFromFile("magicfile.wow");
        byte[] result = byteFileManager.combineByteArrays(magicBytes, bytes);
        byteFileManager.writeBytesToFile("result.wow", result);

        byte[] test;
        try {
            test = Files.readAllBytes(Path.of("result.wow"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        byte[] expected = new byte[] {83, 73, 78, 45, 83, 79, 83, 65, 76, 63};
        if (!Arrays.equals(expected, test)) {
            throw new RuntimeException("Ошибка при проверке файла result.wow - ByteFileManager реализован неверно!");
        }
        System.out.println(new String(test, StandardCharsets.US_ASCII));
    }

    private static void testMerge(byte[] a, byte[] b, String expectedOutput) {
        ByteFileManager byteFileManager = new ByteFileManager();
        byte[] result = byteFileManager.combineByteArrays(a, b);
        StringBuilder sb = new StringBuilder();
        for (byte val : result) {
            sb.append(val).append(" ");
        }
        String resultStr = sb.toString().trim();

        if (!resultStr.equals(expectedOutput)) {
            System.out.println("❌ Test failed");
            System.out.println("Expected: " + expectedOutput);
            System.out.println("Actual:   " + resultStr);
        }
    }
}
