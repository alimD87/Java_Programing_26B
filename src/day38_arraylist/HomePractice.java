package day38_arraylist;

import java.util.ArrayList;

public class HomePractice {
    /*
    Practice flow:

Create an ArrayList of Strings
add these elements:
	add Hat
	add Shoes
	add Jacket in middle of Hat and Shoes
	add Towel in the beginning
	add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made

     */
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();
        str.add("Hat");
        str.add("Shoes");
        str.add(1,"Jacket");
        str.add("Towel");
        str.add(3,"Car");

        System.out.println(str);


    }



}

