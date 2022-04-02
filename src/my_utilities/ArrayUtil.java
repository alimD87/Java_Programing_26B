package my_utilities;

public class ArrayUtil {
         /*
    Min Number
    create a method that will accept an int array and return the smallest number from the array
     */

    public static int minNumber(int[] nums) {

        int min = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /*
    Max Number
    create a method that will accept an int array and return the biggest number from the array
     */

    public static int maxNumber(int[] nums) {

        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

            /*
        Contains
    create a method that will accept an int array and an int number. Check and return if the given number is in the array.
         */

    public static boolean contains(int[] nums, int element) {

        for (int each : nums) {

            if (each == element) {
                return true;
            }

        }

        return false;
    }


    public static int indexOf(String[] strs, String element) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }


    public static int indexOf(int[] nums, int element) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                return i;
            }
        }

        return -1;
    }

    public static int[] addElement(int[] original, int elementToAdd) {
        int[] newArray = new int[original.length + 1];

        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        // Instead of doing a loop ourselves, we could have used Arrays.copyOf()
        newArray[newArray.length - 1] = elementToAdd; // adding the new element to the end of the new array
        return newArray;
    }


    public static int[] addElement(int[] original, int[] elementsToAdd) {

        int[] newArray = new int[original.length + elementsToAdd.length];
        for (int i = 0, j = 0; i < newArray.length; i++) {

            if (i < original.length) {
                // added the elements from the original array in the new array
                newArray[i] = original[i];
            } else {
                // added the new elements to the new array
                newArray[i] = elementsToAdd[j++];
            }

        }


        return newArray;
    }

}


