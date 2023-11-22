package pl.piwowarski.cloudschool.enums;

public enum GradeWeight {

    ONE(1),
    TWO(2),
    THREE(3);

    private final int gradeWeight;

    public int getGradeWeight() {
        return gradeWeight;
    }

    GradeWeight(int gradeWeight) {
        this.gradeWeight = gradeWeight;
    }
}
