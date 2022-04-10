package day42_custom_classes;

public class Car {

    String model;
    int year;
    String color;
    double fuelLevel;

    public String toString() {
        return model + " \nYear: " + year + "\nColor: " + color + "\nFuel level: " + fuelLevel;

    }

    public void drive() {
        System.out.println("I'm driving " + model);
        fuelLevel -= 5;

    }

    public void fillTank() {
        System.out.println("Filling tank " + fuelLevel);

    }

    public boolean isLow() {

        if (fuelLevel < 25) {
            System.out.println(true);

        } else{

        }
            return false;
    }

}

