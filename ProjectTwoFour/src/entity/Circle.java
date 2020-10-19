package entity;

import myInterface.Shape;

import static com.sun.tools.doclint.Entity.pi;

public class Circle extends Coordinates implements Shape {
    private Coordinates firstCoordinate;
    private Coordinates secondCoordinate;
    private static double pi = 3.1415926;
    private double radius;
    private double area;
    private double perimeter;

    public Coordinates getFirstCoordinate() {
        return firstCoordinate;
    }

    public Coordinates getSecondCoordinate() {
        return secondCoordinate;
    }

    public void setFirstCoordinate(Coordinates firstCoordinate) {
        this.firstCoordinate = firstCoordinate;
    }

    public void setSecondCoordinate(Coordinates secondCoordinate) {
        this.secondCoordinate = secondCoordinate;
    }

    public double getRadius() {
        this.radius = Math.sqrt(Math.pow(this.firstCoordinate.x - this.secondCoordinate.x, 2) + Math.pow(this.firstCoordinate.y - this.secondCoordinate.y, 2));
       return this.radius;
    }

    @Override
    public double getArea() {
        this.area  =  this.radius * this.radius * pi;
        return this.area;
    }

    @Override
    public double getPerimeter() {
        this.perimeter = 2 * pi * this.radius;
        return this.perimeter;
    }
}
