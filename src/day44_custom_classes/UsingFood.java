package day44_custom_classes;

import java.util.Arrays;

public class UsingFood {
    public static void main(String[] args) {
        Food food1 = new Food ("Burger ", 8, 1.5);
//        System.out.println(food1);

        Food food2 = new Food("Chicken", 5, 2.5 );
//        System.out.println(food2);

        Food food3 = new Food("Bread", 2, 3.5);
//        System.out.println(food3);


        Food [] foodArray = {food1,food2,food3};
        System.out.println(Arrays.toString(foodArray));

        for(Food each : foodArray ){
            if (each.name.startsWith("a")){
                System.out.println(each.name + " starts with 'a");
            }

        }

        for (Food each : foodArray){
            if (each.totalPrice > 20){
                System.out.println(each.name+ " has total price $20");
            }
        }


    }
}
