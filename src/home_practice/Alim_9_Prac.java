package Home_Practice;

import java.util.Date;
import java.util.Scanner;

public class Alim_9_Prac {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        System.out.println("Enter your address:");
        String address = input.nextLine();
        System.out.println("Are you a student of Cydeo:");
        boolean student = input.nextBoolean();
        System.out.println("Are you married:");
        boolean married = input.nextBoolean();
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Do you have kids: ");
        boolean kids = input.nextBoolean();
        System.out.println("Enter number of kids you have:");
        byte numbOfKids = input.nextByte();
        System.out.println("Enter their names");
        input.nextLine();
        String nameOfKids = input.nextLine();
        System.out.println("Enter their age's");
        String kidsAges = input.nextLine();
        Date now = new Date();

        String print = "My name is " + name + ".\nMy address is " + address + ".\nI'm a student " + student + ".\n Are you married? " + married + ".\nI'm " + age + " years old.\nDo you have a kids? " + kids + ".\nI have " + numbOfKids + " kids.\nTheir names are " + nameOfKids + ".\nHow old their are? " + kidsAges + "\n Thank You!" +now;

            System.out.println(print);





        }
    }
