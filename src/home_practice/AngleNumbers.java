package Home_Practice;

//Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
//        Determine if the angles make a triangle, which means the angles add to 180.0
//        and
//        Determine if the angles make a circle, which means the angles add to 360.0


//Ask the user to enter their age (byte),
//        ask them to enter their favorite number (long),
//        and ask them to enter their favorite book
//        Print all the values from the inputs

import java.util.Scanner;

public class AngleNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter age");
     byte age = input.nextByte();
        System.out.println("Enter your favorite number");
      long number = input.nextLong();
        System.out.println("Enter your favorite book");
       String book = input.next();
        System.out.println("By David Bulddachi:");




    }
}
