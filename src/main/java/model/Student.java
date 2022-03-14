package model;

public class Student {

    private String fullName;
    private String specialty;
    private Integer gpaScore;

    public Student() {
    }

    public Student(String fullName, String specialty, Integer gpaScore) {
        this.fullName = fullName;
        this.specialty = specialty;
        this.gpaScore = gpaScore;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getGpaScore() {
        return gpaScore;
    }

    public void setGpaScore(Integer gpaScore) {
        this.gpaScore = gpaScore;
    }

    @Override public String toString() {
        return "\n\tStudent{" + "fullName='" + fullName + '\'' + ", specialty='" + specialty + '\'' + ", gpaScore="
                + gpaScore + '}';
    }
}
