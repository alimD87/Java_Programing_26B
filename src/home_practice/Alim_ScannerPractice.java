package Home_Practice;

import java.util.Scanner;

public class Alim_ScannerPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me about yourself");
        String  name = input.nextLine();
        System.out.println("What is your hobbies");
        String hobby = input.nextLine();
        System.out.println("How many kids do you have");
        int kids = input.nextInt();
        System.out.println("What is your profession ");
        input.nextLine();
        String profession = input.nextLine();
        System.out.println("How much do you make ");
        double salary = input.nextDouble();
        System.out.println("Thank you for coming ");

        System.out.println("Biography " + name + "\n My hobbies are " + hobby + " \nI have " + kids + "kids \nI am a " + profession + "\nMy salary is " + salary);
    }

}
