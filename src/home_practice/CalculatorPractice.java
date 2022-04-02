package Home_Practice;

import java.util.Scanner;

public class CalculatorPractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        double num1 = s.nextDouble();
        char op = s.next().charAt(0);
        double num2 = s.nextDouble();

        if (op == '+'){
            System.out.println("Result = " + (int) ( num1 + num2));
        }else if (op == '-'){
            System.out.println("Result = " + (int) (num1 - num2));
        }else if (op == '*'){
            System.out.println("Result = " + (int) (num1 * num2));
        }else if (op == '/'){
            System.out.println("Result = " + num1 / num2);
        }

    }
}
