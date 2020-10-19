package Main;

import entity.Circle;
import entity.Coordinates;
import entity.Rectangle;
import entity.Triangle;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class ProjectTwoForce {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Coordinates circleFirstCoordinates = new Coordinates();
        Coordinates circleSecondCoordinates = new Coordinates();
        Coordinates triangleFirstCoordinates = new Coordinates();
        Coordinates triangleSecondCoordinates = new Coordinates();
        Coordinates triangleThirdCoordinates = new Coordinates();
        Coordinates rectangleFirstCoordinates = new Coordinates();
        Coordinates rectangleSecondCoordinates = new Coordinates();
        Coordinates rectangleThirdCoordinates = new Coordinates();
        Coordinates rectangleFourthCoordinates = new Coordinates();

        System.out.println("程序开始运行");

        System.out.println("请输入圆形圆心x坐标与y坐标：");
        Scanner circleFirstCoordinatesScanner = new Scanner(System.in);
        circleFirstCoordinates.Coordinate(circleFirstCoordinatesScanner.nextInt(), circleFirstCoordinatesScanner.nextInt());
        circle.setFirstCoordinate(circleFirstCoordinates);

        System.out.println("请输入圆形圆上一点x坐标与y坐标：");
        Scanner circleSecondCoordinatesScanner = new Scanner(System.in);
        circleSecondCoordinates.Coordinate(circleSecondCoordinatesScanner.nextInt(), circleSecondCoordinatesScanner.nextInt());
        circle.setSecondCoordinate(circleSecondCoordinates);

        System.out.print("圆形半径长度为：");
        System.out.println(circle.getRadius());
        System.out.print("圆形面积为：");
        System.out.println(circle.getArea());
        System.out.print("圆形周长为：");
        System.out.println(circle.getPerimeter());


        System.out.println("                                  ");
        System.out.println("*********************************");
        System.out.println("                                 ");


        System.out.println("请输入三角形第一个点x坐标与y坐标：");
        Scanner triangleFirstCoordinatesScanner = new Scanner(System.in);
        triangleFirstCoordinates.Coordinate(triangleFirstCoordinatesScanner.nextInt(), triangleFirstCoordinatesScanner.nextInt());
        triangle.setFirstCoordinate(triangleFirstCoordinates);

        System.out.println("请输入三角形第二个点x坐标与y坐标：");
        Scanner triangleSecondCoordinatesScanner = new Scanner(System.in);
        triangleSecondCoordinates.Coordinate(triangleSecondCoordinatesScanner.nextInt(), triangleSecondCoordinatesScanner.nextInt());
        triangle.setSecondCoordinate(triangleSecondCoordinates);

        System.out.println("请输入三角形第三个点x坐标与y坐标：");
        Scanner triangleThirdCoordinatesScanner = new Scanner(System.in);
        triangleThirdCoordinates.Coordinate(triangleThirdCoordinatesScanner.nextInt(), triangleThirdCoordinatesScanner.nextInt());
        triangle.setThirdCoordinate(triangleThirdCoordinates);

        triangle.validateIsTriangle();

        System.out.println("                                  ");
        System.out.println("*********************************");
        System.out.println("                                 ");


        System.out.println("请从矩形左上角开始顺时针输入顶点坐标：");
        System.out.println("请输入第一个点的x坐标与y坐标：");
        Scanner rectangleFirstCoordinatesScanner = new Scanner(System.in);
        rectangleFirstCoordinates.Coordinate(rectangleFirstCoordinatesScanner.nextInt(), rectangleFirstCoordinatesScanner.nextInt());
        rectangle.setFirstCoordinate(rectangleFirstCoordinates);

        System.out.println("请输入第二个点的x坐标与y坐标：");
        Scanner rectangleSecondCoordinatesScanner = new Scanner(System.in);
        rectangleSecondCoordinates.Coordinate(rectangleSecondCoordinatesScanner.nextInt(), rectangleSecondCoordinatesScanner.nextInt());
        rectangle.setSecondCoordinate(rectangleSecondCoordinates);

        System.out.println("请输入第三个点的x坐标与y坐标：");
        Scanner rectangleThirdCoordinatesScanner = new Scanner(System.in);
        rectangleThirdCoordinates.Coordinate(rectangleThirdCoordinatesScanner.nextInt(), rectangleThirdCoordinatesScanner.nextInt());
        rectangle.setThirdCoordinate(rectangleThirdCoordinates);

        System.out.println("请输入第四个点的x坐标与y坐标：");
        Scanner rectangleFourthCoordinatesScanner = new Scanner(System.in);
        rectangleFourthCoordinates.Coordinate(rectangleFourthCoordinatesScanner.nextInt(), rectangleFourthCoordinatesScanner.nextInt());
        rectangle.setFourthCoordinate(rectangleFourthCoordinates);

        rectangle.validateIsRectangle();
    }
}
