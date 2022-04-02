package day32_arrays;

import java.util.Arrays;

public class AverageOfEach {

    /*

    Given a 2D array find the average of each inner array
    and extra: average of the whole array

    Ex:

        3, 4, 5, 6
        5, 2, 6
        10, 20, 30

     */
    public static void main(String[] args) {

        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };

        double total = 0;
        int totalLength = 0;

        for(int [] eachArray : nums){

            //System.out.println(Arrays.toString(eachArray));

            double sum = 0;

            for(int eachNumber : eachArray){
                sum += eachNumber;
            }

            System.out.println(Arrays.toString(eachArray) + " the average is: " + (sum/ eachArray.length));
            total += sum;
            totalLength += eachArray.length;
        }

        System.out.println("Average of the whole 2D array: " + (total/totalLength));


    }



}
