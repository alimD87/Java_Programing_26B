package day10_scanner;

import java.util.Scanner;

public class Angles {
    /*
    Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
     */

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 3 angle numbers");
        double angleOne = keyboard.nextDouble();
        double angleTwo = keyboard.nextDouble();
        double angleThree = keyboard.nextDouble();

        double sum = angleOne + angleTwo + angleThree; //  keyboard.nextDouble() +  keyboard.nextDouble() +  keyboard.nextDouble();

        boolean isTriangle = sum == 180;
        boolean isCircle = sum == 360;

        System.out.println("is a triangle: " + isTriangle);
        System.out.println("is a circle: " + isCircle);


    }
}
