package Day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumber {
     /*
    String numbers to sum
    Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
    Ex:
    Input:
    “123”, “34”, “513” Output:
    [ 6, 7, 9 ]
     */

    public static ArrayList<Integer> sumFromString(ArrayList<String> list ){

        ArrayList<Integer> sums = new ArrayList<>();

        for(String each : list){ // goes through every element of the ArrayList from params

            int currentSum = 0;

            for(String eachDigit : each.split("")){  // converting the String, each, to an array by split with an empty space, it means the each String will be seperated with each character as separate String elements
                // "123" --> ["1", "2", "3" and then you loop through that array

                currentSum += Integer.parseInt(eachDigit);

            }

            sums.add(currentSum);
        }

        return sums;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "513", "34"));
        System.out.println(sumFromString(list));
    }


}
