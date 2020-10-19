package Main;

import entity.Student;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectTwoTwo {
    public static void main(String[] args) {
        System.out.println("程序开始运行");
        Student studentFunction = new Student();
        ArrayList<Student> allStudents;
        System.out.println("请输入学生人数:");
        Scanner StuNumber = new Scanner(System.in);
        int number = StuNumber.nextInt();
        System.out.println("姓名  ");
        for (int i = 0; i < number; i++ ) {
            System.out.print("请输入第");
            System.out.print(i+1);
            System.out.println("名学生的信息");
            System.out.println("姓名   学号   绩点   学分     入学时间       身份证号     ");
            Scanner _Student = new Scanner(System.in);
            Student student = new Student();
            //姓名
            student.setName(_Student.next());
            //学号
            student.setNumber(_Student.next());
            //绩点
            student.setGradePoint(_Student.nextDouble());
            //学分
            student.setCredit(_Student.nextDouble());
            //入学时间
            student.setEntranceTime(_Student.next());
            //身份证号
            student.setId(_Student.next());
            //账户
            student.setAccount(null);
            studentFunction.setStudents(student);
        }

        allStudents = studentFunction.getStudents();
        System.out.println("学生信息录入完成，信息如下：");
        System.out.println("标号  姓名   学号   绩点   学分     入学时间       身份证号     ");
        for (int i = 0 ; i< allStudents.size(); i++){
           studentFunction.SystemStudent(i);
        }

        System.out.println("请输入学生编号以执行操作：");
        int indexNumber = new Scanner(System.in).nextInt();


        System.out.println("您将对以下学生进行操作：");
        studentFunction.SystemStudent(indexNumber);

        System.out.println("请输入对应编号执行操作：");
        System.out.println("1--开户   2--存款    3--取款   4--查看操作明细   5--销户   6--exit");
        Scanner actionNumber = new Scanner(System.in);
        int scanner = actionNumber.nextInt();
        while (scanner != 6){
            switch (scanner) {
                case 1: {
                    studentFunction.setAccount();
                    break;
                }
                case 2: {
                    studentFunction.deposit();
                    break;
                }
                case 3: {
                    studentFunction.withdrawMoney();
                    break;
                }
                case 4: {
                    studentFunction.getAction();
                    break;
                }
                case 5: {
                    studentFunction.AccountCancellation();
                    break;
                }
            }
            System.out.println("请继续输入编号执行操作");
            System.out.println("1--开户   2--存款    3--取款   4--查看操作明细   5--销户   6--exit");
            Scanner newActionNumber = new Scanner(System.in);
            scanner = newActionNumber.nextInt();
        }
    }
}
