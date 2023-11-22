package pl.piwowarski.cloudschool.enums;

public enum Year {

    FIRST(1),
    SECOND(2),
    THIRD(3);

    private final int year;

    public int getYear() {
        return year;
    }

    Year(int year) {
        this.year = year;
    }
}
