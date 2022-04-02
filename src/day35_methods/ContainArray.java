package day35_methods;

public class ContainArray {
    /*
    Contains
create a method that will accept an int array and an int number. Check and return if the given number is in the array.

    */

    public static boolean contains(int [] nums, int element){

       for (int each : nums){

           if (each == element){
               return true;
           }
       }


        return false;
    }
}
