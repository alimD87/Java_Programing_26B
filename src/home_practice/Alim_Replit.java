package Home_Practice;


import java.util.Scanner;

public class Alim_Replit {


      public static void main(String[] args) {
            //Enter your code here

          Scanner scan = new Scanner(System.in);


            System.out.println("Enter your email");
            String email = scan .next();
            scan.nextLine();

            System.out.println("Enter your street");
            String street = scan.nextLine();
            System.out.println("Enter your city");
            String city = scan.next();
            System.out.println("Enter your state");
            String state = scan.next();
            System.out.println("Enter your first name");
            String firstName = scan.next();
            System.out.println("Enter your last name");
            String lastName = scan.next();
            System.out.println("Enter your age");
            int age = scan.nextInt();
            System.out.println("Enter your zipcode");
            int zipCode = scan.nextInt();
            System.out.println("Enter your height");
            double height = scan.nextDouble();
            System.out.println("Enter your weight");
            double weight = scan.nextDouble();
            System.out.println("Is married");
            boolean married = scan.nextBoolean();
            System.out.println("Enter your work phone number");
            long workPhoneNumber = scan.nextLong();
            System.out.println("Enter your personal phone number");
            long personalNumber = scan.nextLong();

            System.out.println(firstName + lastName + email + street + city + state + age + zipCode + height + weight + married + workPhoneNumber + personalNumber);

        }
    }
