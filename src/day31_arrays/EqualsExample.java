package day31_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int [] b = {1, 2, 3};
        int [] c = a;

        System.out.println(a == b); // compares the a array with the b array, they are different objects -- not the same
        System.out.println(Arrays.equals(a,b));
        System.out.println(a == c); // compares the a array with the c array, they are both reference to the same array object
        //System.out.println(a.equals(b)); This method is not Arrays.equals()

        boolean same = Arrays.equals(a, b);

        int [] d = {3, 2, 1};
        System.out.println(Arrays.equals(a, d));




    }
}
