package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an ArrayList of passwords (String). Hide each password in a star
(*) format where each character is a star and print the ArrayList of
hidden passwords
Ex:
Input:
{"one", "hi", "hold}
Output:
[ ***, **, **** ]
 */
public class HWPassword {
    public static void main(String[] args) {

        //String star = "*";

        ArrayList<String> password = new ArrayList<>(Arrays.asList("one", "hi", "hold"));

        for (int i = 0; i < password.size(); i++) {
            String stars = "";
            stars = "*".repeat(password.get(i).length());
            password.set(i,stars);
        }
        System.out.println(password);
    }
}
