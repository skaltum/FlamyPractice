package FlamyMap.com.pwflamy.tasks.booloperation.task2;

/**
 * Реализуй метод hasLabAccess согласно описанию.
 * Ограничения:
 * 1) Метод не должен использовать if или тернарный оператор;
 * 2) Метод должен иметь только один return.
 */
class LabAccessChecker {

    /**
     * Проверяет, имеет ли студент доступ к защищённой лаборатории.
     *
     * <p><b>Условие допуска:</b></p>
     * Студент допускается, если выполнено одно из следующих условий:
     * <ul>
     *   <li>У него есть действующий <b>ID</b> <i>и</i> выполнено одно из:
     *     <ul>
     *       <li>Оценка выше <b>80</b> и он является <b>honors-студентом</b></li>
     *       <li>Есть <b>медицинская справка</b> и количество <b>пропущенных занятий ≤ 3</b></li>
     *     </ul>
     *   </li>
     *   <li>ИЛИ у него есть <b>особое разрешение</b> на доступ</li>
     * </ul>
     *
     * <p><b>Ограничение:</b></p>
     * Даже если выполняется одно из условий выше, студент <b>не допускается</b>,
     * если одновременно соблюдаются все три условия:
     * <ul>
     *   <li>У него есть <b>дисциплинарное замечание</b></li>
     *   <li>У него <b>нет медицинской справки</b></li>
     *   <li>И он <b>не является honors-студентом</b></li>
     * </ul>
     *
     * <p><b>Примеры:</b></p>
     * <ul>
     *   <li>✅ Студент с ID, оценкой 90 и статусом honors — допущен</li>
     *   <li>✅ Студент с ID и справкой при ≤3 пропущенных занятиях — допущен</li>
     *   <li>✅ Студент без ID, но с особым разрешением — допущен</li>
     *   <li>❌ Студент с ID и оценкой, но с замечанием и без справки и honors — не допущен</li>
     * </ul>
     *
     *
     */
    public boolean hasLabAccess(Student student) {
        return (student.isHasID() &&
                ((student.getGrade() > 80 && student.isHonorsStudent()) ||
                        student.isHasMedicalNote() && student.getMissedClasses() <= 3) ||
                student.isHasSpecialPermission())
                && !(student.isHasDisciplinaryNotice() && !student.isHasMedicalNote() && !student.isHonorsStudent());
    }
}
