package entity;

import myInterface.Shape;

import java.util.Scanner;

public class Rectangle extends Coordinates implements Shape {
    private Coordinates firstCoordinate;
    private Coordinates secondCoordinate;
    private Coordinates thirdCoordinate;
    private Coordinates fourthCoordinate;
    private double rectangleLong;
    private double rectangleWide;
    private double rectangleFirstSlopeLength;
    private double rectangleSecondSlopeLength;
    private double area;
    private double perimeter;

    public void setFirstCoordinate(Coordinates firstCoordinate) {
        this.firstCoordinate = firstCoordinate;
    }

    public void setSecondCoordinate(Coordinates secondCoordinate) {
        this.secondCoordinate = secondCoordinate;
    }

    public void setThirdCoordinate(Coordinates thirdCoordinate) {
        this.thirdCoordinate = thirdCoordinate;
    }

    public void setFourthCoordinate(Coordinates fourthCoordinate) {
        this.fourthCoordinate = fourthCoordinate;
    }

    public double getRectangleLong() {
        this.rectangleLong = Math.sqrt(Math.pow(this.firstCoordinate.x - this.secondCoordinate.x, 2) + Math.pow(this.firstCoordinate.y - this.secondCoordinate.y, 2));
        return this.rectangleLong;
    }

    public double getRectangleWide() {
        this.rectangleWide = Math.sqrt(Math.pow(this.secondCoordinate.x - this.thirdCoordinate.x, 2) + Math.pow(this.secondCoordinate.y - this.thirdCoordinate.y, 2));
        return rectangleWide;
    }

    public double getFirstRectangleSlopeLength() {
        this.rectangleFirstSlopeLength = Math.sqrt(Math.pow(this.firstCoordinate.x - this.thirdCoordinate.x, 2) + Math.pow(this.firstCoordinate.y - this.thirdCoordinate.y, 2));
        return rectangleFirstSlopeLength;
    }

    public double getSecondRectangleSlopeLength() {
        this.rectangleSecondSlopeLength = Math.sqrt(Math.pow(this.secondCoordinate.x - this.fourthCoordinate.x, 2) + Math.pow(this.secondCoordinate.y - this.fourthCoordinate.y, 2));
        return rectangleSecondSlopeLength;
    }



    public void validateIsRectangle(){
       if (!((this.firstCoordinate.x + this.thirdCoordinate.x) == (this.secondCoordinate.x + this.fourthCoordinate.x))){
           this.newScanner();
       } else {
           if (this.getFirstRectangleSlopeLength() == this.getSecondRectangleSlopeLength()){
               this.out();
           } else {
               this.newScanner();
           }
       }
    }


    public void out() {
        System.out.print("矩形长为：");
        System.out.println(this.getRectangleLong());
        System.out.print("矩形宽为：");
        System.out.println(this.getRectangleWide());
        System.out.print("矩形第一条斜边长度为：");
        System.out.println(this.getFirstRectangleSlopeLength());
        System.out.print("矩形第二条斜边长度为：");
        System.out.println(this.getSecondRectangleSlopeLength());
        System.out.print("矩形面积为：");
        System.out.println(this.getArea());
        System.out.print("矩形周长为：");
        System.out.println(this.getPerimeter());
    }

    /**
     * 如果用户输入的坐标不合法，启用新的输入
     */
    public void newScanner(){
        System.out.println("您输入的坐标不能构成矩形，请重新输入");

        System.out.println("请从矩形左上角开始顺时针输入顶点坐标：");
        System.out.println("请输入第一个点的x坐标与y坐标：");
        Scanner rectangleFirstCoordinatesScanner = new Scanner(System.in);
        this.firstCoordinate.Coordinate(rectangleFirstCoordinatesScanner.nextInt(), rectangleFirstCoordinatesScanner.nextInt());
        this.setFirstCoordinate(firstCoordinate);

        System.out.println("请输入第二个点的x坐标与y坐标：");
        Scanner rectangleSecondCoordinatesScanner = new Scanner(System.in);
        this.secondCoordinate.Coordinate(rectangleSecondCoordinatesScanner.nextInt(), rectangleSecondCoordinatesScanner.nextInt());
        this.setSecondCoordinate(secondCoordinate);

        System.out.println("请输入第三个点的x坐标与y坐标：");
        Scanner rectangleThirdCoordinatesScanner = new Scanner(System.in);
        this.thirdCoordinate.Coordinate(rectangleThirdCoordinatesScanner.nextInt(), rectangleThirdCoordinatesScanner.nextInt());
        this.setThirdCoordinate(thirdCoordinate);

        System.out.println("请输入第四个点的x坐标与y坐标：");
        Scanner rectangleFourthCoordinatesScanner = new Scanner(System.in);
        this.fourthCoordinate.Coordinate(rectangleFourthCoordinatesScanner.nextInt(), rectangleFourthCoordinatesScanner.nextInt());
        this.setFourthCoordinate(thirdCoordinate);

        this.validateIsRectangle();
    }

    @Override
    public double getArea() {
        this.area = this.rectangleLong * this.rectangleWide;
        return this.area;
    }

    @Override
    public double getPerimeter() {
        this.perimeter = 2*(this.rectangleLong + this.rectangleWide);
        return this.perimeter;
    }
}
