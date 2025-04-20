package FlamyMap.com.pwflamy.tasks.booloperation.task1;

class Tests {

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 75, true, false, false);    // по оценке
        Student s2 = new Student("Bob", 50, true, true, false);       // по honors
        Student s3 = new Student("Clara", 55, true, false, true);     // по справке
        Student s4 = new Student("David", 40, true, false, false);    // не допущен
        Student s5 = new Student("Eva", 85, false, true, true);       // нет ID → не допущена

        System.out.println("=== Проверка с логическими операциями ===");
        test(s1, true, 2, true, 4);
        test(s2, true, 3,true, 4);
        test(s3, true, 4, true, 4);
        test(s4, false, 4, false, 4);
        test(s5, false, 1, false, 4);
    }

    private static void test(Student student,
                             boolean expectedShort,
                             int expectedShortAmount,
                             boolean expectedBitwise,
                             int expectedBitwiseAmount) {
        StudentChecker studentChecker = new StudentChecker();
        boolean resultShort = studentChecker.isAllowedWithShortCircuit(student);

        System.out.println("Студент " + student.name + ": ");
        if (resultShort == expectedShort && student.amountInvocations == expectedShortAmount) {
            System.out.println("Метод isAllowedWithShortCircuit: PASSED");
        } else {
            System.out.println("Метод isAllowedWithShortCircuit: FAILED");
            System.out.println("  Expected: " + expectedShort + ", количество вызванных методов - " + expectedShortAmount);
            System.out.println("  Actual:   " + resultShort + ", было вызвано методов - " + student.amountInvocations);
        }

        student.clearMethodInvocations();
        boolean resultBitwise = studentChecker.isAllowedWithBitwise(student);
        if (resultBitwise == expectedBitwise && student.amountInvocations == expectedBitwiseAmount) {
            System.out.println("Метод isAllowedWithBitwise: PASSED");
        } else {
            System.out.println("Метод isAllowedWithShortCircuit: FAILED");
            System.out.println("  Expected: " + expectedBitwise + ", количество вызванных методов - " + expectedBitwiseAmount);
            System.out.println("  Actual:   " + resultBitwise + ", было вызвано методов - " + student.amountInvocations);
        }
        System.out.println("----------------------------");
    }
}
