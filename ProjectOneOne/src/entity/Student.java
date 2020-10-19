package entity;

public class Student {
    private String name;
    private int age;
    private double JavaScore;
    private int BirthYear;
    private int BirthMonth;
    private int BirthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getJavaScore() {
        return JavaScore;
    }

    public void setJavaScore(double javaScore) {
        JavaScore = javaScore;
    }

    public int getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(int birthYear) {
        BirthYear = birthYear;
    }

    public int getBirthMonth() {
        return BirthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        BirthMonth = birthMonth;
    }

    public int getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(int birthDay) {
        BirthDay = birthDay;
    }
}