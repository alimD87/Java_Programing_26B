package day19_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        /*
            Ask the user to enter their first name
            Ask the user to enter their last name
            Print the initials as uppercase letters

            james
            bond
            JB
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next().toUpperCase();
        System.out.println("Enter your last name: ");
        String lastName = input.next().toUpperCase();

        System.out.println("" + firstName.charAt(0) + lastName.charAt(0));

        /*
            1)
            firstName = firstName.toUpperCase();
            char firstLetter = firstName.charAt(0);

            2)
            char firstLetter = firstName.toUpperCase().charAt(0);

         */


    }
}
