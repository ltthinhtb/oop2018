package week2.task3;

public class Cat {
    // create a class of the cat
    private String name;
            int age;
            String species;
            String color;

    // default constructor
    Cat() {
        this.name = "noname";
        this.age = 1 ;
        this.species = "meo muop";
        this.color = "yellow";
    }

    // constructor
    Cat(String name, int age,String species, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.species = species;
    }

    Cat(Cat s){
        this.name = s.name;
        this.age = s.age;
        this.species = s.species;
        this.color = s.color;
    }

    // getter
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    // setter
    /**
     * @return the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}