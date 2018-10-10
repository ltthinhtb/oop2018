package week4.task2;

public class Square extends Rectangle {
    double side;

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    //setWidth
    public void setWidth(double side){

    }
    //setter length
    public void setLength(double side){

    }

    //constructor
    Square(){
        this.side = 5.0;
    }


    Square(double side,String color,boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }


//toString
    @Override
    public String toString() {
        return super.toString();
    }
}

