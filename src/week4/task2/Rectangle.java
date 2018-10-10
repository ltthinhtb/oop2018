package week4.task2;

public class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;


    //getter

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //setter
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    //getArea
    public void getArea(double Area){
        Area = width*length;
    }
    //getPerimeter
    public void getPerimeter(double perimeter){
        perimeter = (width+length)*2;
    }

    //constructor
    Rectangle(){
        width = 6.9;
        length = 9.6;
    }
    Rectangle(double width,double length,String color,boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }


}
