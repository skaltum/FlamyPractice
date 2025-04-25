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
        //Вызывает ещё меньшее кол-во методов, чем требуется в задании
        //return student.hasID && (student.hasPassingGrade() || student.isHonors() || student.hasMedicalNote);
        return student.hasID() && (student.hasPassingGrade() || student.isHonors() || student.hasMedicalNote());
    }

    /**
     * Упростите метод isAllowedWithShortCircuit, сохранив его логику.
     * Метод должен возвращать результат с помощью одного оператора return и логического выражения,
     * без использования вложенных условных операторов if.
     * Тело метода должно состоять из одной команды return с необходимым выражением.
     * Данный метод должен вызывать все методы для определения результата, независимо от их результата.
     */
    public boolean isAllowedWithBitwise(Student student) {
        return student.hasID() & (student.hasPassingGrade() | student.isHonors() | student.hasMedicalNote());
    }
}
