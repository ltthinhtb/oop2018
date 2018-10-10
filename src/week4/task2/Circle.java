package week4.task2;

public class Circle extends Shape {
    double radius = 1.0;
    static double Pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void getArea(double Area){
        Area = radius*radius;
    }
    public void getPerimeter(double perimeter){
        perimeter = radius*Pi;
    }

    Circle(){
        this.radius = 6.9;
    }
    Circle(double radius,String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

}
