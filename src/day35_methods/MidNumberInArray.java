package day35_methods;

import java.util.Arrays;

public class MidNumberInArray {
      /*
    Min Number

create a method that will accept an int array and return the smallest number from the array
     */

    public static int minNumber(int [] nums){

        int min = nums[0];

        for (int num :nums){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    public static int minNumberSort(int [] nums){
        Arrays.sort(nums);
        return nums[0];
    }

}
