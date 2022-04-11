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
        ArrayList <String> sixWords = new ArrayList<>();

        for (int i = 0, j=0; i < list.size(); i++) {
            String word = list.get(i);
            if (word.length()>6){
                sixWords.add(word);
            }

        }

        System.out.println(sixWords);

    }
}
