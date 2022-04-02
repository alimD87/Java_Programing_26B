package day24_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        /*
        Remove Duplicates
            Write a program that can remove duplicates from a String
             Ex:
            Input: abcabc
            Output: abc
         */

        String s = "abcabc";
        String unique = "";

        for(int i = 0; i < s.length(); i++){
            if(!unique.contains("" + s.charAt(i))){
                unique += s.charAt(i);
            }
        }

        System.out.println(unique);


    }
}


/*

        String s = "abcabc";
        String unique = "";

    for(int i = 0; i < s.length(); i++){

        iteration 1:
            i = 0
            charAt(i) --> charAt(0) --> a
            unique = "";

            if(!unique.contains("a")){  unique.contains("a") --> false --> !false --> true
                unique += s.charAt(i);
            }

            unique = "a";
            i++;

        iteration 2:
            i = 1
            charAt(i) --> charAt(1) --> b
            unique = "a";

            if(!unique.contains("b")){  unique.contains("b") --> false --> !false --> true
                unique += s.charAt(i);
            }

            unique = "ab";
            i++;

        iteration 3:
            i = 2
            charAt(i) --> charAt(2) --> c
            unique = "ab";

            if(!unique.contains("c")){  unique.contains("c") --> false --> !false --> true
                unique += s.charAt(i);
            }

            unique = "abc";
            i++;

        iteration 4:
            i = 3
            charAt(i) --> charAt(3) --> a
            unique = "abc";

            if(!unique.contains("a")){  unique.contains("a") --> true --> !true --> false
                unique += s.charAt(i);
            }

            unique = "abc";
            i++;

        continues for iteration 5 and 6


 */
