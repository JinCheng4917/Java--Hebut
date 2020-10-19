package function;

import entity.Student;
import studentInterface.StudentInterface;

import java.util.ArrayList;

public class StudentFunction implements StudentInterface {
    ArrayList<Student> studentArrayList;
    //循环条件
    int i;
    //每个学生的age
    int age;
    //所有学生的age
    int allAge = 0;
    //所有学生age的均值
    double ageAverage;
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Double> javaScores = new ArrayList<Double>();

    public void setStudents(Student student) {
        students.add(student);
        this.studentArrayList = students;
    }

    public void setJavaScore(ArrayList<Student> students) {
        students.forEach( student -> {
            javaScores.add(student.getJavaScore());
        });
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public ArrayList<Double> getJavaScores() {
        return javaScores;
    }

    @Override
    public Double getAgeAverage(int number, ArrayList<Student> students) {
       students.forEach(student -> {
           age = student.getAge();
           allAge += age;
       });
        ageAverage = allAge/number;
       return ageAverage;
    }
}
