package day40_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {

        //OPTION 1
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drink");
        drinks.add("soda");
        System.out.println(drinks);

        //OPTION2
        ArrayList<String> drinks2 = new ArrayList<>(drinks);
        System.out.println(drinks2);

        //OPTION 3
        String [] allDrinks = {"coffee", "tea", "energy drink", "soda"};
        //ArrayList<String> drinks3 = new ArrayList<>(allDrinks); not valid because the array is not a valid argument
        ArrayList<String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks));
        System.out.println(drinks3);

        //OPTION 4
        ArrayList<String> drinks4 = new ArrayList<>(Arrays.asList("coffee", "tea", "energy drink", "soda"));
        System.out.println(drinks4);

        //OPTION 5
        ArrayList<String> drinks5 = new ArrayList<>();
        drinks5.addAll(Arrays.asList("coffee", "tea", "energy drink", "soda"));
        System.out.println(drinks5);



    }
}
