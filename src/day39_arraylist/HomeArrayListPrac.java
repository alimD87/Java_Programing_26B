package day39_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeArrayListPrac {
    public HomeArrayListPrac() {
    }

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter an integer: ");
                integers.add(input.nextInt());
                System.out.println("Added");

            } else if (choice == 2) {
                System.out.println("Enter the number to remove: ");
                int elementsToRemove = input.nextInt();
                if (integers.contains(elementsToRemove)) {
                    integers.remove(Integer.valueOf(elementsToRemove));
                    System.out.println("Removed. ");
                } else
                    System.out.println("Element not found");

            } else if (choice == 3) {
                System.out.println("Your list: " + integers);


            } else if (choice == 4) {
                System.out.println("Good bye");
                break;

            }


        }

    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Your Choice:");

    }
}
