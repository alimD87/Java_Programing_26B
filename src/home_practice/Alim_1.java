package Home_Practice;

import java.util.Scanner;

public class Alim_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String name = input.nextLine();
        System.out.println("Please provide me with your full address");
        String address = input.nextLine();
        System.out.println("How many people live with you");
        int peopleLive = input.nextInt();
        System.out.println("How many cars in your residence");
        int cars = input.nextInt();
        System.out.println("What is your household income ");
        double income = input.nextInt();
        System.out.println("Congratulation you are approved ");

        System.out.println("Full name  = " +name);
        System.out.println("Full address = " +address );
        System.out.println("How many people live in your residency = " + peopleLive );
        System.out.println("How many cars in you residency  =" + cars);
        System.out.println("What is your income = " +income);
    }
}
