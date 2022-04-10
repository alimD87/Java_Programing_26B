package day41_arraylist;
/*
    Given an ArrayList of words switch position for
    each pair in the List. A pair is an element and
    the element next to it.
    The given ArrayList will always have an even
    number of elements so each element will
    always have a single pair

    Ex:
    Input: {"Cat", "in", "the", "hat"}
    There is two pairs:
    "Cat" and "in"
    "the" and "hat"
    Output: {"in", "Cat", "hat",
    "the”}
     */
import java.util.ArrayList;
import java.util.Arrays;

public class BadPairs {

    public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> list){

        ArrayList<Integer> goodPairs = new ArrayList<>();

        for (int i = 0; i < list.size(); i += 2) {
            if (list.get(i) < list.get(i + 1)){
                goodPairs.add(list.get(i));
                goodPairs.add(list.get(i + 1));
            }
        }
        return goodPairs;
    }
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));

        System.out.println(removeBadPairs(nums));


    }
}
