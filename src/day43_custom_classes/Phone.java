package day43_custom_classes;
/*

      create instance variables

          name, brand, memory, version

      create constructors

      - accept and initialize the name

      - accept and initialize the name and brand

      - accept and initialize the name, brand, memory, and version

      create a toString
   */
public class Phone {

    String name;
    String brand;
    int memory;
    double version;

    public Phone(String name) {
        this.name = name;
    }

    public Phone(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }


    public Phone(String name, String brand, int memory, double version) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;

    }

    @Override
    public String toString() {
        return "Phone: " +
                " Name: " + name +
                " Brand: " + brand +
                " Memory: " + memory +
                " Version: " + version;
    }
}
