package day19_string;

import java.util.Scanner;

public class LongestWithA {

    /*
    create a class LongestWithA
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words:");
        String wordOne = input.next().toLowerCase();
        String wordTwo = input.next().toLowerCase();
        String wordThree = input.next().toLowerCase();

        int oneLen = wordOne.length();
        int twoLen = wordTwo.length();
        int threeLen = wordThree.length();

        if(wordOne.contains("a") && oneLen > twoLen && oneLen > threeLen){
            System.out.println(wordOne + " is the biggest with a");
        } else if (wordTwo.contains("a") && twoLen > oneLen && twoLen > threeLen){
            System.out.println(wordTwo + " is the biggest with a");
        } else if(wordThree.contains("a") && threeLen > oneLen && threeLen > twoLen){
            System.out.println(wordThree + " is the biggest with a");
        } else {
            System.out.println("No single largest word with a");
        }


    }
}

