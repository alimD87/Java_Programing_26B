package day37_wrapper;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 2,550,000,000 result (1.00 second)";
        String [] arr = result.split(" ");

        String resultStr = arr[1].replace(",", "");
        String timeStr = arr[3].substring(1);

        System.out.println(resultStr);
        System.out.println(timeStr);

        long resultNumber = Long.parseLong(resultStr);
        double timeNumber =Double.parseDouble(timeStr);

        if (resultNumber >= 0){
            System.out.println("Test case passed - Positive number");
        }

        if (timeNumber <= 2 && timeNumber >= 0){
            System.out.println("Test case Passed - Under 2 seconds");
        }

    }
}
