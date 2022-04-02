package Home_Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Alims_Ifs1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input. nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("Where are you from");
        input.nextLine();
        String from = input.nextLine();
        System.out.println("Are you married");
        String married = input.next();
        input.nextLine();
        System.out.println("What is your wife's name?");
        String wife = input.next();
        System.out.println("Do you have kids?");
        String kids = input.next();
        System.out.println("What is your kids names? ");
        input.nextLine();
        String kidsName = input.nextLine();
        System.out.println("How old are they?");
        String kidsAge = input.nextLine();
        System.out.println("How much money do you make a year?");
        double salary = input.nextDouble();
        System.out.println("My name is " + name + "\nI am " + age + " years old.\nI am from " + from + "\nAre you married? " + married + "\nMy wife's name is " + wife + "\nDo you have a kids? " + kids + " \nMy kids names are " + kidsName + "\nThey are " + kidsAge + "\nI make over " +salary + "\nHave a great Friday" );


    }
}
