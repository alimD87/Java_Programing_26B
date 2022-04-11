package day2_04_11_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P02_FreqOfChars {
    /*
    Write a program that can find the frequency of character from a String
                               ***DO NOT use nested loop

                               "AABCCDDEE"  ==> "ABCDE"
                                output=A2B1C2D2E2

     */
    public static void main(String[] args) {

        String str = "AABCCDDEE";


        String [] strArray = str.split("");
        System.out.println(Arrays.toString(strArray));

        // same code as above but with ArrayList<>
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strArray));
        System.out.println(strList);

        String result = "";
        for(String each : strList){
            int freq = Collections.frequency(strList, each);
            if (result.contains(each)){
                continue;
            }
            result += each + freq;
        }
        System.out.println(result);


        System.out.println("================toCharArray========================");

        //String + toCharArray() --> char[] + for loop    --> ArrayList<Character>

        String str2 = "AABCCDDEE";

        char[] chArray = str2.toCharArray();
        System.out.println(Arrays.toString(chArray));

        ArrayList<Character> chList = new ArrayList<>();

        for (Character each : chArray) {
            chList.add(each);
        }
        System.out.println(chList);

        String result2="";
        for (Character each : chList) {
            int freq = Collections.frequency(chList,each);

            if(result2.contains(""+each)){
                continue;
            }

            result2 += "" + freq + each;
        }

        System.out.println(result2);
    }
    }

