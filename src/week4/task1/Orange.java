package week4.task1;

public class Orange extends Fruit {
    String color;
    String shape;

    //setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    //getter
    public String getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }
    Orange(){
        this.color = "orange";
        this.shape = "spherical";
    }
}
