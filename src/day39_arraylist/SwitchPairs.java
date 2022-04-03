package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
Switch Pairs
Given an ArrayList of words switch position for
each pair in the List. A pair is an element and
the element next to it.
The given ArrayList will always have an even
number of elements so each element will
always have a single pair.
Ex:
Input: {"Cat", "in", "the", "hat"}
There is two pairs:
"Cat" and "in"
"the" and "hat"
Output: {"in", "Cat", "hat",
"the”}
 */
public class SwitchPairs {
    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));
        for (int i = 0; i <list.size(); i+=2) {
            String newList = list.get(i);
            list.set(i,list.get(i+1));
            list.set(i+1,newList);

        }
        System.out.println(list);
    }
}
