package Home_Practice;


//create a class Diver
//
//You are diving in the ocean. Your oxygen tank has a certain level (number)
//
//        declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:
//
//        Above 90 - Your tank is full
//        Above 80 - Still okay
//        Above 70 - Don't go too far
//        Above 60 - Start to head back
//        Above 50 - Be careful now you at at 50%


import java.util.Scanner;

public class Diver {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter oxygen level");
        int oxygenLevel = input.nextInt();

//        int oxygenLevel = 80;

        if (oxygenLevel <= 90 ){
            System.out.println("Your tank is full");
        } if(oxygenLevel <= 81){
            System.out.println("Still okay");
        } if (oxygenLevel >=71 ){
            System.out.println("Don't go far");
        } if (oxygenLevel <= 60){
    } if (oxygenLevel >=50) {
            System.out.println("Be careful now you at 50%");
        }



        }

}
