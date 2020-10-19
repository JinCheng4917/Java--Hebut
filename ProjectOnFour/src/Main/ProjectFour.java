package Main;

import Function.Function;

public class ProjectFour {
    public static void main(String[] args) {
        int result;
        Function function = new Function();
        System.out.println("程序开始运行");
        System.out.println("1 - 1000所有'完全数'为： ");
        for (int i = 0; i < 1000; i++){
            result = function.getNumber(i);
            if (result == i && result > 0){
                System.out.print(result);
                System.out.print(" ");
            }
        }
    }
}
