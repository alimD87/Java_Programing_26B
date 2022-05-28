package day62_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        Map<String, Double> store = new HashMap<>();
        store.put("Water", 1.5);
        store.put("Coffee", 2.5);
        store.put("Apples", 0.99);
        store.put("Bread", 2.35);
        store.put("Cucumbers", 3.89);

        System.out.println("Store Inventory");

//        for(String each : store.keySet()){ // returns the set of keys, then we use those keys to get information from the map
//            System.out.println("\tItem: " + each + " for $" + store.get(each)); //using get method from the map to get the value based on the key
//        }

        for(Map.Entry<String, Double> each : store.entrySet()){ // returns the entry (key/value pairs) from the map
            System.out.println("\tItem: " + each.getKey() + " for $" + each.getValue());  // getValue method is the method from the Entry, which gives value of the current entry
        }

        System.out.println(store.values()); // returns the values from map as a collection type

        Scanner input = new Scanner(System.in);
        System.out.println("What item do you want?");
        String item = input.nextLine();

        System.out.println(store.containsKey(item) ? item + " is in stock for $" + store.get(item) : "Not available in this store");

    }
}

