package day25_recap;

import java.util.Scanner;

public class MultiplyEnd {
    /*

Multiply End [String, Loops]

    Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

        Ex:
            Input:
                Hello?
                3
            Output:
                Hello????

        Ex:
            Input:
                java
                5
            Output:
                javaaaaaa
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.nextLine();
        System.out.println("How many times do you want to repeat the ending");
        int repeat = input.nextInt();

        for(int i = 0; i < repeat; i++){
            word += word.charAt(word.length() - 1);
        }

        System.out.println(word);

    }

}
