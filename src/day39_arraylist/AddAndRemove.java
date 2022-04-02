package day39_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("computer");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");

        String item = list.remove(0); // removes the first index of the ArrayList, which is (computer) and it returns that element (computer) from the method. We store the return value into a String variable called item
        System.out.println(item);
        System.out.println(list);

        boolean bool = list.remove("mouse");
        System.out.println(bool);
        System.out.println(list);


    }
}
