package FlamyMap.com.pwflamy.tasks.booloperation.task2;

class Student {
    private String name;
    private int grade;
    private boolean hasID;
    private boolean isHonorsStudent;
    private boolean hasMedicalNote;
    private int missedClasses;
    private boolean hasSpecialPermission;
    private boolean hasDisciplinaryNotice;

    Student(String name, int grade, boolean hasID, boolean isHonorsStudent,
            boolean hasMedicalNote, int missedClasses,
            boolean hasSpecialPermission, boolean hasDisciplinaryNotice) {
        this.name = name;
        this.grade = grade;
        this.hasID = hasID;
        this.isHonorsStudent = isHonorsStudent;
        this.hasMedicalNote = hasMedicalNote;
        this.missedClasses = missedClasses;
        this.hasSpecialPermission = hasSpecialPermission;
        this.hasDisciplinaryNotice = hasDisciplinaryNotice;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public boolean isHasID() {
        return hasID;
    }

    public boolean isHonorsStudent() {
        return isHonorsStudent;
    }

    public boolean isHasMedicalNote() {
        return hasMedicalNote;
    }

    public int getMissedClasses() {
        return missedClasses;
    }

    public boolean isHasSpecialPermission() {
        return hasSpecialPermission;
    }

    public boolean isHasDisciplinaryNotice() {
        return hasDisciplinaryNotice;
    }
}
