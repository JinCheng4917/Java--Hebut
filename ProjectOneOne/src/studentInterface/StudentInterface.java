package studentInterface;

import entity.Student;

import java.util.ArrayList;

public interface StudentInterface {
    /**
     * 构造student数组
     * @param student 赋值完成的student
     */
    public void setStudents(Student student);

    /**
     * 获取到构造完成的学生数组
     * @return
     */
    public ArrayList<Student> getStudentArrayList();

    /**
     * 求取年龄平均值
     * @param number 学生总数
     * @param students  学生数组
     * @return
     */
    public Double getAgeAverage(int number, ArrayList<Student> students);

}
