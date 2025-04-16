package FlamyMap.com.pwflamy.tasks.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Tests {

    public static void main(String[] args) {
        List<User> users = createUsers();
        UserRepository userRepository = new UserRepository(users);

        testUserWithAddressAndPostalCode(userRepository);
        testUserWithAddressWithoutPostalCode(userRepository);
        testUserWithoutAddress(userRepository);
        testUserNotFound(userRepository);
    }

    private static void testUserWithAddressAndPostalCode(UserRepository repo) {
        String result = repo.getUserAddressInfo("Анна");
        String expected = "Пользователь Анна живёт в Москва, индекс: 101000";
        printTestResult("testUserWithAddressAndPostalCode", result, expected);
    }

    private static void testUserWithAddressWithoutPostalCode(UserRepository repo) {
        String result = repo.getUserAddressInfo("Иван");
        String expected = "Пользователь Иван живёт в Санкт-Петербург, индекс неизвестен";
        printTestResult("testUserWithAddressWithoutPostalCode", result, expected);
    }

    private static void testUserWithoutAddress(UserRepository repo) {
        String result = repo.getUserAddressInfo("Мария");
        String expected = "У пользователя Мария нет адреса";
        printTestResult("testUserWithoutAddress", result, expected);
    }

    private static void testUserNotFound(UserRepository repo) {
        String result = repo.getUserAddressInfo("Пётр");
        String expected = "Пользователь с именем Пётр не найден";
        printTestResult("testUserNotFound", result, expected);
    }

    private static void printTestResult(String testName, String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println(testName + ": PASSED");
        } else {
            System.out.println(testName + ": FAILED");
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual:   " + actual);
        }
    }

    private static List<User> createUsers() {
        // Анна: есть адрес с индексом
        Address addressAnna = new Address("Москва", Optional.of("101000"));
        User anna = new User("Анна", Optional.of(addressAnna));

        // Иван: есть адрес без индекса
        Address addressIvan = new Address("Санкт-Петербург", Optional.empty());
        User ivan = new User("Иван", Optional.of(addressIvan));

        // Мария: нет адреса
        User maria = new User("Мария", Optional.empty());

        List<User> users = new ArrayList<>();
        users.add(anna);
        users.add(ivan);
        users.add(maria);
        return users;
    }
}
