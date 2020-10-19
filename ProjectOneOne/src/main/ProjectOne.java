package main;

import entity.MyDate;
import entity.Student;
import function.FirstGetAverage;
import function.SecondGetAverage;
import function.StudentFunction;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ProjectOne {
    public static void main(String[] args) {
        int i;
        int number;
        //标记JavaScore是否验证成功
        boolean tag = false;
        boolean yearValidateResult;
        Student dayValidatedStudent;
        System.out.println("程序开始运行");
        StudentFunction studentFunction = new StudentFunction();
        FirstGetAverage firstGetAverage = new FirstGetAverage();
        SecondGetAverage secondGetAverage = new SecondGetAverage();
        MyDate myDate = new MyDate();
        ArrayList<Student> allStudents;
        ArrayList<Double> allJavaScore;
        System.out.println("请输入学生人数:");
        Scanner StuNumber = new Scanner(System.in);
        number = StuNumber.nextInt();
        System.out.println("姓名  年龄  出生  年  月  日    Java成绩");
        for ( i = 0; i < number; i++ ) {
            System.out.print("请输入第");
            System.out.print(i+1);
            System.out.println("名学生的信息");
            Scanner _Student = new Scanner(System.in);
            Student student = new Student();
            while (true) {
                try {
                student.setName(_Student.next());
                student.setAge(_Student.nextInt());
                student.setBirthYear(_Student.nextInt());
                student.setBirthMonth(_Student.nextInt());
                student.setBirthDay(_Student.nextInt());
                student.setJavaScore(_Student.nextDouble());
                break;
                    }
                catch (InputMismatchException e) {
                    System.out.print("您输入的JavaScore有误，请重新输入第");
                    System.out.print(i+1);
                    System.out.println("名学生的信息");
                    _Student = new Scanner(System.in);
                    continue;
                    }
                }
                myDate.validateYear(student);
                yearValidateResult = myDate.isYearValidate();
                if (yearValidateResult){
                    //闰年status为1
                    dayValidatedStudent = myDate.validateDay(1, student);
                }else {
                    //平年status为2
                    dayValidatedStudent = myDate.validateDay(2, student);
                }
               studentFunction.setStudents(dayValidatedStudent);
            }
        //获取到所有的学生
        allStudents = studentFunction.getStudentArrayList();
        studentFunction.setJavaScore(allStudents);
        allJavaScore = studentFunction.getJavaScores();
        System.out.println("年龄平均值为：");
        System.out.println(studentFunction.getAgeAverage(number, allStudents));
        System.out.println("第一种方式(直接求均值)求得的Java成绩平均值为：");
        System.out.println(firstGetAverage.getAverage(number, allJavaScore));
        System.out.println("第二种方式(去掉一个最高分和一个最低分后，再将总分求平均)求得的Java成绩平均值为：");
        System.out.println(secondGetAverage.getAverage(number, allJavaScore));
    }
}

