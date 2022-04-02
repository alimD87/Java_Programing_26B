package Home_Practice;

import java.util.Scanner;

public class Alim_5_Replit_Ifs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = input.nextInt();
        System.out.println("Enter second number:");
        int second = input.nextInt();
        System.out.println("Enter third number:");
        int third = input.nextInt();



        if (first > second && first < third){
            System.out.println("middle number is: " + first);
        } else if (first < second && first > third){
            System.out.println("middle number is: " + first);
        } else if (second > first && second < third){
            System.out.println("middle number is: " + second);
        } else if (second < first && second > third){
            System.out.println("middle number is: " + second);
        } else {
            System.out.println("middle number is: " + third);
        }




//        int midNumber = input.nextInt();
//        if(midNumber==first+ second+ third){
//        }
//        System.out.println("Middle number is " + midNumber);
    }
}
