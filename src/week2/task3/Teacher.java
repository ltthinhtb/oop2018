package week2.task3;

public class Teacher{
    // create a class of the person
    private
        String Name;
        int Age;
        String level;

    // default constructor
    Teacher(){
        this.Name = "DXQUANG";
        this.Age = 32;
        this.level = "high school" ;
    }
    Teacher(String name,int age,String level){
        this.Name = name;
        this.level = level;
        this.Age = age;
    }
    Teacher(Teacher s){
        this.Name = s.Name;
        this.Age = s.Age;
        this.level = s.level;
    }

    // getter
    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }
    /**
     * @return the Job
     */

    public String getLevel() {
        return level;
    }
    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    public void setName(String name){
        this.Name = name;
    }
    public void setAge(int age){
        this.Age =  age;
    }
    public void setlevel(String level){
        this.level = level;
    }



}