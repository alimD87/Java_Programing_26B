package day12_if_statements;

import java.util.Scanner;

public class Biggest {

    /*

        declare and assign 3 int variables
        between the 3 numbers find the print the biggest one

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers. Use enter after each");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

//        int num1 = 40;
//        int num2 = 40;
//        int num3 = 40;

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is the biggest");
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " is the biggest");
        } else {
            System.out.println(num3 + " is the biggest");
        }


    }
}
