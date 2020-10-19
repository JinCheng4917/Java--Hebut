import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class ProjectSixTwo {
    public static void main(String[] args) throws IOException {
        File myFile1 = new File("myFile1.txt");
        File myFile2 = new File("myFile2.txt");
        //如果文件存在,则删除
        if (myFile1.exists()) {
            myFile1.delete();
        }
        if (myFile2.exists()) {
            myFile2.delete();
        }
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
                System.out.println("请确定是否结束：bye-结束  next-继续");
                Scanner selectScanner = new Scanner(System.in);
                String mySelect = selectScanner.next();
                if (mySelect.equals("bye")) {
                    break;
                } else if (mySelect.equals("next")) {
                    continue;
                }
            }
            fileWriter1.close();
            Files.copy(myFile1.toPath(), myFile2.toPath());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
