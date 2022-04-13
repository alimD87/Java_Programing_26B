package day45_custom_classes;

import java.util.ArrayList;

public class MyOffers {
    public static void main(String[] args) {

        Food.Offer first = new Food.Offer("Google", "Texas", 200_000, true, 15);
        System.out.println(first);

        ArrayList<Food.Offer> allOffers = new ArrayList<>();
        allOffers.add(first);

        allOffers.add(new Food.Offer("Amazon", "New York", 180_000, true, 15));

        System.out.println(allOffers);

    }
}
