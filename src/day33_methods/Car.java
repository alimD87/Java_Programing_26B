package day33_methods;

public class Car {

    /*

    unlock the car
    open the door
    sit in the car
    close the door
    put on seatbelt
    start the engine
    put into drive and go

     */

    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }

    public static void openDoor(){
        System.out.println("Opening the door");
    }

    public static void sitInCar(){
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }

    public static void getReadyToGo(){
        System.out.println("Putting on seatbelt");
        System.out.println("Check mirrors");
        System.out.println("Put on music");
        System.out.println("Put on navigation");
    }

    public static void startCar(){
        System.out.println("Starting car");
    }

    public static void driveAndGo(){
        System.out.println("Putting car into drive");
        System.out.println("Going forwards");
    }

    public static void goInHurry(){
        unlockCar();
        sitInCar();
        startCar();
        driveAndGo();
    }

    public static void main(String[] args) {
        unlockCar();
        unlockCar();
        openDoor();
        sitInCar();
        getReadyToGo();
        startCar();
        driveAndGo();

        System.out.println();

        goInHurry();
        System.out.println("hear police siren");
        getReadyToGo();
    }

}
