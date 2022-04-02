package day09_scanner;

public class Speeding {

    /*

create a class called Speeding, and write a program to determine if the car is speeding

        declare 3 variables:
        current speed, speed limit, speeding boolean

        print
        "Are you speeding? " true/false
________________________________________
     */

    public static void main(String[] args) {

        int currentSpeed = 58;
        int speedLimit = 55;

        boolean isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you speeding: " + isSpeeding);

    }
}
