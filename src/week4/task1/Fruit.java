package week4.task1;

public class Fruit {
    String species;
    int price;
    float weigh = 9 ;

    //setter


    public void setSpecies(String species) {
        this.species = species;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeigh(float weigh) {
        this.weigh = weigh;
    }
    //getter
    public int getPrice() {
        return price;
    }

    public float getWeigh() {
        return weigh;
    }

    public String getSpecies() {
        return species;
    }

}

