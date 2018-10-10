package week4.task1;

public class Sanh_Orange extends Orange {
    int nutrition;
    float roughage;
    //getter

    public int getNutrition() {
        return nutrition;
    }

    public float getRoughage() {
        return roughage;
    }
    //setter


    public void setNutrition(int nutrition) {
        this.nutrition = nutrition;
    }

    public void setRoughage(float roughage) {
        this.roughage = roughage;
    }
    Sanh_Orange(){
        this.nutrition = 80;
        this.roughage = 30;
    }

    public void getInfo(){
        System.out.println("Do dinh duong " + nutrition);
        System.out.println("Ham luong chat so " + roughage);
        System.out.println("Can nang " + weigh);
        System.out.println("Gia tien " + price);
        System.out.println("Mau sac " + color);
        System.out.println("Hinh dang " + shape);
    }
}
