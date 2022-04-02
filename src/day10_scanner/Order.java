package day10_scanner;

import java.util.Scanner;

public class Order {
    /*
    - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the product name");
        String productName = input.nextLine();
        System.out.println("Please enter the price of the " + productName);
        double price = input.nextDouble();
        System.out.println("How many " + productName + "'s do you want to buy");
        int quantity = input.nextInt();

        input.nextLine(); // this will grab the enter input from the above line

        System.out.println("What is the full name for the order");
        String fullName = input.nextLine();

        double totalCost = price * quantity;

        String order = fullName + ", your order for " + quantity + " " + productName +  " has been placed. Your total is $" + totalCost;

        System.out.println(order);

    }



}
