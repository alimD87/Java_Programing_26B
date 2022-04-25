package DAY4_04_25_2022.exam.packageB;

import java.util.Arrays;

public class FindForthLargest {
    /*
    - Create a method that returns the 4th largest number of given int array
       Eg;  int[] arr  ={2 , 56 , 0 , 25 , 1 , 75 , 9 , 8}; ---> 9
            int[] arr2 ={1 , 2 , 3 , 9 , 0 };  ---> 1
     */
    public static void main(String[] args) {
        int[] arr ={2 , 65 , 0 , 25 , 1 , 75 , 9 , 8};
        int[] arr2 ={1 , 2 , 3 , 9 , 0 };
       /* System.out.println(solution1(arr));
        System.out.println(solution1(arr2));*/

        FindForthLargest obj = new FindForthLargest();
        System.out.println(obj.solution2(arr));
        System.out.println(obj.solution2(arr2));
    }
    public static int solution1(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-4];
    }
    public int solution2(int[]arr){
        int temp;
        // { 2 , 65 , 0 , 25 , 1 , 75 , 9 , 8 }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1 ; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    temp = arr[i]; // temp=2
                    arr[i] = arr[j]; // arr[i] = 0
                    arr[j] = temp; // arr[j] = 2
                }

            }


        }
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-4];
    }

}
