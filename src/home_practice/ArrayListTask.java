package home_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask {
    public static void main(String[] args) {
        /*
         Create a method that will take an ArrayList of words and returns an ArrayList of words that have a length of more than 6

         Example:

         Input -> "Chocolate", "Rabbit", "Egg", "Easter", "Hunt", "Basket", "Marshmallow", "Bowtie", "Rose"

         Output -> "Chocolate", "Marshmallow"
      */


        ArrayList<String> list = new ArrayList<>(Arrays.asList("Chocolate", "Rabbit", "Egg", "Easter", "Hunt", "Basket", "Marshmallow", "Bowtie", "Rose"));
        ArrayList <String> sixMoreWords = new ArrayList<>(); //Created a New ArrayList

        for (int i = 0, j=0; i < list.size(); i++) { // (i) is Adding new element at the end of the list and (j) checking the condition of the word
            String word = list.get(i); // returns the element at specified position.
            if (word.length()>6){ // to check if length more than 6 letters
                sixMoreWords.add(word); // this method is used to add our string word too the end of the list.
            }

        }

        System.out.println(sixMoreWords);

    }
}
