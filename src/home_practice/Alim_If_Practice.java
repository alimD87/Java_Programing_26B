package Home_Practice;


/*
    create a int variable to represent the month number, where 1 is Janurary and 12 is Decemeber.
use the month number input to determine how many days are in that month.
use the following data to help you determine the number of days in each month:

    Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
    Months that has 30 days: 4, 6, 9, 11
    Month that has 28 days: 2

    ex:
        12
        31 days

    ex:
        9
        30 days

     */

import java.util.Scanner;

public class Alim_If_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter month that has 31 days");
        int month31 = input.nextInt();
        System.out.println("Enter month that has 30 days");
        int month30 = input.nextInt();
        System.out.println("Enter month that has 28 days");
        int month28 = input.nextInt();



////        int month = 2;
       boolean has31Days = month31 == 1 || month31 == 3 || month31 == 5 || month31 == 7 || month31 == 8 || month31 == 10 || month31 == 12;

        boolean has30Days = month30 == 4 || month30 == 6 || month30 == 9 || month30 == 11;
        boolean has28Days = month28 == 2;

        if (has31Days) {
            System.out.println("This months have 31 days");
        }else if (has30Days){
            System.out.println("This months have 30 days");
        }else if (has28Days){
            System.out.println("This month has 28 days");

        }



    }
}
