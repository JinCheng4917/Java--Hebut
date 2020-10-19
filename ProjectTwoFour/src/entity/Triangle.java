package entity;

import myInterface.Shape;

import java.util.Scanner;

public class Triangle extends Coordinates implements Shape {
    private Coordinates firstCoordinate;
    private Coordinates secondCoordinate;
    private Coordinates thirdCoordinate;
    private double firstEdge;
    private double secondEdge;
    private double thirdEdge;
    private double middleEdge;
    private double area;
    private double perimeter;

    public Coordinates getFirstCoordinate() {
        return firstCoordinate;
    }

    public Coordinates getSecondCoordinate() {
        return secondCoordinate;
    }

    public Coordinates getThirdCoordinate() {
        return thirdCoordinate;
    }

    public void setFirstCoordinate(Coordinates firstCoordinate) {
        this.firstCoordinate = firstCoordinate;
    }

    public void setSecondCoordinate(Coordinates secondCoordinate) {
        this.secondCoordinate = secondCoordinate;
    }

    public void setThirdCoordinate(Coordinates thirdCoordinate) {
        this.thirdCoordinate = thirdCoordinate;
    }

    public double getFirstEdge() {
        this.firstEdge = Math.sqrt(Math.pow(this.firstCoordinate.x - this.secondCoordinate.x, 2) + Math.pow(this.firstCoordinate.y - this.secondCoordinate.y, 2));
        return this.firstEdge;
    }

    public double getSecondEdge() {
        this.secondEdge = Math.sqrt(Math.pow(this.secondCoordinate.x - this.thirdCoordinate.x, 2) + Math.pow(this.secondCoordinate.y - this.thirdCoordinate.y, 2));
        return this.secondEdge;
    }

    public double getThirdEdge() {
        this.thirdEdge = Math.sqrt(Math.pow(this.firstCoordinate.x - this.thirdCoordinate.x, 2) + Math.pow(this.firstCoordinate.y - this.thirdCoordinate.y, 2));
        return this.thirdEdge;
    }

    /**
     * 验证用户输入的三个坐标是否合法
     */
    public void validateIsTriangle() {
        //是否三点在一条直线
        if (this.firstCoordinate.x == this.secondCoordinate.x){
             if (!(this.secondCoordinate.x == this.thirdCoordinate.x)){
                 this.out();
             }else {
                 this.newScanner();
            }
        } else if (this.firstCoordinate.x == this.thirdCoordinate.x) {
            if (!(this.thirdCoordinate.x == this.secondCoordinate.x)){
                this.out();
            }else {
                this.newScanner();
            }
        } else if (this.secondCoordinate.x == this.thirdCoordinate.x) {
            if (!(this.thirdCoordinate.x == this.firstCoordinate.x)){
                this.out();
            }else {
                this.newScanner();
            }
        }
          //    斜率是否相等
        else if (this.firstCoordinate.x != this.secondCoordinate.x
                && this.secondCoordinate.x != this.thirdCoordinate.x
                && this.firstCoordinate.x != this.thirdCoordinate.x){
            if ((this.firstCoordinate.y - this.secondCoordinate.y)/(this.firstCoordinate.x - this.secondCoordinate.x) == (this.secondCoordinate.y - this.thirdCoordinate.y)/(this.secondCoordinate.x - this.thirdCoordinate.x)){
                this.newScanner();
            } else {
                this.out();
            }
        }
    }

    public void out() {
        System.out.print("三角形第一边长度为：");
        System.out.println(this.getFirstEdge());
        System.out.print("三角形第二边长度为：");
        System.out.println(this.getSecondEdge());
        System.out.print("三角形第三边长度为：");
        System.out.println(this.getThirdEdge());
        System.out.print("三角形面积为：");
        System.out.println(this.getArea());
        System.out.print("三角形周长为：");
        System.out.println(this.getPerimeter());
    }

    /**
     * 如果用户输入的坐标不合法，启用新的输入
     */
    public void newScanner(){
        System.out.println("您输入的坐标不能构成三角形，请重新输入");
        System.out.println("请输入三角形第一个点x坐标与y坐标：");
        Scanner triangleFirstCoordinatesScanner = new Scanner(System.in);
        this.firstCoordinate.Coordinate(triangleFirstCoordinatesScanner.nextInt(), triangleFirstCoordinatesScanner.nextInt());
        this.setFirstCoordinate(firstCoordinate);

        System.out.println("请输入三角形第二个点x坐标与y坐标：");
        Scanner triangleSecondCoordinatesScanner = new Scanner(System.in);
        this.secondCoordinate.Coordinate(triangleSecondCoordinatesScanner.nextInt(), triangleSecondCoordinatesScanner.nextInt());
        this.setSecondCoordinate(secondCoordinate);

        System.out.println("请输入三角形第三个点x坐标与y坐标：");
        Scanner triangleThirdCoordinatesScanner = new Scanner(System.in);
        this.thirdCoordinate.Coordinate(triangleThirdCoordinatesScanner.nextInt(), triangleThirdCoordinatesScanner.nextInt());
        this.setThirdCoordinate(thirdCoordinate);

        this.validateIsTriangle();
    }
    @Override
    public double getArea() {
        this.middleEdge = (this.firstEdge + this.secondEdge + this.thirdEdge) / 2;
        this.area = Math.sqrt( this.middleEdge * (this.middleEdge - this.firstEdge) * (this.middleEdge - this.secondEdge) * (this.middleEdge - this.thirdEdge));
        return this.area;
    }

    @Override
    public double getPerimeter() {
        this.perimeter = this.firstEdge + this.secondEdge + this.thirdEdge;
        return this.perimeter;
    }
}
