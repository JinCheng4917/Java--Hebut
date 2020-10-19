package Main;

import MyException.MyException;
import MyThrow.MyThrow;

import java.util.Scanner;

public class ProjectThreeTwo {
    public static void main(String[] args) {
        System.out.println("程序开始运行");

        System.out.println("请输入 ABC 或 XYZ 以便执行程序");
        Scanner scanner = new Scanner(System.in);

        try {
            MyThrow myThrow = new MyThrow();
            myThrow.setMyScanner(scanner.next());
        } catch (MyException e) {
           System.out.println(e.getReason());
        }
    }
}
