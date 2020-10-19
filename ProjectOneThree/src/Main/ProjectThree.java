package Main;

import Function.Function;

public class ProjectThree {
    public static void main(String[] args) {
        int result;
        System.out.println("程序开始运行");
        Function function = new Function();
        System.out.println("100 - 200 之间的所有素数为：");
        for (int i = 100; i <=200; i++){
            //判断数字i是否为素数
            result = function.isPrimeNumber(i);
            if (result > 0){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
