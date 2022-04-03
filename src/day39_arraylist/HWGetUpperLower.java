package day39_arraylist;

import java.util.ArrayList;

/*
Write a program that can extract the uppercase and lowercase
characters from a String and store them into separate ArrayLists of
Characters
Ex:
str = “heLLoWoRlD
list1: {h, e, o, o, l}
list2: {L, L, W, R, D}
 */
public class HWGetUpperLower {
    public static void main(String[] args) {
        String str = "heLLoWoRlD";
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)) ){
                list1.add(String.valueOf(str.charAt(i)));
            }else{
                list2.add("" + str.charAt(i));
            }

        }
        System.out.println(list1 + "\n" + list2);
    }

}
