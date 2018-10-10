package week4.task1;

public class Cao_Phong_Orange extends Orange {
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

    Cao_Phong_Orange(){
        this.nutrition = 70;
        this.roughage = 40;
    }
}
