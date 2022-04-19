package day48_encapsulations;

import my_utilities.StringUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {

        int [] a = {4,12,5,25};
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        System.out.println(Math.PI); // this variable is static

        System.out.println(StringUtil.reverse("java"));

    }
}
