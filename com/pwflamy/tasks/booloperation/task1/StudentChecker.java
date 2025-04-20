package FlamyMap.com.pwflamy.tasks.booloperation.task1;

/**
 * Изучи логические операторы &&, || и !, а так же отличия && от & и || от |.
 * Отрефактори методы isAllowedWithShortCircuit и isAllowedWithBitwise и запусти Tests - все тесты должны пройти успешно.
 */
class StudentChecker {

    /**
     * Упростите метод isAllowedWithShortCircuit, сохранив его логику.
     * Метод должен возвращать результат с помощью одного оператора return и логического выражения,
     * без использования вложенных условных операторов if.
     * Тело метода должно состоять из одной команды return с необходимым выражением. Очередность вызовов должна быть
     * такой же, как в оригинальном описании (то есть метод hasId() должен вызываться перед hasPassingGrade() и т.д.).
     * Данный метод должен вызывать минимально необходимое количество методов для определения результата.
     */
    public boolean isAllowedWithShortCircuit(Student student) {
        boolean hasId = student.hasID();
        if (hasId) {
            if (student.hasPassingGrade()) {
                return true;
            }
        }
        if (hasId) {
            if (student.isHonors()) {
                return true;
            }
        }
        if (hasId) {
            if (student.hasMedicalNote()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Упростите метод isAllowedWithShortCircuit, сохранив его логику.
     * Метод должен возвращать результат с помощью одного оператора return и логического выражения,
     * без использования вложенных условных операторов if.
     * Тело метода должно состоять из одной команды return с необходимым выражением.
     * Данный метод должен вызывать все методы для определения результата, независимо от их результата.
     */
    public boolean isAllowedWithBitwise(Student student) {
        boolean hasID = student.hasID();
        boolean hasPassingGrade = student.hasPassingGrade();
        boolean isHonors = student.isHonors();
        boolean hasMedicalNote = student.hasMedicalNote();
        if (hasID) {
            if (hasPassingGrade) {
                return true;
            }
        }
        if (hasID) {
            if (isHonors) {
                return true;
            }
        }
        if (hasID) {
            if (hasMedicalNote) {
                return true;
            }
        }
        return false;
    }
}
