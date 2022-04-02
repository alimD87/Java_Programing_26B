package day31_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {3, 6, 2, 68, 32, -2, 24};
        int [] notSorted = nums; // does not maka a new array object
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));

        // Q: Max and Min from Array
        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length - 1]);

    }
}
