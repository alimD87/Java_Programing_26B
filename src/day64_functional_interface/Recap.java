package day64_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Recap {
    public static void main(String[] args) {

        // 1.1 Create a function that can verify if a number contains duplicate digits

        Predicate<Integer> verifyDuplicates = n -> {

            String str = n + "";
            String uniques = "";

            for(int i = 0; i < str.length(); i++){
                if(!uniques.contains(str.charAt(i) + "")){ // the first time a number digit is found in our str String
                    uniques += str.charAt(i);
                } else {
                    return true; // if the unique String has the number already, it means we have found it sometime before in the number already, which mean the digit is duplicate
                }
            }
            return false; // all digits were unique, so the else statement of the if was next run, which means no duplicates
        };

        System.out.println(verifyDuplicates.test(123)); // 123
        System.out.println(verifyDuplicates.test(1231)); // 123

        System.out.println();

        // 1.3 Create a function that can return the longest String from a List of String

        //  List<String> -> parameter
        // , String  -> return type

        Function<List<String>, String > longestStringFromList = (list) -> {
            String longest = "";
            for(String each : list){
                if(each.length() > longest.length()){
                    longest = each;
                }
            }
            return longest;
        };

        System.out.println(longestStringFromList.apply(new ArrayList<>(Arrays.asList(
                "hello", "apple", "java", "really long word", "small word"
        )))); // the apply method accepts a List as the argument because the reference of longestStringFromList accepts the List type, and it returns String



    }
}


/*

    if you wanted to make this one reusable:

        this is in main method, so it was local to only this class main method

        Function< List<String>, String > longestStringFromList = (list) -> {
            String longest = "";
            for(String each : list){
                if(each.length() > longest.length()){
                    longest = each;
                }
            }
            return longest;
        };

        ------------------

        defined the implementation in the class level, not the main method:


     class{

        public static Function< List<String>, String > longestStringFromList = (list) -> {
            String longest = "";
            for(String each : list){
                if(each.length() > longest.length()){
                    longest = each;
                }
            }
            return longest;
        };

        above is accessible by className.longestStringFromList


        }

 */

