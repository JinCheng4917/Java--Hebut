import java.util.Scanner;

public class ProjectTwoThree {

    public static void main(String[] args) {

        System.out.println("程序开始运行");

        System.out.println("请输入汽车");
        System.out.println("车轮数  车重  载人数  载重量：");
        Scanner truckScanner = new Scanner(System.in);
        Truck truck = new Truck(truckScanner.nextInt(),truckScanner.nextInt(),truckScanner.nextInt(),truckScanner.nextInt());
    }

}
