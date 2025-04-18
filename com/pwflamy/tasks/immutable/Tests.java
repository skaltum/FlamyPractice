package FlamyMap.com.pwflamy.tasks.immutable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Изучить, что такое иммутабельный объект, чем он характеризуется, как достичь этого и где применяется.
 * Изменить реализацию класса ProbablyImmutableClass таким образом, чтобы он стал иммутабельным.
 */
public class Tests {

    public static void main(String[] args) {
        String id = "abc123";
        int version = 1;
        List<String> originalItems = new ArrayList<>(Arrays.asList("item1", "item2"));

        ProbablyImmutableClass example = new ProbablyImmutableClass(id, version, originalItems);

        // Тест 1: изменение originalItems после создания объекта
        originalItems.add("item3");
        boolean isItemsCopied = !example.getItems().contains("item3");
        printResult("Изменение исходного списка не должно влиять на объект", isItemsCopied);

        // Тест 2: попытка изменить список, полученный через геттер
        List<String> fromGetter = example.getItems();
        fromGetter.add("item4");
        boolean isGetterSafe = !example.getItems().contains("item4");
        printResult("Модификация списка из геттера не должна влиять на объект", isGetterSafe);

        // Тест 3: проверка неизменности id
        boolean isIdImmutable = example.getId().equals("abc123");
        printResult("Поле id должно оставаться неизменным", isIdImmutable);

        // Тест 4: проверка неизменности version
        boolean isVersionImmutable = example.getVersion() == 1;
        printResult("Поле version должно оставаться неизменным", isVersionImmutable);

        // Тест 5: все поля должны быть final
        boolean areFieldsFinal = checkAllFieldsFinal(ProbablyImmutableClass.class);
        printResult("Все поля должны быть final", areFieldsFinal);

        // Тест 6: отсутствие публичных сеттеров
        boolean noSetters = checkNoSetters(ProbablyImmutableClass.class);
        printResult("Класс не должен содержать публичных сеттеров", noSetters);
    }

    private static void printResult(String description, boolean passed) {
        if (passed) {
            System.out.println("[✓] " + description);
        } else {
            System.out.println("[✗] " + description);
        }
    }

    private static boolean checkAllFieldsFinal(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (!Modifier.isFinal(field.getModifiers())) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkNoSetters(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (Modifier.isPublic(method.getModifiers()) &&
                    method.getName().startsWith("set") &&
                    method.getParameterCount() == 1) {
                return false;
            }
        }
        return true;
    }
}
