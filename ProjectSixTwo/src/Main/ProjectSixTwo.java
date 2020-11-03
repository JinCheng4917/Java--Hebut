package Main;

import Function.MyFunction;

import java.io.*;
import java.util.Scanner;

public class ProjectSixTwo {
    public static void main(String[] args) throws IOException {
        System.out.println("程序开始运行");
        MyFunction myFunction = new MyFunction();

        File myFile1 = new File("myFile1.txt");
        File myFile2 = new File("myFile2.txt");

        myFunction.flushFile(myFile1);
        myFunction.flushFile(myFile2);


        try {
            FileWriter fileWriter1 = new FileWriter(myFile1);
            fileWriter1.write("姓名    专业   班级    家庭住址     学号    \n");

            while (true) {
                System.out.println("请输入学生信息：");
                System.out.println("姓名     专业      班级       家庭住址     学号");
                Scanner scanner = new Scanner(System.in);
                fileWriter1.write(scanner.next() + "   ");
                fileWriter1.write(scanner.next() + "   ");
                fileWriter1.write(scanner.next() + "   ");
                fileWriter1.write(scanner.next() + "   ");
                //写入文件只能以字符形式写入
                fileWriter1.write(String.valueOf(scanner.nextInt()));
                fileWriter1.write("\n");
                System.out.println("请确定是否结束：bye-结束  回车-继续");

                //根据输入数据的长度判断是否为回车
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String selectScanner  = bufferedReader.readLine();
                if (selectScanner.equals("bye")) {
                    break;
                } else if (selectScanner.length() == 0) {
                    continue;
                }
            }
            fileWriter1.close();
            myFunction.copyFile(myFile1, myFile2);
            System.out.println("文件复制成功，文件内容为：");
            System.out.println("");
            myFunction.readFile(myFile1);
            System.out.println("");
            System.out.println("");
            myFunction.readFile(myFile2);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
