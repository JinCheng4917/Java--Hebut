package entity;

import java.util.Scanner;

public class MyDate {
    private int MyYear;
    private int MyMonth;
    private int MyDay;
    private boolean yearValidate;


    public int getMyYear() {
        return MyYear;
    }

    public int getMyMonth() {
        return MyMonth;
    }

    public int getMyDay() {
        return MyDay;
    }

    public boolean isYearValidate() {
        return yearValidate;
    }


    public void setMyYear(int myYear) {
        MyYear = myYear;
    }

    public void setMyMonth(int myMonth) {
        MyMonth = myMonth;
    }

    public void setMyDay(int myDay) {
        MyDay = myDay;
    }

    public void setYearValidate(boolean yearValidate) {
        this.yearValidate = yearValidate;
    }

    /**
     * 验证年份是否为闰年
     * @param student
     */
    public void validateYear(Student student){
        //是闰年，返回true
        if (student.getBirthYear()%4 == 0 && student.getBirthYear() % 100 != 0 || student.getBirthYear() % 400 == 0){
           this.setYearValidate(true);
        }
    }

    /**
     * 验证日期是否正确
     * @param status
     * @param student
     * @return
     */
    public Student validateDay(int status, Student student){
        //闰年，status为1  平年为2
        switch (status) {
            case 1: {
                switch (student.getBirthMonth()) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        while (student.getBirthDay() > 31 || student.getBirthDay() <= 0) {
                            System.out.println("日期输入有误，请重新输入该学生出生日期(日)");
                            Scanner newDay = new Scanner(System.in);
                            student.setBirthDay(newDay.nextInt());
                        }
                        break;
                    }
                    case 2: {
                        while (student.getBirthDay() > 29 || student.getBirthDay() <= 0) {
                            System.out.println("日期输入有误，请重新输入该学生出生日期(日)");
                            Scanner newDay = new Scanner(System.in);
                            student.setBirthDay(newDay.nextInt());
                        }
                        break;
                    }
                    case 4:
                    case 6:
                    case 9:
                    case 11: {
                        while (student.getBirthDay() > 30 || student.getBirthDay() <= 0) {
                            System.out.println("日期输入有误，请重新输入该学生出生日期(日)");
                            Scanner newDay = new Scanner(System.in);
                            student.setBirthDay(newDay.nextInt());
                        }
                        break;
                    }
                }
            }
            break;

            case 2: {
                switch (student.getBirthMonth()) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        while (student.getBirthDay() > 31 || student.getBirthDay() <= 0) {
                            System.out.println("日期输入有误，请重新输入该学生出生日期(日)");
                            Scanner newDay = new Scanner(System.in);
                            student.setBirthDay(newDay.nextInt());
                        }
                        break;
                    }
                    case 2: {
                        while (student.getBirthDay() > 28 || student.getBirthDay() <= 0) {
                            System.out.println("日期输入有误，请重新输入该学生出生日期(日)");
                            Scanner newDay = new Scanner(System.in);
                            student.setBirthDay(newDay.nextInt());
                        }
                        break;
                    }
                    case 4:
                    case 6:
                    case 9:
                    case 11: {
                        while (student.getBirthDay() > 30 || student.getBirthDay() <= 0) {
                            System.out.println("日期输入有误，请重新输入该学生出生日期(日)");
                            Scanner newDay = new Scanner(System.in);
                            student.setBirthDay(newDay.nextInt());
                        }
                    }
                }
            }
        }
        return  student;
    }
}
