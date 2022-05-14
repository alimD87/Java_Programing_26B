package day57_exceptions.learn;

import java.util.InputMismatchException;
import java.util.Scanner;


    public class ThirdTry {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            try {
                System.out.println("enter a number");
                int num = input.nextInt();


            }catch (InputMismatchException obj){
                obj.printStackTrace(); // shows the exception message in the console
            }


            System.out.println("DONE");



        }
}
