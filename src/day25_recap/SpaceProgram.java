package day25_recap;

import java.util.Scanner;

public class SpaceProgram {
    /*
    Space program [String, Loops]

    Given a String return a version of with spaces between all of the letters.
    If there is already a space in the String put an underscore

        Ex: java	-> j a v a
            space 	-> s p a c e
            more words -> m o r e _ w o r d s

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        String fixed = "";

        for(int i = 0; i < str.length(); i++){

            if (str.charAt(i) == ' ') {
                fixed += "_ ";
            } else {
                fixed += str.charAt(i) + " ";
            }

        }

        System.out.println(fixed.trim());

    }




}
