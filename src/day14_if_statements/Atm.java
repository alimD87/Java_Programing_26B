package day14_if_statements;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*** Welcome to ATM ***\nPlease Enter your card and then type your pincode");
        int pincode = input.nextInt();

        int expectedPin = 2342;

        if(pincode == expectedPin){

            System.out.println("Logged in");
            System.out.println("Select a number");
            System.out.println("\t1)Check Balance");
            System.out.println("\t2)Withdraw");
            System.out.println("\t3)Deposit");
            int option = input.nextInt();

            if(option == 1){
                System.out.println("Your balance is: $" + 10_000_000);
            } else if(option == 2){
                System.out.println("How much do you want to withdraw?");
                double money = input.nextDouble();
                System.out.println("Withdrawing " + money);
            } else if(option == 3){
                System.out.println("Please deposit the money");
            } else {
                System.out.println("Invalid selection. Exiting account");
            }

        } else {
            System.out.println("Invalid pin. Please try again");
        }


    }
}
