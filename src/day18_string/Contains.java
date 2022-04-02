package day18_string;

public class Contains {
    public static void main(String[] args) {

        String day = "Today it is above 70";
        System.out.println(day.contains("it is")); // true

        System.out.println(day.contains("itis")); // false

        System.out.println(day.contains("ay it")); // true

        System.out.println(day.contains("7")); // true

        System.out.println(day.contains("today")); // false because we had Today with uppercase T

        System.out.println(day.contains("Ti7"));
        /*
        if you wanted to check for specific characters

        day.contains("T") && day.contains("i") && day.contains("7")
         */


    }
}
