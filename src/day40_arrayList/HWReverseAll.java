package day40_arrayList;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Create a method that will take an ArrayList of Strings and
reverse each element and return an ArrayList of
all reversed words
@param words - Given ArrayList of Strings
@return - ArrayList of Strings
Ex:
Input: {"ted", "talk", "learn"}
Output: {"det", "klat", "nrael"}
 */
public class HWReverseAll {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println( reverse(arr));
    }
    public static ArrayList<String> reverse(ArrayList<String> list){
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result= StringUtil.reverse(list.get(i));
            list.remove(list.get(i));
            list.add(i,result);
        }
        return list;
    }




    }




