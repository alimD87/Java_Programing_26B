package day55_polymorphism.interface_methods;

public interface Mac {

    String NAME = "Mac"; // public static final variables
    String OS = "IOS";

    void turnOn(); // public abstract

    //Q: How do you create a method with implementation in an interface

    // One way is a static method:

    public static void company(){
        System.out.println("Apple");
        System.out.println("HQ is LA");
        System.out.println("New release in Nov");
    }

    // One way is a default method:

    public default void faceTime(){
        System.out.println("Opening facetime");
        System.out.println("Calling someone");
    }


}



