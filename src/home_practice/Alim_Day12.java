package Home_Practice;

//create a class UserAndPass
//ask the user to enter a username and password. Check if they are valid based on the following requirements:
//
//        - The password cannot be less than 5 characters
//        If it is less print: "Password cannot be less than 5 characters"
//        If it is more than or equal to 5 print: "Valid password"
//
//        - Also, the password should not contain the username
//        If the password has the username in it print: "Invalid password, username should not be in it" and in that case change the password to have the value: "password"
//
//        Print the information in the end


import java.util.Scanner;

public class Alim_Day12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = input.next();
        System.out.println("Enter password");
        String password = input.next();

        if (password.length() < 5 ){
            System.out.println("Password can not be less then 5 characters");
        }else if (password.length()>=5 && password.equals(5)){
            System.out.println("Valid password");
        }else if (password.contains(userName)){

            System.out.println("Invalid password user can not be in it");
        }else{
            System.out.println("log in seccessfull ");
        }



    }
}





//    Scanner input = new Scanner(System.in );
//        System.out.println("Please enter a username");
//                String username = input.next();
//                username = username.toLowerCase();
//                System.out.println( username );
//
//                System.out.println("Please enter a password");
//                String password = input.next();
//
//                if (password.length()>=8 && password.equals("alimdjemilev")){
//                System.out.println(" Logged in with " + username);
//
//                }else{
//                System.out.println("Invalid password");
//

