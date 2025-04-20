package FlamyMap.com.pwflamy.tasks.booloperation.task1;

class Student {

    String name;
    int grade;
    boolean hasID;
    boolean isHonorsStudent;
    boolean hasMedicalNote;
    int amountInvocations;

    Student(String name, int grade, boolean hasID, boolean isHonorsStudent, boolean hasMedicalNote) {
        this.name = name;
        this.grade = grade;
        this.hasID = hasID;
        this.isHonorsStudent = isHonorsStudent;
        this.hasMedicalNote = hasMedicalNote;
    }

    void clearMethodInvocations() {
        amountInvocations = 0;
    }

    boolean hasID() {
        amountInvocations++;
        return hasID;
    }

    boolean hasPassingGrade() {
        amountInvocations++;
        return grade >= 60;
    }

    boolean isHonors() {
        amountInvocations++;
        return isHonorsStudent;
    }

    boolean hasMedicalNote() {
        amountInvocations++;
        return hasMedicalNote;
    }
}
