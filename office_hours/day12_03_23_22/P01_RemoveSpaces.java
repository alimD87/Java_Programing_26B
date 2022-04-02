package day12_03_23_22;

import java.util.Arrays;

public class P01_RemoveSpaces {
    public static void main(String[] args) {

      /*
          Task 3 :    Write a method that can remove  all extra space from String
    			 Input: "  Hello world      I      love      Java    "
        	     Output: Hello world I love Java
       */


        String input="  Hello world      I      love      Java    ";
        removeSpaces(input);



    }

    public static void removeSpaces(String str) {

        String[] s = str.trim().split(" ");
        System.out.println(Arrays.toString(s));

        // System.out.println(s[2].length());  to see we have empty String

        String result="";
        for (String each : s) {

            if(!each.isEmpty()){
                result+=each+" ";
            }

        }

        System.out.println(result);


    }

}
