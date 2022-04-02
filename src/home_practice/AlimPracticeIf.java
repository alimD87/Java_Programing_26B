package home_practice;

import java.util.Scanner;

/*
        create a double variable for your hourly rate
        create a double variable for the number of hours worked
        calculate your net pay, with consideration of overtime pay
            if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
                (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
     */
public class AlimPracticeIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your hourly rate");
        double hourlyRate = input.nextDouble();
        System.out.println("Enter how many hours you worked");
        double hoursWorked = input.nextDouble();
        System.out.println("Enter how many over time you worked ");
        double overTime  = input.nextDouble();


        if (hoursWorked == 40) {
            System.out.println("Your weekly pay is $" + hourlyRate * hoursWorked );
       }else if (hoursWorked + overTime > 41 || hourlyRate + overTime <=50){
            System.out.println("Your over time pay is " + hourlyRate * 1.5 + overTime  );

        }
    }
}
