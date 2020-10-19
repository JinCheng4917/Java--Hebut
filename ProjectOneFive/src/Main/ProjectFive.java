package Main;

import Function.Function;

public class ProjectFive {
    public static void main(String[] args) {
        Function function = new Function();
        System.out.println("程序开始运行");
        function.compute();
        System.out.print("X的值为：");
        //获取X的值
        System.out.println(function.getX());
        System.out.print("Y的值为：");
        //获取Y的值
        System.out.println(function.getY());
        System.out.print("Z的值为：");
        //获取Z的值
        System.out.println(function.getZ());
    }
}
