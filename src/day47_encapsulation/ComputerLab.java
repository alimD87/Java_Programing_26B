package day47_encapsulation;

public class ComputerLab {
    public static void main(String[] args) {

        System.out.println("Hello World");
        Computer comp = new Computer("HP", 500, "Silver");

        Computer.hasBattery = false;

        System.out.println(Computer.hasBattery);

        //System.out.println(Computer.brand); // this is not possible because brand it the instance variable and we are trying to access by the class name, but we need an object
        System.out.println(comp.brand);

        System.out.println(comp.hasMemory); // you can access static members from an object reference because the object comes from the class, but in general you want to access static members by the class name


    }
}

