package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HWTargetWord {
    /*
    Given an ArrayList of Strings and a target word (String) print how many
times the target word is in the ArrayList
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
Target: java
Output:
2
     */
    public static void main(String[] args) {

        String target = "java";
        int count = 0;

        ArrayList<String> targetWord = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium" ));
        for (String each : targetWord){
            if (each.equals(target)){
                count++;
            }
        }
        System.out.println(count);


    }
}
