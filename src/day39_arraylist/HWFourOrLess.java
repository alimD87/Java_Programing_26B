package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HWFourOrLess {
    public static void main(String[] args) {
/*
Given an ArrayList of Strings, go through and find Strings that are 4
characters or less. Take those Strings and put them into a different
ArrayList. Print that ArrayList of words
Ex:
Input:
“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
 */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
        ArrayList <String> fourOrLess = new ArrayList<>();

        for (int i = 0, j=0; i < list.size(); i++) {
            String word = list.get(i);
            if (word.length()<=4){
                fourOrLess.add(word);
            }

        }
        System.out.println(fourOrLess);

    }
}
