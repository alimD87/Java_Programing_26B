package day08_relational_operators;

public class SignType {

    /*
         Task:
            Declare and assign a number

            I want to know the sign of the number
                if the number positive
                is the number negative
                is the number 0
     */

    public static void main(String[] args) {

        int number = 0;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        System.out.println(number  + " is positive: " + isPositive);
        System.out.println(number + " is negative: " + isNegative);
        System.out.println(number + " is zero: " + isZero);


    }


}
