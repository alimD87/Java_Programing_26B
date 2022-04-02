package day28_arrays;

public class AddElements {
    /*

        declare and assign an array of numbers

            {3, 6, 10}

        sum all the numbers in the array

     */

    public static void main(String[] args) {

        int [] nums = {3, 6, 10};
        System.out.println("Hardcoded sum: " + (nums[0] + nums[1] + nums[2]));

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
           sum += nums[i];
        }

        System.out.println(sum);

    }
}
