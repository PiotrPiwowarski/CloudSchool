package pl.piwowarski.cloudschool.enums;

public enum GradeValue {

    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6);

    private final int gradeValue;

    public int getGradeValue() {
        return gradeValue;
    }

    GradeValue(int gradeValue) {
        this.gradeValue = gradeValue;
    }
}
