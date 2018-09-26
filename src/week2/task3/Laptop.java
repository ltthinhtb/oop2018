package week2.task3;

public class Laptop{
    // create a class of the Machine
    private
        String species;
        int Ram;
        String CPU;
        String GPU;

    // default constructor
    Laptop(){
        this.species = "Dell";
        this.Ram = 4;
        this.CPU = "core i5";
        this.GPU = "gtx 1050ti";
    }
    Laptop(String species, int Ram, String CPU, String GPU){
        this.species = species;
        this.Ram = Ram;
        this.CPU = CPU;
        this.GPU = GPU;
    }
    Laptop(Laptop s){
        this.species = s.species;
        this.Ram = s.Ram;
        this.CPU = s.CPU;
        this.GPU = s.GPU;
    }

    // getter
    public String getSpecies() {
        return species;
    }

    public int getRam() {
        return Ram;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }
    // setter
    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setRam(int ram) {
        this.Ram = ram;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }


}
