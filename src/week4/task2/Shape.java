package week4.task2;

public class Shape {
    String color;
    boolean filled ;
    //setter


    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //getter

    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }


    //constructor
    Shape(){
        this.color = "red";
        this.filled = true;
    }
    Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

}
