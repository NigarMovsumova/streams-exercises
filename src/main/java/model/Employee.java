package model;

public class Employee {

    private String fullName;
    private String title;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override public String toString() {
        return "\n\tEmployee{" + "fullName='" + fullName + '\'' + ", title='" + title + '\'' + "}";
    }
}
