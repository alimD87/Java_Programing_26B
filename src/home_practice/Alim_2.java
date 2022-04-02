package Home_Practice;

import java.util.Scanner;

public class Alim_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter where do you want to go on your vacation");
        String vacation = input.nextLine();
        System.out.println("For how many days:");
        int days = input.nextInt();
        System.out.println("How many people will go with you");
        int howManyPeople = input.nextInt();
        System.out.println("How much money do you plan to take with you:");
        double money = input.nextInt();
        System.out.println("Do plan renting a car:");
        boolean rentCar = input.nextBoolean();

        System.out.println("We are planing to go " + vacation + " with my family. For about " + days + "days. \nI am planing to go with my family of " + howManyPeople + " I'm planing to take with me $" +money + "\n Are you planing renting a car? " + rentCar + "\nIt should be fun.");
    }
}
