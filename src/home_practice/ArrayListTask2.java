package home_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask2 {

    public static ArrayList<String> moreThenSix(ArrayList<String> list, int maxLength) {

        list.removeIf(word -> word.length() < maxLength);

        return list;
    }

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Chocolate", "Rabbit", "Egg", "Easter", "Hunt", "Basket", "Marshmallow", "Bowtie", "Rose"));
        System.out.println(moreThenSix(words,  7));
    }
}
