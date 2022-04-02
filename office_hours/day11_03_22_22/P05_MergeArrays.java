package day11_03_22_22;

import java.util.Arrays;

public class P05_MergeArrays {
    public static void main(String[] args) {

        /*
        	Task 2 :   Create a method that can print out the combination of two integer arrays
                int[] array1 = {1,2,3,4};
                int[] array2 = {5,6,7,8,9,10};
                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
         */

        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,11,9,10};

        mergeTwoArray(array1,array2);

    }

    public  static void mergeTwoArray(int[] array1, int[] array2) {

        int[] arr3=new int[array1.length+ array2.length];

        int i=0;

        for (int each : array1) {

            arr3[i++]=each;

            /*
            arr3[0]=1
            arr3[1]=2
            arr3[2]=3
            arr3[3]=4
             */
        }


        for (int each : array2) {

            arr3[i++]=each;

        }

        Arrays.sort(arr3);  // to sort our new Arrays
        System.out.println(Arrays.toString(arr3));








    }
}
