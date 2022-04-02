package day16_review;

import java.util.Scanner;

public class Calculator {

    /*
    declare and assign 2 number variables
    declare and assign a char variable for an operator

    create a calculator based on the operator picked
        + : add num1 and num2
        - : minus num1 and num2
        * : multiply num1 and num2
        / : divide num1 and num2
        any other char: "invalid operator"
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one: ");
        double numOne = input.nextDouble();
        System.out.println("Pick operators: + - * / % ");
        String operator = input.next();
        System.out.println("Enter number two: ");
        double numTwo = input.nextDouble();

        double result = 0;
        boolean validCalc = true;

        switch (operator){
            case "plus":
            case "+":
                result = numOne + numTwo;
                break;
            case "-":
                result = numOne - numTwo;
                break;
            case "*":
            case "x":
                result = numOne * numTwo;
                break;
            case "/":
                if(numTwo != 0){
                    result = numOne / numTwo;
                } else {
                    System.out.println("Cannot divide by 0");
                    validCalc = false;
                }
                break;
            case "%":
                if(numTwo != 0){
                    result = numOne % numTwo;
                } else {
                    System.out.println("Cannot take remainder of 0");
                    validCalc = false;
                }
                break;
            default:
                System.out.println(operator + " is not a valid operators for this calculator");
                validCalc = false;
        }

        if(validCalc){
            System.out.println(numOne + " " + operator + " " + numTwo + " = " + result);
        }


    }
}
