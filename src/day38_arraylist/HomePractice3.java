package day38_arraylist;

import java.util.ArrayList;

public class HomePractice3 {
    /*
    Create an ArrayList of Characters
Fill the ArrayList with letters from A-Z
Print the ArrayList of all the characters
     */
    public static void main(String[] args) {
       ArrayList<Character> UpperLetters = new ArrayList<>();

        for (char i = 'A'; i <= 'Z' ; i++) {
            UpperLetters.add(i);

        }
        System.out.println(UpperLetters);

        UpperLetters.remove(2);
        UpperLetters.remove(8);



        System.out.println(UpperLetters);

        }


    }

