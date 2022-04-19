package day48_encapsulations.pizza;

import day48_encapsulations.pizza.Pizza;

public class PizzaStore {
    public static void main(String[] args) {

        Pizza first = new Pizza("large",3);
        System.out.println(first);

        //first.setNumberOfToppings =2; we can't call this way
        first.setNumberOfToppings(2);
        System.out.println(first);

        Pizza second = new Pizza("", -2);
        System.out.println(second);

        second.setSize("Small");
        second.setNumberOfToppings(-3);
        System.out.println(second);

    }
}
