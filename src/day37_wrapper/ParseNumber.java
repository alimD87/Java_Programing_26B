package day37_wrapper;

import java.util.Scanner;

public class ParseNumber {

    public static void main(String[] args) {

        String year = "2022";

        System.out.println("This year " + year);
        System.out.println("Next year will be " + (year + 1));

        int numYear = Integer.parseInt(year);

        System.out.println("This year " + numYear);
        System.out.println("Next year will be " + (numYear + 1));
        System.out.println("-------------------------------------");


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: I am X years old");
        String str = input.nextLine();

        // Other approach with array
        /*
        String [] arr = str.split(" ")[2];
        String agePart = arr[2];
         */

        String agePart = str.split(" ")[2];
        int age = Integer.parseInt(agePart);
        System.out.println("In five years, you will be " + (age + 5));


    }
}
