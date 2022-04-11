package home_practice;

import java.util.ArrayList;
import java.util.Arrays;
/*
         Create a method that will take an ArrayList of words and returns an ArrayList of words that have a length of more than 6

         Example:
         Input -> "Chocolate", "Rabbit", "Egg", "Easter", "Hunt", "Basket", "Marshmallow", "Bowtie", "Rose"

         Output -> "Chocolate", "Marshmallow"
      */
public class ArrayListTask2 {

    public static ArrayList<String> moreThenSix(ArrayList<String> list, int strLength) {

        list.removeIf(word -> word.length() < strLength); // lambda expression (Arrow ->) separates the parameters from left side  from the implementation right side
        return list;
    }
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Chocolate", "Rabbit", "Egg", "Easter", "Hunt", "Basket", "Marshmallow", "Bowtie", "Rose"));
        System.out.println(moreThenSix(words,  7));
    }
}
