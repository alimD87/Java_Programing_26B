package day29_arrays;

import java.util.Arrays;

public class MoveZero {

    /*
    Move Zeros
    Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position
    Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes
    Ex: Input:
    [10, 0, 5, 0, 1, 0]
    Output:
    [10, 5, 1, 0, 0, 0]
     */
    public static void main(String[] args) {

        int [] nums = {10, 0, 0, 0, 0, 5, 0, 1, 0};
        int [] fixed = new int[nums.length];
        int index = 0; // variable to keep track of indexes of the fixed array

//        for(int i = 0; i < nums.length; i++){
//
//            if(nums[i] != 0){
//                fixed[index++] = nums[i]; //reading the element at position i of the nums array and storing it into the fixed array and position index. after storing the value index variable is incremented by 1
//            }
//        }

        for(int each : nums){
            if(each != 0){
                fixed[index] = each;
                index++;
            }
        }

        System.out.println(Arrays.toString(fixed));

    }

}
