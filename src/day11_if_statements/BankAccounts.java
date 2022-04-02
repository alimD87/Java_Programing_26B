package day11_if_statements;

import java.util.Scanner;

public class BankAccounts {
    /*
    Task: Hard code -> Dynamic

    Create a double value for the account balance. // 100
    Create a double value for how much you want to withdraw // 500

    Check the balance after the withdrawal
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance: -100

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance");
        double balance = input.nextDouble();
        System.out.println("How much are you withdrawing");
        double withdraw = input.nextDouble();

        // hard coded version
//        double balance = 400;
//        double withdraw = 1000;

        // withdraw some amount of money from my balance
        balance -= withdraw; // balance = balance - withdraw

        if (balance < 0) {
            System.out.println("Took out too much money, $100 overdraft applied");
            System.out.println("Balance before fee: " + balance);
            balance -= 100; // balance = balance - 100;
        }

        System.out.println("Balance $" + balance);

    }
}
