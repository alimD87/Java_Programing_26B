package day41_arraylist;

import day40_arrayList.ArrayListWithMethods;
import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Reverse All
Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of
all reversed words
@param words - Given ArrayList of Strings @return - ArrayList of Strings
Ex:
Input: {"ted", "talk", "learn"} Output: {"det", "klat", "nrael"}
     */
public class ReverseAll {

    public static ArrayList<String> reverseAll(ArrayList<String> list){

        ArrayList<String> reverseWords = new ArrayList<>();

        for (String each : list){

            reverseWords.add(StringUtil.reverse(each));


        }
        return reverseWords;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ted", "Talk", "learn"));
        System.out.println(reverseAll(list));

        System.out.println(reverseAll(ArrayListWithMethods.getDaysOfWeek()));
        System.out.println();
    }
}
