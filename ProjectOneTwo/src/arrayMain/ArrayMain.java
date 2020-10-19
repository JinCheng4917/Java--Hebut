package arrayMain;

import arrayFunction.ArrayFunction;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        //折半查找结果
        int result;
        int array[]={12,34,9,-23,45,6,90,123,19,45,34};
        System.out.println("程序开始运行");
        ArrayFunction arrayFunction = new ArrayFunction();
        //用来排序的数组
        int sortArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++){
            sortArray[i] = array[i];
        }
        Arrays.sort(sortArray);
        System.out.print("原数组为：");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("排序后数组为：");
        for (int i = 0; i < sortArray.length; i++){
            System.out.print(sortArray[i] + " ");
        }
        System.out.println();
        System.out.print("请输入要查找的数：");
        Scanner findNumber = new Scanner(System.in);
        result =  arrayFunction.binarySearch(findNumber.nextInt(), sortArray);
        if (result > 0){
            System.out.print("要查询的数字在数组中,处于第");
            System.out.print(result + 1);
            System.out.println("位");
        }else {
            System.out.println("要查询的数字不在数组中");
        }
    }
}
