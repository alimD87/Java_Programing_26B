package day46_static.computer;
/*
Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references
 */
public class Computer {

    double price;
    String brand;
    String color;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {
        hasScreen=true;
        hasBattery=true;
        hasMemory=true;
    }

    public Computer(double price, String brand, String color){
        this.price=price;
        this.brand=brand;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
