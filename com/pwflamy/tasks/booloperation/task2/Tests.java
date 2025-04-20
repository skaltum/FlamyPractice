package FlamyMap.com.pwflamy.tasks.booloperation.task2;

public class Tests {

    public static void main(String[] args) {
        System.out.println("=== ТЕСТЫ ДОПУСКА В ЛАБОРАТОРИЮ ===");

        runTest(new Student("Alice", 85, true, true, false, 2, false, false), true);   // OK по оценке и honors
        runTest(new Student("Bob", 70, true, false, true, 2, false, false), true);     // OK по справке и посещаемости
        runTest(new Student("Clara", 70, true, false, true, 4, false, false), false);  // Прогуливает → нет
        runTest(new Student("David", 90, true, false, false, 0, false, false), false); // нет honors → нет
        runTest(new Student("Eva", 60, false, false, false, 0, true, false), true);    // особый доступ
        runTest(new Student("Frank", 88, true, false, false, 1, false, true), false);   // блокируется дисциплиной
        runTest(new Student("Gina", 88, true, true, true, 1, false, true), true);      // дисциплина, но есть справка → OK
    }

    // Метод теста: сравниваем ожидание и результат
    private static void runTest(Student student, boolean expected) {
        LabAccessChecker labAccessChecker = new LabAccessChecker();
        boolean actual = labAccessChecker.hasLabAccess(student);
        if (actual == expected) {
            System.out.println("🧪 Тест " + student.getName() + ": PASSED ✅");
        } else {
            System.out.println("🧪 Тест " + student.getName() + ": FAILED ❌");
        }
    }
}
