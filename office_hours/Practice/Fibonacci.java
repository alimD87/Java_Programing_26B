package Practice;

import java.util.Arrays;

/*
Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.
				Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

				Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

				    Ex:
				        Input:
				            8
				        Output:
				            0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {
    public static int [] fibonacciSeries(int x){
        int[] arr = new int[x];
        for (int i = 0; i < x-2; i++) {
            arr[0]=0;
            arr[1]=1;
            arr[i+2]=arr[i+1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacciSeries(9)));
    }

}
