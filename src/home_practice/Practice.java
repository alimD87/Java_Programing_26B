package home_practice;
/*
    Task:
        ask the user to enter the temperature
        if the temperature is above or equal to 70
            print: Its a nice day
                   Go outside, but with your laptop to code java
        if the temperature if less than 70
            print: Its too cold
                   Code more java
     */


import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter outside temperature");
        int temp = input.nextInt();

        if (temp >= 70){
            System.out.println("Outside temp is " + temp + "Go outside with your computer and code java." );
        }else if (temp < 70){
            System.out.println(" Outside temp today is " + temp + " It's cold out, code more java inside.");
        }


    }
}
